package com.example.baseprovidermultiadapter_demo;

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

import com.example.baseprovidermultiadapter_demo.Adapter.ProviderMultiAdapter;
import com.example.baseprovidermultiadapter_demo.Bean.ContextBean;

import java.util.ArrayList;
import java.util.List;

public class ActivityFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_fragment,container,false);
        recyclerView=view.findViewById(R.id.rv_activity);
        ProviderMultiAdapter friendAdapter=new ProviderMultiAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(friendAdapter);
        List<ContextBean> contextBeans=new ArrayList<>();
        contextBeans.add(new ContextBean("报名成功","您成功报名了【秋季聚餐行动】，请记得按时参加","1天前","","",4));
        contextBeans.add(new ContextBean("活动提醒","您报名的【秋季聚餐行动】即将开始，请记得按时参加","1天前","","",4));
        friendAdapter.setList(contextBeans);
        return view;
    }

}