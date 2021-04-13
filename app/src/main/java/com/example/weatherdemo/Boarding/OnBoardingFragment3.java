package com.example.weatherdemo.Boarding;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.airbnb.lottie.LottieAnimationView;
import com.example.weatherdemo.MainActivity;
import com.example.weatherdemo.R;

public class OnBoardingFragment3 extends Fragment {
    LottieAnimationView lottieAnimationView1;
    Button button;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_on_boarding3,container,false);
        lottieAnimationView1=view.findViewById(R.id.boarding3_welcome);
        lottieAnimationView1.animate().translationY(1600).setDuration(1000).setStartDelay(10000);
        button=view.findViewById(R.id.enter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
