package com.example.recyclerviewdemo318.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.recyclerviewdemo318.R;
import com.example.recyclerviewdemo318.bean.ContextBean;

import org.jetbrains.annotations.NotNull;

public class MyAdapter extends BaseQuickAdapter<ContextBean, BaseViewHolder> {
    public MyAdapter() {
        super(R.layout.item_table);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, ContextBean item) {
        holder.setText(R.id.tv_title,item.getTitle())
                .setText(R.id.tv_context,item.getContext())
                .setText(R.id.tv_time,item.getTime());

    }
}
