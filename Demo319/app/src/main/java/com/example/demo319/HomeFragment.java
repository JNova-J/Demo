package com.example.demo319;

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

import com.example.demo319.adapter.NewAdapter;
import com.example.demo319.bean.Bean;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.rv_home);
        NewAdapter newAdapter = new NewAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,true));
        recyclerView.setAdapter(newAdapter);
        List<Bean> userBeans = new ArrayList<>();
        userBeans.add(new Bean("朦胧诗", "恍惚中是辉煌镜中王国", "", "", "北岛", 1));
        userBeans.add(new Bean("十四行诗", "厄运是幸运的代名词", "", "", "莎士比亚", 1));
        userBeans.add(new Bean("悲剧", "此处应有雷鸣般的喝彩", "", "", "莎士比亚", 1));
        userBeans.add(new Bean("朦胧诗", "恍惚中是辉煌镜中王国", "", "", "北岛", 1));
        userBeans.add(new Bean("十四行诗", "厄运是幸运的代名词", "", "", "莎士比亚", 1));
        userBeans.add(new Bean("悲剧", "此处应有雷鸣般的喝彩", "", "", "莎士比亚", 1));
        userBeans.add(new Bean("朦胧诗", "恍惚中是辉煌镜中王国", "", "", "北岛", 1));
        userBeans.add(new Bean("十四行诗", "厄运是幸运的代名词", "", "", "莎士比亚", 1));
        userBeans.add(new Bean("悲剧", "此处应有雷鸣般的喝彩", "", "", "莎士比亚", 1));
        userBeans.add(new Bean("朦胧诗", "恍惚中是辉煌镜中王国", "", "", "北岛", 1));
        userBeans.add(new Bean("十四行诗", "厄运是幸运的代名词", "", "", "莎士比亚", 1));
        userBeans.add(new Bean("悲剧", "此处应有雷鸣般的喝彩", "", "", "莎士比亚", 1));
        userBeans.add(new Bean("朦胧诗", "恍惚中是辉煌镜中王国", "", "", "北岛", 1));
        userBeans.add(new Bean("十四行诗", "厄运是幸运的代名词", "", "", "莎士比亚", 1));
        userBeans.add(new Bean("悲剧", "此处应有雷鸣般的喝彩", "", "", "莎士比亚", 1));
        newAdapter.setList(userBeans);
        return view;
    }
}