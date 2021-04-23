package com.example.weatherdemo;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*城市生活指数获取*/
public class HttpUtils {
    public static String getJsonContent(String path) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();//创建内存流
        try {
            URL url = new URL(path);//将路径转换成Url对象
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            InputStream inputStream = conn.getInputStream();
            int hasRead = 0;
            byte[] buf = new byte[1024];
            while ((hasRead = inputStream.read(buf)) != -1) {
                stream.write(buf, 0, hasRead);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return stream.toString();
    }
}
