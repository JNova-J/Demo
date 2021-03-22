package com.example.demo_to319;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

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

public class PersonalFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.personal_fragment,container,false);

        recyclerView=view.findViewById(R.id.rv_personal);
        MoreMuAdapter moreMuAdapter=new MoreMuAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(moreMuAdapter);
        List<UserBean> userBeans = new ArrayList<>();
        userBeans.add(new UserBean("李明", "男", "78", "", "", 2));
        userBeans.add(new UserBean("张三", "女", "41", "", "", 2));
        userBeans.add(new UserBean("王五", "男", "22", "", "", 2));
        moreMuAdapter.setList(userBeans);
        return view;
    }
}
