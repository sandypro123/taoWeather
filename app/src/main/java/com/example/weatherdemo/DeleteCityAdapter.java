package com.example.weatherdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DeleteCityAdapter extends BaseAdapter {
    Context context;
    List<String>mData;
    List<String>deleteCity;

    public DeleteCityAdapter(Context context, List<String> mData, List<String> deleteCity) {
        this.context = context;
        this.mData = mData;
        this.deleteCity = deleteCity;
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
            convertView= LayoutInflater.from(context).inflate(R.layout.item_deletecity,null);
            holder=new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
         final String city = mData.get(position);
        holder.textView.setText(city);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mData.remove(city);
                deleteCity.add(city);
                notifyDataSetChanged();

            }
        });
        return convertView;
    }
    class ViewHolder{
        TextView textView;
        ImageView imageView;
        public ViewHolder(View view){
            textView=view.findViewById(R.id.item_delete_tv);
            imageView=view.findViewById(R.id.item_delete_iv);

        }
    }
}
