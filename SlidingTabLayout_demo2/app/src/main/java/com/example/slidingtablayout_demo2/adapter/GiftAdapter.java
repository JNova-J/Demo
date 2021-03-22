package com.example.slidingtablayout_demo2.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.slidingtablayout_demo2.Bean.GiftBean;
import com.example.slidingtablayout_demo2.R;

import org.jetbrains.annotations.NotNull;

public class GiftAdapter extends BaseQuickAdapter<GiftBean, BaseViewHolder> {
    public GiftAdapter() {
        super(R.layout.item_gift);
    }


    @Override
    protected void convert(@NotNull BaseViewHolder holder, GiftBean item) {


    }
}
