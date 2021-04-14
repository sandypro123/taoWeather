package com.example.weatherdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.example.weatherdemo.data.DBManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewPager mainVp;
    ImageView add, more;
    LinearLayout linear;
    List<Fragment> fragmentList;
    List<String> cityList;
    List<ImageView> imageViewList;
    private CityFragmentPagerAdapter adapter;
    private SwipeRefreshLayout swipeRefreshLayout;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    RelativeLayout relativeLayout;
    private int bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = getSharedPreferences("count", MODE_PRIVATE);
        int count = preferences.getInt("count", 0);
        if (count == 0) {
            Intent intent = new Intent(this,IntroduceActivity.class);
            startActivity(intent);
            finish();
            editor = preferences.edit();
            editor.putInt("count", ++count);
            editor.commit();
        }
        relativeLayout = findViewById(R.id.main_out_layout);
        mainVp = findViewById(R.id.MainActivity_vp);
        add = findViewById(R.id.MainActivity_add);
        more = findViewById(R.id.MainActivity_more);
        linear = findViewById(R.id.MainActivity_linear);
        exchangeBg();
        swipeRefreshLayout = findViewById(R.id.swipe_refresh);
        swipeRefreshLayout.setColorSchemeResources(R.color.design_default_color_primary);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(MainActivity.this, "刷新成功", Toast.LENGTH_SHORT).show();
                refresh();
            }
        });
        fragmentList = new ArrayList<>();
        cityList = DBManager.queryAllCityName();
        imageViewList = new ArrayList<>();
        more.setOnClickListener(this);
        add.setOnClickListener(this);
        if (cityList.size() == 0) {
            cityList.add("上海");
        }
        Intent intent = getIntent();
        String city = intent.getStringExtra("city");
        if (!cityList.contains(city) && !TextUtils.isEmpty(city)) {
            cityList.add(city);
        }
        initPager();
        initPoint();
        adapter = new CityFragmentPagerAdapter(getSupportFragmentManager(), fragmentList);
        mainVp.setAdapter(adapter);
        mainVp.setCurrentItem(fragmentList.size() - 1);
        setPagerListener();
    }

    private void refresh() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                });
            }
        }).start();
    }

    private void setPagerListener() {
        mainVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < fragmentList.size(); i++) {
                    imageViewList.get(i).setImageResource(R.mipmap.point);
                }
                imageViewList.get(position).setImageResource(R.mipmap.p);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    private void initPoint() {
        for (int i = 0; i < fragmentList.size(); i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.mipmap.point);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(40, 40));
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            lp.setMargins(0, 0, 10, 0);
            imageViewList.add(imageView);
            linear.addView(imageView);
        }
        imageViewList.get(imageViewList.size() - 1).setImageResource(R.mipmap.p);
    }

    private void initPager() {
        for (int i = 0; i < cityList.size(); i++) {
            CityWeatherFragment cityWeatherFragment = new CityWeatherFragment();
            Bundle bundle = new Bundle();
            bundle.putString("city", cityList.get(i));
            cityWeatherFragment.setArguments(bundle);
            fragmentList.add(cityWeatherFragment);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.MainActivity_add:
                intent.setClass(this, CityManagerActivity.class);
                break;
            case R.id.MainActivity_more:
                intent.setClass(this, MoreActivity.class);
                break;
        }
        startActivity(intent);
    }

    public void exchangeBg() {
        SharedPreferences pref = getSharedPreferences("bg_pref", MODE_PRIVATE);
        bg = pref.getInt("bg", 2);
        switch (bg) {
            case 0:
                relativeLayout.setBackgroundResource(R.mipmap.bg);
                break;
            case 1:
                relativeLayout.setBackgroundResource(R.mipmap.bg1);
                break;
            case 2:
                relativeLayout.setBackgroundResource(R.mipmap.bg2);
                break;
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        List<String> list = DBManager.queryAllCityName();
        if (list.size() == 0) {
            list.add("上海");
        }
        cityList.clear();
        cityList.addAll(list);
        fragmentList.clear();
        initPager();
        adapter.notifyDataSetChanged();
        imageViewList.clear();
        linear.removeAllViews();
        initPoint();
        mainVp.setCurrentItem(fragmentList.size() - 1);

    }
}