package com.example.fragment_view_demo;

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

import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnTabSelectListener {

    private Context context = this;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private final String[] mTitles = {"热门", "IOS", "android", "前端", "后端", "设计", "工具资源"};
    private MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (String title : mTitles) {
            fragments.add(SimpleCardFragment.newInstance(title));
        }
        View decorView = getWindow().getDecorView();
        ViewPager vp = ViewFindUtils.find(decorView, R.id.vp);
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(myPagerAdapter);
        SlidingTabLayout tabLayout_5 = ViewFindUtils.find(decorView, R.id.tl_5);
        tabLayout_5.setViewPager(vp);
    }

    @Override
    public void onTabSelect(int position) {
        Toast.makeText(context, "onTabSelect&posotion-->" + position, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onTabReselect(int position) {
        Toast.makeText(context, "onTabReselect&posotion-->" + position, Toast.LENGTH_SHORT).show();

    }

    public class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }
}