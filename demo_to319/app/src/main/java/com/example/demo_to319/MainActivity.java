package com.example.demo_to319;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.example.demo_to319.Adapter.MyAdapter;
import com.flyco.tablayout.SlidingTabLayout;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private SlidingTabLayout slidingTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.vp);
        slidingTabLayout = findViewById(R.id.stl_main);
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new PersonalFragment());
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager(), fragments));
        slidingTabLayout.setViewPager(viewPager,new String[]{"主页","个人"});
    }
}