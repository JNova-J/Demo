package com.example.baseprovidermultiadapter_demo.Provider;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.baseprovidermultiadapter_demo.Bean.ContextBean;
import com.example.baseprovidermultiadapter_demo.R;

import org.jetbrains.annotations.NotNull;

public class AttentionProvider extends BaseItemProvider<ContextBean> {
    @Override
    public int getItemViewType() {
        return ContextBean.TYPE_ATTENTION;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_friend;
    }

    @Override
    public void convert(@NotNull BaseViewHolder holder, ContextBean item) {

        holder.setText(R.id.tv_time, item.getTime())
                .setText(R.id.tv_context, item.getContext())
                .setText(R.id.tv_friend_name, item.getName());
    }
}
