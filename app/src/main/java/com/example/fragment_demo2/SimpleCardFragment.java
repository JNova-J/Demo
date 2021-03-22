package com.example.fragment_demo2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SimpleCardFragment extends Fragment {
    public static SimpleCardFragment newInstance(String title) {

        Bundle args = new Bundle();
        args.putString("title",title);
        SimpleCardFragment fragment = new SimpleCardFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_simple_card_fragment,container,false);
        TextView textView=view.findViewById(R.id.card_title_tv);
        textView.setText(getArguments().getString("title"));
        return view;
    }
}