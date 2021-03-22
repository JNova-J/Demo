package com.example.baseprovidermultiadapter_demo.Provider;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.baseprovidermultiadapter_demo.Bean.ContextBean;
import com.example.baseprovidermultiadapter_demo.R;

import org.jetbrains.annotations.NotNull;

public class GiftProvider extends BaseItemProvider<ContextBean> {
    @Override
    public int getItemViewType() {
        return ContextBean.TYPE_GIFT;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_gift;
    }

    @Override
    public void convert(@NotNull BaseViewHolder holder, ContextBean item) {

        holder.setText(R.id.tv_time, item.getTime())
                .setText(R.id.tv_context, item.getContext())
                .setText(R.id.tv_friend_name, item.getName())
                .setText(R.id.tv_system_active, item.getActivity());
    }
}
