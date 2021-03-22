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

public class PersonalFragment extends Fragment {
private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_personal,container,false);
        recyclerView=view.findViewById(R.id.rv_personal);
        NewAdapter newAdapter=new NewAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(newAdapter);
        List<Bean> userBeans = new ArrayList<>();
        userBeans.add(new Bean("李明", "", "男", "78", "", 2));
        userBeans.add(new Bean("张三", "", "女", "41", "", 2));
        userBeans.add(new Bean("王五", "", "男", "22", "",2));

        newAdapter.setList(userBeans);
        return view;
    }
}