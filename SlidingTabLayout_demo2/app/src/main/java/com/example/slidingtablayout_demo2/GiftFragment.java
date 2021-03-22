package com.example.slidingtablayout_demo2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.slidingtablayout_demo2.Bean.ContextBean;
import com.example.slidingtablayout_demo2.Bean.GiftBean;
import com.example.slidingtablayout_demo2.adapter.FriendAdapter;
import com.example.slidingtablayout_demo2.adapter.GiftAdapter;

import java.util.ArrayList;
import java.util.List;

public class GiftFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_gift, container, false);
        recyclerView=view.findViewById(R.id.rv_gift);
        FriendAdapter friendAdapter=new FriendAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(friendAdapter);
        List<ContextBean> contextBeans=new ArrayList<>();
        contextBeans.add(new ContextBean("","100爱心值","1天前","可可西里的喵","送了一朵花给你",2));
        contextBeans.add(new ContextBean("","100爱心值","1天前","嘟嘟哦","送了一朵花给你",2));
        friendAdapter.setList(contextBeans);


        return view;
    }
}