package com.example.slidingtablayout_demo2.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.slidingtablayout_demo2.Bean.ContextBean;
import com.example.slidingtablayout_demo2.Bean.OrderBean;
import com.example.slidingtablayout_demo2.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class OrderAdapter extends BaseMultiItemQuickAdapter<OrderBean, BaseViewHolder> {
    public OrderAdapter() {
        addItemType(OrderBean.TYPE_TO_SEND, R.layout.item_order_to_send);
        addItemType(OrderBean.TYPE_TO_RECEIVE, R.layout.item_order_to_receive);
        addItemType(OrderBean.TYPE_REFUND, R.layout.item_order_refund);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, OrderBean item) {
        holder.setText(R.id.tv_orderId,item.getOrderNo())
                .setText(R.id.tv_order_title,item.getTitle())
                .setText(R.id.tv_order_child_title,item.getChildtitle())
                .setText(R.id.tv_order_price,item.getPrice())
                .setText(R.id.tv_total_price,item.getTotalprice())
                .setText(R.id.tv_order_size,item.getSize());
        }
    }
