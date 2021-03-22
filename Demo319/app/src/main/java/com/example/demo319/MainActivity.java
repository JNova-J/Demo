package com.example.demo319;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.example.demo319.adapter.MyAdapter;
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
        slidingTabLayout=findViewById(R.id.stl_main);
        ArrayList<Fragment> fragments=new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new PersonalFragment());
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager(),fragments));
        slidingTabLayout.setViewPager(viewPager,new String[]{"首页","个人"});
        }
        }