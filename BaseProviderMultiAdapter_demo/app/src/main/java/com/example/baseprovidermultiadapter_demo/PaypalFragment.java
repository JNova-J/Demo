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

public class PaypalFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.paypal_fragment, container, false);
        recyclerView = view.findViewById(R.id.rv_paypal);
        ProviderMultiAdapter friendAdapter=new ProviderMultiAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(friendAdapter);
        List<ContextBean> contextBeans=new ArrayList<>();
        contextBeans.add(new ContextBean("支付成功","您用微信支付成功支付100元","1天前","","",5));
        contextBeans.add(new ContextBean("支付成功","您用支付宝支付成功支付100元","1天前","","",5));

        friendAdapter.setList(contextBeans);
        return view;
    }

}