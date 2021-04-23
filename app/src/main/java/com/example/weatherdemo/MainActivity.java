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
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.SDKInitializer;
import com.example.weatherdemo.data.DBManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /*定义主界面相关控件*/
    ViewPager mainVp;
    ImageView add, more;
    LinearLayout linear;
    RelativeLayout relativeLayout;
    /*定义CityWeatherFragment相关内容*/
    List<Fragment> fragmentList;//ViewPager数据源
    List<String> cityList;//要显示城市的集合
    List<ImageView> imageViewList;//表示ViewPager页数指示器集合
    private CityFragmentPagerAdapter adapter;
    /**/
    private SwipeRefreshLayout swipeRefreshLayout;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private int bg;

    /*对百度SDK相关量进行定义*/
    TextView text;//定位地点
    LocationClient mLocClient;//定位类
    String tempcoor = "gcj02";//按照百度默认经纬度进行定位
    String cityLocation;//获取得到的定位地点

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SDKInitializer.initialize(getApplicationContext());//在使用SDK各组件之前初始化context信息，传入ApplicationContext，该方法需要在setContentView方法之前使用
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.testLocation);
        mLocClient = new LocationClient(getApplicationContext());//创建LocationClient实例
        mLocClient.registerLocationListener(LocationListener);//注册监听器，定位成功后回调
        initLocation();//设置定位属性
        mLocClient.start();//开始定位
        mLocClient.requestLocation();//请求定位，异步返回，结果在locationListener中获取，0：离线定位请求成功 1:service没有启动 2：无监听函数 6：两次请求时间太短

        preferences = getSharedPreferences("count", MODE_PRIVATE);
        int count = preferences.getInt("count", 0);
        if (count == 0) {
            Intent intent = new Intent(this, IntroduceActivity.class);
            startActivity(intent);
            finish();
            editor = preferences.edit();
            editor.putInt("count", ++count);
            editor.commit();
        }
        /*查找主界面相关控件*/
        relativeLayout = findViewById(R.id.main_out_layout);
        mainVp = findViewById(R.id.MainActivity_vp);
        add = findViewById(R.id.MainActivity_add);
        more = findViewById(R.id.MainActivity_more);
        linear = findViewById(R.id.MainActivity_linear);
        /*为控件添加点击事件*/
        more.setOnClickListener(this);
        add.setOnClickListener(this);
        /**/
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
        /*对CityWeatherFragment相关内容进行初始化*/
        fragmentList = new ArrayList<>();
        imageViewList = new ArrayList<>();
        cityList = DBManager.queryAllCityName();//获取数据库包含的城市列表
        /*对初始CityList进行添加*/
        if (cityList.size() == 0) {
            cityList.add("上海");
        }
        /**/
        Intent intent = getIntent();
        String city = intent.getStringExtra("city");
        if (!cityList.contains(city) && !TextUtils.isEmpty(city)) {
            cityList.add(city);
        }
        /*初始化ViewPager页面方法*/
        initPager();
        /*创建小圆点指示器*/
        initPoint();
        /*向ViewPager中添加CityFragmentPagerAdapter*/
        adapter = new CityFragmentPagerAdapter(getSupportFragmentManager(), fragmentList);
        mainVp.setAdapter(adapter);
        mainVp.setCurrentItem(fragmentList.size() - 1);//设置将最后一个城市的信息作为当前界面
        /*设置ViewPager页面监听*/
        setPagerListener();
    }

    /*实现BDAbstractLocationListener接口*/
    BDAbstractLocationListener LocationListener = new BDAbstractLocationListener() {
        @Override
        public void onReceiveLocation(BDLocation bdLocation) {
            if (bdLocation == null) {
                return;
            }
            text.setText(bdLocation.getCity());
            cityLocation = bdLocation.getCity();
        }
    };

    /*在activity执行onDestroy时执行unRegisterLocationListener，取消之前注册的 BDAbstractLocationListener 定位监听函数*/
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mLocClient != null) {
            mLocClient.unRegisterLocationListener(LocationListener);
            mLocClient = null;
        }
    }

    /*对定位参数进行设置*/
    private void initLocation() {
        LocationClientOption option = new LocationClientOption();
        option.setLocationMode(LocationClientOption.LocationMode.Battery_Saving);//将定位模式设定为低功耗模式
        option.setCoorType(tempcoor);//将坐标类型设定为国测局类型
        option.setScanSpan(0);//设置扫描间隔，单位是毫秒 当<1000(1s)时，定时定位无效
        option.setIsNeedAddress(true);//设置是否需要地址信息，默认为无地址
        option.setOpenGps(true);//是否打开gps进行定位
        option.setLocationNotify(true);// 可选，默认false，设置是否当gps有效时按照1S1次频率输出GPS结果
        option.setIgnoreKillProcess(true);//设置是否退出定位进程
        mLocClient.setLocOption(option);
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
        /*设置监听事件*/
        mainVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            /*将选中界面与其他界面下方指示器设置为不同图案*/
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
        //创建小圆点ViewPager页面指示器的函数
        for (int i = 0; i < fragmentList.size(); i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.mipmap.point);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(40, 40));
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            lp.setMargins(0, 0, 10, 0);
            imageViewList.add(imageView);
            linear.addView(imageView);
        }
        imageViewList.get(imageViewList.size() - 1).setImageResource(R.mipmap.p);//将最后一个界面小圆点设置不同
    }

    private void initPager() {
        /*创建Fragment对象，添加到ViewPager数据源当中*/
        for (int i = 0; i < cityList.size(); i++) {
            CityWeatherFragment cityWeatherFragment = new CityWeatherFragment();
            Bundle bundle = new Bundle();//将添加城市信息传送到CityWeatherFragment当中
            bundle.putString("city", cityList.get(i));
            cityWeatherFragment.setArguments(bundle);
            fragmentList.add(cityWeatherFragment);
        }
    }

    /*点击相对应控件进行跳转*/
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