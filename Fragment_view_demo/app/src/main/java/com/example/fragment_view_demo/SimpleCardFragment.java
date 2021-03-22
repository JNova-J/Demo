package com.example.fragment_view_demo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SimpleCardFragment extends Fragment {

    public static SimpleCardFragment newInstance(String title) {

        Bundle args = new Bundle();
        args.putString("title", title);
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
        View view = inflater.inflate(R.layout.activity_simple_card_fragment, null);
        TextView card_title_tv = view.findViewById(R.id.card_title_tv);
        card_title_tv.setText(getArguments().getString("title"));
        return view;
    }
}