package com.example.weatherdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weatherdemo.data.DBManager;

public class MoreActivity extends AppCompatActivity implements View.OnClickListener {
    TextView bgTv, cacheTv, versionTv, shareTv;
    RadioGroup exbgRg;
    ImageView backIv;
    private SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        bgTv = findViewById(R.id.more_tv_changeBg);
        cacheTv = findViewById(R.id.more_tv_cache);
        versionTv = findViewById(R.id.more_tv_version);
        shareTv = findViewById(R.id.more_tv_share);
        exbgRg = findViewById(R.id.more_rg);
        backIv = findViewById(R.id.more_iv_back);
        bgTv.setOnClickListener(this);
        cacheTv.setOnClickListener(this);
        shareTv.setOnClickListener(this);
        backIv.setOnClickListener(this);
        String versionName = getVersionName();
        versionTv.setText("当前版本" + versionName);
        setRGListener();
        pref = getSharedPreferences("bg_pref", MODE_PRIVATE);
    }

    private void setRGListener() {
        exbgRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int bg = pref.getInt("bg", 0);
                SharedPreferences.Editor editor = pref.edit();
                Intent intent = new Intent(MoreActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                switch (checkedId) {
                    case R.id.more_rg_green:
                        if (bg == 0) {
                            Toast.makeText(MoreActivity.this, "选择的为当前背景，无需改变", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        editor.putInt("bg",0);
                        editor.commit();
                        break;
                    case R.id.more_rg_pink:
                        if (bg == 1) {
                            Toast.makeText(MoreActivity.this, "选择的为当前背景，无需改变", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        editor.putInt("bg",1);
                        editor.commit();
                        break;
                    case R.id.more_rg_blue:
                        if (bg == 2) {
                            Toast.makeText(MoreActivity.this, "选择的为当前背景，无需改变", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        editor.putInt("bg",2);
                        editor.commit();
                        break;
                }
                startActivity(intent);
            }
        });
    }

    private String getVersionName() {
        PackageManager packageManager = getPackageManager();
        String versionName = null;
        try {
            PackageInfo info = packageManager.getPackageInfo(getPackageName(), 0);
            versionName = info.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionName;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.more_tv_changeBg:
                if(exbgRg.getVisibility()==View.VISIBLE){
                    exbgRg.setVisibility(View.GONE);
                }else {
                    exbgRg.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.more_tv_cache:
                cleanCache();
                break;
            case R.id.more_tv_share:
                shareSoftwareMsg("桃气App是一款天气软件");
                break;
            case R.id.more_iv_back:
                finish();
                break;
        }
    }

    private void shareSoftwareMsg(String s) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(intent, "桃气"));
    }

    private void cleanCache() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("提示信息").setMessage("确定清除所有缓存吗？");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                DBManager.deleteAllInfo();
                Toast.makeText(MoreActivity.this, "已清除全部缓存", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MoreActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        }).setNegativeButton("取消", null);
        builder.create().show();
    }
}