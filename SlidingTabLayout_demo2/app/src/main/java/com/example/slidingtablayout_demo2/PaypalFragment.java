package com.example.slidingtablayout_demo2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.slidingtablayout_demo2.Bean.ContextBean;
import com.example.slidingtablayout_demo2.Bean.OrderBean;
import com.example.slidingtablayout_demo2.adapter.FriendAdapter;
import com.example.slidingtablayout_demo2.adapter.OrderAdapter;

import java.util.ArrayList;
import java.util.List;

public class PaypalFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_paypal, container, false);
        recyclerView = view.findViewById(R.id.rv_paypal);
        FriendAdapter friendAdapter=new FriendAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(friendAdapter);
        List<ContextBean> contextBeans=new ArrayList<>();
        contextBeans.add(new ContextBean("支付成功","您用微信支付成功支付100元","1天前","","",1));
        contextBeans.add(new ContextBean("支付成功","您用支付宝支付成功支付100元","1天前","","",1));

        friendAdapter.setList(contextBeans);
        return view;
    }
}