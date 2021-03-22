package com.example.reviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.reviewpager.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdActivity extends Activity {
    private ViewPager viewPager;
    private LinearLayout linearLayout;
    private List<ImageView> imageViews = new ArrayList<ImageView>();
    private List<ImageView> pointViews = new ArrayList<ImageView>();
    ImageView point;
    int[] drawable = {R.drawable.bg_bottom, R.drawable.bg_top, R.drawable.bg_re, R.drawable.bg_re0};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);
        viewPager = findViewById(R.id.vp);
        linearLayout = findViewById(R.id.layout);
        for (int i = 0; i < 4; i++) {
            ImageView iv = new ImageView(this);
            iv.setImageResource(drawable[i]);
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageViews.add(iv);
            viewPager.setAdapter(new MyAdapter(imageViews));
            point = new ImageView(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(20, 200);
            layoutParams.leftMargin = 20;
            point.setImageResource(R.drawable.ic_check_success);
            point.setMaxHeight(20);
            point.setMaxWidth(20);
            point.setLayoutParams(layoutParams);
            pointViews.add(point);
            linearLayout.addView(point);
        }
        pointViews.get(1).setImageResource(R.drawable.ic_check_null);
        pointViews.get(2).setImageResource(R.drawable.ic_check_null);
        pointViews.get(3).setImageResource(R.drawable.ic_check_null);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < pointViews.size(); i++) {
                    if (position == i) {
                        pointViews.get(i).setImageResource(R.drawable.ic_check_success);
                    } else pointViews.get(i).setImageResource(R.drawable.ic_check_null);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}