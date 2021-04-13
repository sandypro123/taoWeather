package com.example.weatherdemo;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtils {
    public static String getJsonContent(String path){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {
            URL url = new URL(path);
            HttpURLConnection conn= (HttpURLConnection) url.openConnection();
            InputStream inputStream = conn.getInputStream();
            int hasRead=0;
            byte[]buf=new byte[1024];
            while ((hasRead=inputStream.read(buf))!=-1){
                stream.write(buf,0,hasRead);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return stream.toString();
    }
}
