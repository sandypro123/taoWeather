package com.example.weatherdemo.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/*数据库创建*/
public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {//构造方法
        super(context, "forecast.db", null, 1);//调用父类的构造方法
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建表的操作
        String sql = "create table info(_id integer primary key autoincrement,city varchar(20) unique not null,content text not null)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
