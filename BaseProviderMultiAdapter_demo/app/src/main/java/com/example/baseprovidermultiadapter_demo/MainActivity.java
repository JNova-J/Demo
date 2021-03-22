package com.example.baseprovidermultiadapter_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.baseprovidermultiadapter_demo.Adapter.PagerAdapter;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private SlidingTabLayout slidingTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpager);
        slidingTabLayout=findViewById(R.id.slt_1);
        ArrayList<Fragment> fragments=new ArrayList<>();
        fragments.add(new SystemFragment());
        fragments.add(new FollowFragment());
        fragments.add(new GiftFragment());
        fragments.add(new ActivityFragment());
        fragments.add(new PaypalFragment());
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(),fragments));
        slidingTabLayout.setViewPager(viewPager,new String[]{"系统","关注","礼物","活动","支付"});


    }
}