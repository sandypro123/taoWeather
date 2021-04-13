package com.example.weatherdemo.Boarding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.weatherdemo.R;

import java.util.ArrayList;
import java.util.List;

public class IntroductoryActivity extends AppCompatActivity {
LottieAnimationView lottieAnimationView1,lottieAnimationView2;
ImageView birthday;
List<Fragment> fragmentList;
private ViewPager viewPager;
private BoardingAdapter boardingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);
        OnBoardingFragment3 fragment3=new OnBoardingFragment3();
        fragmentList=new ArrayList<>();
        lottieAnimationView1=findViewById(R.id.introduce_play);
        lottieAnimationView1.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        lottieAnimationView2=findViewById(R.id.introduce_happy);
        lottieAnimationView2.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        birthday=findViewById(R.id.birthday);
        birthday.animate().translationY(-2200).setDuration(1000).setStartDelay(4000);
        fragmentList.add(fragment3);
        boardingAdapter = new BoardingAdapter(getSupportFragmentManager(), fragmentList);
        viewPager=findViewById(R.id.pager);
        viewPager.setAdapter(boardingAdapter);

    }

}