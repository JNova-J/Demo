package com.example.slidingtablayout_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.blankj.utilcode.util.FragmentUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    FellowMeFragment fellowMeFragment = new FellowMeFragment();
    MeFellowFragment meFellowFragment = new MeFellowFragment();
    private String[] titles = {"我关注的", "关注我的"};
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private SlidingTabLayout slidingTabLayout;
    private PageAdapter pageAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager=findViewById(R.id.viewpager);
        Fragment fragment1 = fellowMeFragment;
        Fragment fragment2 = meFellowFragment;
        fragments.add(fragment1);
        fragments.add(fragment2);
        pageAdapter = new PageAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(pageAdapter);
        slidingTabLayout = findViewById(R.id.sl_tab);
        slidingTabLayout.setViewPager(viewPager, titles);
    }
}