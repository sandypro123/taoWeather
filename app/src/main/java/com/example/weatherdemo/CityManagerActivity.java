package com.example.weatherdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.weatherdemo.data.DBManager;
import com.example.weatherdemo.data.DataBaseBean;

import java.util.ArrayList;
import java.util.List;

public class CityManagerActivity extends AppCompatActivity implements View.OnClickListener {
    /*定义相关控件*/
    ImageView back, write, addCity;
    ListView cityLV;
    List<DataBaseBean> mData;//显示列表的数据源
    private CityManagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_manager);
        back = findViewById(R.id.CityManagerActivity_back);
        write = findViewById(R.id.CityManagerActivity_write);
        addCity = findViewById(R.id.CityManagerActivity_plus);
        back.setOnClickListener(this);
        write.setOnClickListener(this);
        addCity.setOnClickListener(this);
        cityLV = findViewById(R.id.CityManagerActivity_ListView);
        mData = new ArrayList<>();
        adapter = new CityManagerAdapter(this, mData);
        cityLV.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<DataBaseBean> list = DBManager.queryAllInfo();
        mData.clear();
        mData.addAll(list);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.CityManagerActivity_back:
                finish();
                break;
            case R.id.CityManagerActivity_plus:
                int i = DBManager.getCityCount();
                if (i < 5) {
                    Intent intent = new Intent();
                    intent.setClass(this, SearchCityActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "添加城市过多，请删除后重新添加", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.CityManagerActivity_write:
                Intent intent1 = new Intent();
                intent1.setClass(this, DeleteCityActivity.class);
                startActivity(intent1);
                break;
        }
    }
}