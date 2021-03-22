package com.example.demo_to319.Adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.demo_to319.R;
import com.example.demo_to319.bean.DemoBean;
import com.example.demo_to319.bean.UserBean;

import org.jetbrains.annotations.NotNull;

public class DemoDemoAdapter extends BaseMultiItemQuickAdapter<DemoBean, BaseViewHolder> {
    public DemoDemoAdapter() {
        addItemType(DemoBean.TYPE_HOME, R.layout.item_user);
        addItemType(DemoBean.TYPE_LIST,R.layout.item_user);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, DemoBean item) {
        holder.setText(R.id.tv_context,item.getAge());
        switch (item.getItemType()){
            case DemoBean.TYPE_HOME:
                break;
        }
    }
}
