package com.example.demo_to319;

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

import com.example.demo_to319.Adapter.BaseAdapter;
import com.example.demo_to319.Adapter.MoreMuAdapter;
import com.example.demo_to319.Adapter.MuAdapter;
import com.example.demo_to319.bean.UserBean;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home_fragment,container,false);
        recyclerView=view.findViewById(R.id.rv_home);
        //MuAdapter baseAdapter=new MuAdapter();
        //BaseAdapter baseAdapter=new BaseAdapter();
        MoreMuAdapter baseAdapter=new MoreMuAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(baseAdapter);
        List<UserBean> userBeans=new ArrayList<>();
        userBeans.add(new UserBean("朦胧诗","","","恍惚中是辉煌镜中王国","贾宝玉",1));
        userBeans.add(new UserBean("十四行诗","","","厄运是幸运的代名词","莎士比亚",1));
        userBeans.add(new UserBean("悲剧","","","此处应有雷鸣般的喝彩","莎士比亚",1));
        userBeans.add(new UserBean("逃出困境吧","","","此处应有雷鸣般的喝彩","",3));
        userBeans.add(new UserBean("突入其来的死亡","","","没想到会成为地狱的一员","",3));
        userBeans.add(new UserBean("把头摇起来吧","","","超不妙","",3));

        baseAdapter.setList(userBeans);
        return view;
    }
}