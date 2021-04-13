package com.example.weatherdemo;

import android.app.Application;

import com.example.weatherdemo.data.DBManager;

import org.xutils.x;

public class UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        DBManager.initDB(this);
    }
}
