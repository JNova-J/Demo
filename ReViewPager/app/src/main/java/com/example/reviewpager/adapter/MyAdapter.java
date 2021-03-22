package com.example.reviewpager.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class MyAdapter extends PagerAdapter {
    private List<ImageView> imageViews;

    public MyAdapter(List<ImageView> imageViews) {
        this.imageViews = imageViews;
    }

    @Override
    public int getCount() {
        return imageViews.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(imageViews.get(position));
        return imageViews.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(imageViews.get(position));
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
}
