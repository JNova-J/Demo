package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnItemLongClickListener;
import com.example.myapplication.Adapter.Myadapter;
import com.example.myapplication.bean.ContextBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Myadapter myadapter = new Myadapter();
        myadapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
                ToastUtils.showShort("我付你路费");
            }
        });
        myadapter.setOnItemLongClickListener(new OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                ToastUtils.showShort("夜里枪声不断，好恐怖");
                return true;
            }
        });
        recyclerView.setAdapter(myadapter);
        List<ContextBean> contextBeans = new ArrayList<>();
        contextBeans.add(new ContextBean("好友信息", "快来叙利亚和我搬砖", "10天前"));
        contextBeans.add(new ContextBean("好友信息", "我在叙利亚板砖一天10万，太爽了", "9天前"));
        contextBeans.add(new ContextBean("好友信息", "兄弟，公司发了我一把AK，我觉得有点不对劲", "9天前"));
        contextBeans.add(new ContextBean("好友信息", "shit，我被卷入了", "8天前"));
        contextBeans.add(new ContextBean("系统信息", "您的好友已经8天没有上线了，点击邀请上线", "2小时前"));
        myadapter.setList(contextBeans);

    }
}