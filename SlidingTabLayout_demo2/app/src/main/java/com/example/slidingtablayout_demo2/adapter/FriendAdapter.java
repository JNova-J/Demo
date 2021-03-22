package com.example.slidingtablayout_demo2.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.slidingtablayout_demo2.Bean.ContextBean;
import com.example.slidingtablayout_demo2.Bean.OrderBean;
import com.example.slidingtablayout_demo2.R;

import org.jetbrains.annotations.NotNull;

public class FriendAdapter extends BaseMultiItemQuickAdapter<ContextBean, BaseViewHolder> {

    public FriendAdapter() {
        addItemType(ContextBean.TYPE_TO_ONE, R.layout.item_system);
        addItemType(ContextBean.TYPE_TO_TWO, R.layout.item_gift);
        addItemType(ContextBean.TYPE_TO_THREE, R.layout.item_friend);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, ContextBean item) {

        holder.setText(R.id.tv_time, item.getTime())
        .setText(R.id.tv_context, item.getContext());

        switch (holder.getItemViewType()) {
            case ContextBean.TYPE_TO_ONE:
                holder.setText(R.id.tv_title, item.getTitle());
                break;
            case ContextBean.TYPE_TO_TWO:
                holder.setText(R.id.tv_friend_name, item.getName())
                      .setText(R.id.tv_system_active, item.getActivity());
                break;
            default:
                holder.setText(R.id.tv_friend_name, item.getName());
                break;
        }

    }
}
