package com.example.fragment_demo2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context = this;
    private ArrayList<Fragment> fragments1 = new ArrayList<>();
    private String[] titles = {"首页", "信息", "联系人", "更多"};
    private int[] mIconUnselectIds = {
            R.mipmap.tab_home_unselect, R.mipmap.tab_speech_unselect,
            R.mipmap.tab_contact_unselect, R.mipmap.tab_more_unselect
    };
    private int[] mIconSelectIds = {
            R.mipmap.tab_home_select, R.mipmap.tab_speech_select,
            R.mipmap.tab_contact_select, R.mipmap.tab_more_select
    };
    private ArrayList<CustomTabEntity> customTabEntities = new ArrayList<>();
    private View view;
    private ViewPager viewPager;
    private CommonTabLayout commonTabLayout;
    private CommonTabLayout commonTabLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (String title : titles) {
            fragments1.add(SimpleCardFragment.newInstance(title));

        }
        for (int i = 0; i < titles.length; i++) {
            customTabEntities.add(new TabEntity(titles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }
        view = getWindow().getDecorView();
        viewPager = ViewFindUtils.find(view, R.id.vp_2);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        commonTabLayout = ViewFindUtils.find(view, R.id.tl_1);
        commonTabLayout2=ViewFindUtils.find(view,R.id.tl_2);
        commonTabLayout.setTabData(customTabEntities);

        tl_2();
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }


        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments1.get(position);
        }

        @Override
        public int getCount() {
            return fragments1.size();
        }
    }

    /**
     *
     *
     */
    private void tl_2(){
        commonTabLayout2.setTabData(customTabEntities);
        commonTabLayout2.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                commonTabLayout2.setCurrentTab(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setCurrentItem(1);
    }

}