package com.example.baserecyclerviewadapter_demo.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.baserecyclerviewadapter_demo.Bean.ContextBean;
import com.example.baserecyclerviewadapter_demo.R;


import org.jetbrains.annotations.NotNull;


public class DemoAdapter extends BaseQuickAdapter<ContextBean, BaseViewHolder> {

    public DemoAdapter() {
        super(R.layout.item_demo);
    }


    @Override
    protected void convert(@NotNull BaseViewHolder holder, ContextBean item) {

        holder.setText(R.id.tv_title,item.getTitle())
                .setText(R.id.tv_context,item.getContext())
                .setText(R.id.tv_time,item.getTime());
    }
}
