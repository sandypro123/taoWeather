package com.example.weatherdemo.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import javax.sql.StatementEvent;

public class DBManager {
    public static SQLiteDatabase database;
    public static void initDB(Context context){
        DBHelper dbHelper=new DBHelper(context);
        database=dbHelper.getWritableDatabase();
    }
    public static List<String> queryAllCityName(){
        List<String>cityList=new ArrayList<>();
        Cursor cursor = database.query("info", null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            String s = cursor.getString(cursor.getColumnIndex("city"));
            cityList.add(s);
        }
        return cityList;
    }
    public static int updateInfoByCity(String city,String content){
        ContentValues values = new ContentValues();
        values.put("content",content);
        return database.update("info",values,"city=?",new String[]{city});
    }
    public static long addInfoByCity(String city,String content){
        ContentValues values = new ContentValues();
        values.put("city" ,city);
        values.put("content",content);
        return database.insert("info",null,values);
    }
    public static String queryAllCityName(String city){
        Cursor cursor = database.query("info", null, "city=?", new String[]{city}, null, null, null);
        if (cursor.getCount()>0) {
            cursor.moveToFirst();
            String content = cursor.getString(cursor.getColumnIndex("content"));
            return content;
        }
        return null;
    }
    public static int getCityCount(){
        Cursor cursor = database.query("info", null, null, null, null, null, null);
        int count = cursor.getCount();
        return count;
    }
    public static List<DataBaseBean> queryAllInfo(){
        Cursor cursor = database.query("info", null, null, null, null, null, null);
        List<DataBaseBean> beans=new ArrayList<>();
        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex("_id"));
            String city = cursor.getString(cursor.getColumnIndex("city"));
            String content = cursor.getString(cursor.getColumnIndex("content"));
            DataBaseBean lis = new DataBaseBean(id, city, content);
            beans.add(lis);
        }
        return beans;
    }
    public static int deleteInfoByCity(String city){
       return database.delete("info","city=?",new String[]{city});
    }
    public static void deleteAllInfo(){
        String sql="delete from info";
        database.execSQL(sql);
    }

}
