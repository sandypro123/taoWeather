package com.example.weatherdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;

public class SearchCityActivity extends AppCompatActivity{
EditText searchEt;
ImageView searchIv;
GridView searchGv;
String[]hotCity={"北京","上海","南京","天津","西安","重庆","成都","哈尔滨","大庆","六安"};
String city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);
        searchEt=findViewById(R.id.search_edit);
        searchIv=findViewById(R.id.search_search);
        searchGv=findViewById(R.id.search_gv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.item_hotcity, hotCity);
        searchGv.setAdapter(adapter);
        searchGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                city = hotCity[position];
                sendmsg();
            }
        });
        searchIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                city= searchEt.getText().toString();
                sendmsg();
            }
        });
    }

    public void sendmsg() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("city",city);
        startActivity(intent);
    }
}

