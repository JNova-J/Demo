package com.example.myapplication.Adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.myapplication.R;
import com.example.myapplication.bean.ContextBean;

import org.jetbrains.annotations.NotNull;

public class Myadapter extends BaseQuickAdapter<ContextBean, BaseViewHolder> {
    public Myadapter() {
        super(R.layout.item_list);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, ContextBean item) {
        holder.setText(R.id.tv_title,item.getTitle())
                .setText(R.id.tv_context,item.getContext())
                .setText(R.id.tv_time,item.getTime());

    }
}
