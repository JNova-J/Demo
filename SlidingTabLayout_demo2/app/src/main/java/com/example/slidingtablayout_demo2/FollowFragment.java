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

import java.util.ArrayList;
import java.util.List;

public class FollowFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_follow,null);
        recyclerView=view.findViewById(R.id.rv_follow);
        FriendAdapter friendAdapter=new FriendAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(friendAdapter);
        List<ContextBean> contextBeans=new ArrayList<>();
        contextBeans.add(new ContextBean("","关注了你","1天前","可可西里的喵","",3));
        contextBeans.add(new ContextBean("","关注了你","1天前","一人芳华","",3));

        friendAdapter.setList(contextBeans);

        return view;
    }
}