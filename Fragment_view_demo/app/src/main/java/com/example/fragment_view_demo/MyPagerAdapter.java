package com.example.fragment_view_demo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private String[] mTitles;
    private ArrayList<Fragment> fragments;

    public MyPagerAdapter(@NonNull FragmentManager fm,String[] mTitles, ArrayList<Fragment> fragments) {
        super(fm);
        this.mTitles = mTitles;
        this.fragments = fragments;
    }

    public MyPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
    public CharSequence getPageTitle(int position){
        return mTitles[position];
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
