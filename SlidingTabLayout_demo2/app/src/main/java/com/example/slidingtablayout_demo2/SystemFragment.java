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
import com.example.slidingtablayout_demo2.adapter.FriendAdapter;
import com.example.slidingtablayout_demo2.adapter.OrderAdapter;

import java.util.ArrayList;
import java.util.List;

public class SystemFragment extends Fragment {
    private RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_system,container,false);
        recyclerView=view.findViewById(R.id.rv_system);
        FriendAdapter friendAdapter=new FriendAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(friendAdapter);
        List<ContextBean> contextBeans=new ArrayList<>();
        contextBeans.add(new ContextBean("版本更新","新版本已经发布，请及时更新","1天前","","",1));
        contextBeans.add(new ContextBean("系统通知","充值100送20豆，限时不容错过","1天前","","",1));
        friendAdapter.setList(contextBeans);
        return view;
    }
}