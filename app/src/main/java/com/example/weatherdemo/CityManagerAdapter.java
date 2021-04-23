package com.example.weatherdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.weatherdemo.bean.WeatherBean;
import com.example.weatherdemo.data.DataBaseBean;
import com.google.gson.Gson;

import java.util.List;

public class CityManagerAdapter extends BaseAdapter {
    Context context;
    List<DataBaseBean>mData;

    public CityManagerAdapter(Context context, List<DataBaseBean> mData) {
        this.context = context;
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null) {
            convertView= LayoutInflater.from(context).inflate(R.layout.item_city_manager,null);
            holder=new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        DataBaseBean bean = mData.get(position);
        holder.cityTV.setText(bean.getCity());
        WeatherBean weatherBean = new Gson().fromJson(bean.getContent(), WeatherBean.class);
        holder.windTV.setText(weatherBean.getData().getWeather().getWin());
        holder.tempTV.setText(weatherBean.getData().getWeather().getTem());
        holder.conTV.setText(weatherBean.getData().getWeather().getWeather());
        return convertView;
    }
    class ViewHolder{
        TextView cityTV,conTV,tempTV,windTV;
        public ViewHolder(View view) {
            cityTV=view.findViewById(R.id.item_city_manager_city);
            conTV=view.findViewById(R.id.item_city_manager_condition);
            tempTV=view.findViewById(R.id.item_city_manager_temp);
            windTV=view.findViewById(R.id.item_city_tv_wind);
        }
    }
}
