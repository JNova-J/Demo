package com.example.baserecyclerviewadapter_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildLongClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnItemLongClickListener;
import com.example.baserecyclerviewadapter_demo.Bean.ContextBean;
import com.example.baserecyclerviewadapter_demo.adapter.DemoAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_main);
        DemoAdapter demoAdapter=new DemoAdapter();
//        demoAdapter.setOnItemClickListener(new OnItemClickListener() {
//            @Override
//            public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
//
//                ToastUtils.showShort(position+"VIP","toast");
//            }
//        });
//        demoAdapter.setOnItemLongClickListener(new OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
//                ToastUtils.showLong(position+"VIP","toast");
//                return true;
//            }
//        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(demoAdapter);
        List<ContextBean> contextBeans = new ArrayList<>();
        contextBeans.add(new ContextBean("VIP信息", "现在充值一年VIP，送1个月VIP，限时7天", "1个月前"));
        contextBeans.add(new ContextBean("VIP信息", "现在充值一年VIP，送6个月VIP，限时3天", "15天前"));
        contextBeans.add(new ContextBean("VIP信息", "现在充值一年VIP，送9个月VIP，限时2天", "10天前"));
        contextBeans.add(new ContextBean("VIP信息", "现在充值一年VIP，送12个月VIP，限时7天", "8天前"));
        contextBeans.add(new ContextBean("系统信息", "买一送一你都不充？您已被封禁", "2小时前"));
        demoAdapter.setList(contextBeans);


    }
}