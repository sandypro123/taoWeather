package com.example.weatherdemo;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.weatherdemo.bean.LifeBean;
import com.example.weatherdemo.bean.WeatherBean;
import com.example.weatherdemo.data.DBManager;
import com.google.gson.Gson;

import java.util.List;

public class CityWeatherFragment extends BaseFragment implements View.OnClickListener {
    /*定义CityWeatherFragment相关控件*/
    TextView temp, location, condition, date, wind, air, rayIndex, fatIndex, sugarIndex, clothIndex, carWashIndex, airIndex;
    LinearLayout weekCondition;
    /*添加城市及api接口*/
    String city;
    String Url = "http://hn216.api.yesapi.cn/";
    String key = "32F8B086952047925E77F7F09F120FDC";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_city_weather, container, false);
        initview(view);//创建方法查找相关控件
        /*通过activity传值获取到当前Fragment加载的是哪个地方的天气*/
        Bundle bundle = getArguments();
        city = bundle.getString("city");
        String CityUrl = Url + "?s=App.Common_Weather.LiveWeather&app_key=" + key + "&city=" + city;
        String LifeUrl = Url + "?s=App.Common_Weather.WeekWeather&app_key=" + key + "&city=" + city;
        loadData(CityUrl);//调用父类BaseFragment获取数据方法
        loadIndexUrl(LifeUrl);//获取城市生活指数方法
        return view;
    }

    /*继承重写onSuccess方法*/
    @Override
    public void onSuccess(String result) {
        ParseShowData(result);//解析并展示数据
        int i = DBManager.updateInfoByCity(city, result);
        if (i <= 0) {
            DBManager.addInfoByCity(city, result);
        }
    }

    /*继承重写onError方法*/
    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        //数据库查找上一次信息显示在Fragment当中
        String s = DBManager.queryInfoByCity(city);
        if (!TextUtils.isEmpty(s)) {
            ParseShowData(s);
        }
    }

    private void ParseShowData(String result) {
        WeatherBean weatherBean = new Gson().fromJson(result, WeatherBean.class);//使用Gson解析数据
        WeatherBean.DataDTO.WeatherDTO weather = weatherBean.getData().getWeather();//获取数据中的集合对象
        /*设置城市天气情况*/
        temp.setText(weather.getTem());
        location.setText(weather.getCity());
        condition.setText(weather.getWeather());
        date.setText(weather.getDate());
        wind.setText(weather.getWin());
        air.setText(weather.getAir_level());
    }

    private void initview(View view) {
        temp = view.findViewById(R.id.cityWeatherFragment_temp);
        location = view.findViewById(R.id.cityWeatherFragment_location);
        condition = view.findViewById(R.id.cityWeatherFragment_condition);
        date = view.findViewById(R.id.cityWeatherFragment_date);
        wind = view.findViewById(R.id.cityWeatherFragment_wind);
        air = view.findViewById(R.id.cityWeatherFragment_air);
        rayIndex = view.findViewById(R.id.cityWeatherFragment_ray);
        fatIndex = view.findViewById(R.id.cityWeatherFragment_fat);
        sugarIndex = view.findViewById(R.id.cityWeatherFragment_sugar);
        clothIndex = view.findViewById(R.id.cityWeatherFragment_cloth);
        carWashIndex = view.findViewById(R.id.cityWeatherFragment_carWash);
        airIndex = view.findViewById(R.id.cityWeatherFragment_airIndex);
        weekCondition = view.findViewById(R.id.cityWeatherFragment_linear);
        rayIndex.setOnClickListener(this);
        fatIndex.setOnClickListener(this);
        sugarIndex.setOnClickListener(this);
        clothIndex.setOnClickListener(this);
        carWashIndex.setOnClickListener(this);
        airIndex.setOnClickListener(this);
    }
/*创建线程进行指数信息获取*/
    private void loadIndexUrl(final String LifeUrl) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String content = HttpUtils.getJsonContent(LifeUrl);
                Message msg = handler.obtainMessage();//将数据进行传输
                msg.what = 100;
                msg.obj = content;
                handler.sendMessage(msg);
            }
        }).start();
    }

    /*设置一周天气和生活指数信息集合，并对传输过来的数据进行解析和设置*/
    List<LifeBean.DataDTO.WeatherDTO> weekWeather;
    List<LifeBean.DataDTO.WeatherDTO.IndexDTO> lifeIndex;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            if (msg.what == 100) {
                String json = (String) msg.obj;
                LifeBean lifeBean = new Gson().fromJson(json, LifeBean.class);//对数据进行解析
                lifeIndex = lifeBean.getData().getWeather().get(0).getIndex();
                weekWeather = lifeBean.getData().getWeather();
                weekWeather.remove(0);
                for (int i = 0; i < weekWeather.size(); i++) {
                    View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_center_city, null);
                    view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                    weekCondition.addView(view);
                    TextView weekDate = view.findViewById(R.id.item_date);
                    TextView weekCondition = view.findViewById(R.id.item_condition);
                    TextView weekTemp = view.findViewById(R.id.item_temp);
                    weekDate.setText(weekWeather.get(i).getDate());
                    weekCondition.setText(weekWeather.get(i).getWea());
                    weekTemp.setText(weekWeather.get(i).getTem());
                }
            }
        }
    };

    /*对相关生活指数控件添加点击事件*/
    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());//创建构造器AlertDialog.Builder的对象
        switch (v.getId()) {
            case R.id.cityWeatherFragment_ray:
                builder.setTitle("紫外线指数");
                String msg = lifeIndex.get(0).getDesc();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.cityWeatherFragment_fat:
                builder.setTitle("减肥指数");
                String msg1 = lifeIndex.get(1).getDesc();
                builder.setMessage(msg1);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.cityWeatherFragment_sugar:
                builder.setTitle("血糖指数");
                String msg2 = lifeIndex.get(2).getDesc();
                builder.setMessage(msg2);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.cityWeatherFragment_cloth:
                builder.setTitle("穿衣指数");
                String msg3 = lifeIndex.get(3).getDesc();
                builder.setMessage(msg3);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.cityWeatherFragment_carWash:
                builder.setTitle("洗车指数");
                String msg4 = lifeIndex.get(0).getDesc();
                builder.setMessage(msg4);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.cityWeatherFragment_airIndex:
                builder.setTitle("空气指数");
                String msg5 = lifeIndex.get(0).getDesc();
                builder.setMessage(msg5);
                builder.setPositiveButton("确定", null);
                break;
        }
        builder.create().show();//调用方法让对话框在界面显示
    }
}