package com.example.weatherdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.weatherdemo.data.DBManager;

import java.util.ArrayList;
import java.util.List;

public class DeleteCityActivity extends AppCompatActivity implements View.OnClickListener {
ImageView error,right;
ListView listView;
List<String>mData;
    List<String>deleteCity;
    private DeleteCityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_city);
        error=findViewById(R.id.delete_error);
        right=findViewById(R.id.delete_right);
        listView=findViewById(R.id.delete_listView);
        mData=DBManager.queryAllCityName();
        error.setOnClickListener(this);
        right.setOnClickListener(this);
        deleteCity=new ArrayList<>();
        adapter = new DeleteCityAdapter(this, mData, deleteCity);
        listView.setAdapter(adapter);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.delete_error:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("提示信息").setMessage("您确定舍弃更改吗").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    finish();
                    }
                });
                builder.setNegativeButton("取消",null);
                builder.create().show();
                break;
            case R.id.delete_right:
                for (int i = 0; i < deleteCity.size(); i++) {
                    String city = deleteCity.get(i);
                    DBManager.deleteInfoByCity(city);
                }
                finish();
                break;
        }
    }
}