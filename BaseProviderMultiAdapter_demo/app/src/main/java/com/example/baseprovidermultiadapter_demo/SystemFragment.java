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

public class SystemFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.system_fragment, container, false);
        recyclerView = view.findViewById(R.id.rv_system);
        ProviderMultiAdapter providerMultiAdapter = new ProviderMultiAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(providerMultiAdapter);
        List<ContextBean> contextBeans = new ArrayList<>();
        contextBeans.add(new ContextBean("版本更新", "新版本已经发布，请及时更新", "1天前", "", "", 1));
        contextBeans.add(new ContextBean("系统通知", "充值100送20豆，限时不容错过", "1天前", "", "", 1));
        contextBeans.add(new ContextBean("", "关注了你", "1天前", "可可西里的喵", "", 2));
        contextBeans.add(new ContextBean("", "关注了你", "1天前", "一人芳华", "", 2));
        contextBeans.add(new ContextBean("", "100爱心值", "1天前", "可可西里的喵", "送了一朵花给你", 3));
        contextBeans.add(new ContextBean("", "100爱心值", "1天前", "嘟嘟哦", "送了一朵花给你", 3));
        contextBeans.add(new ContextBean("报名成功", "您成功报名了【秋季聚餐行动】，请记得按时参加", "1天前", "", "", 4));
        contextBeans.add(new ContextBean("活动提醒", "您报名的【秋季聚餐行动】即将开始，请记得按时参加", "1天前", "", "", 4));
        contextBeans.add(new ContextBean("支付成功", "您用微信支付成功支付100元", "1天前", "", "", 5));
        contextBeans.add(new ContextBean("支付成功", "您用支付宝支付成功支付100元", "1天前", "", "", 5));
        providerMultiAdapter.setList(contextBeans);
        return view;
    }
}