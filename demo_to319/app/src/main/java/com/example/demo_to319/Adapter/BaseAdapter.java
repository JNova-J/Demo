package com.example.demo_to319.Adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.demo_to319.R;
import com.example.demo_to319.bean.UserBean;

import org.jetbrains.annotations.NotNull;

public class BaseAdapter extends BaseQuickAdapter<UserBean, BaseViewHolder> {
    public BaseAdapter() {
        super(R.layout.item_user);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, UserBean item) {
        holder.setText(R.id.tv_name, item.getName())
                .setText(R.id.tv_sex, item.getSex())
                .setText(R.id.tv_age, item.getAge());
    }
}
