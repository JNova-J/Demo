package com.example.recyclerviewdemo318;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.blankj.utilcode.util.ToastUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnItemLongClickListener;
import com.example.recyclerviewdemo318.adapter.MyAdapter;
import com.example.recyclerviewdemo318.bean.ContextBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_main);
        MyAdapter myAdapter=new MyAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
        myAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
                ToastUtils.showShort("good");
            }
        });
        myAdapter.setOnItemLongClickListener(new OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                ToastUtils.showShort("bad apple");
                return true;
            }
        });
        List<ContextBean> contextBeans = new ArrayList<>();
        contextBeans.add(new ContextBean("好友信息", "出来玩", "10天前"));
        contextBeans.add(new ContextBean("好友信息", "出来玩出来玩出来玩", "9天前"));
        contextBeans.add(new ContextBean("好友信息", "出来玩出来玩出来玩出来玩", "9天前"));
        contextBeans.add(new ContextBean("好友信息", "我在楼下等你", "8天前"));
        contextBeans.add(new ContextBean("系统信息", "你怎么还不下楼", "2小时前"));
        myAdapter.setList(contextBeans);


    }
}