package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private SlidingTabLayout slidingTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.vp);

        slidingTabLayout=findViewById(R.id.sl_main);
        ArrayList<Fragment> fragments=new ArrayList<>();
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager(),fragments));
        slidingTabLayout.setViewPager(viewPager,new String[]{""});
    }
}