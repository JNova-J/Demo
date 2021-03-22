package com.example.homework;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;

public class Provider extends BaseItemProvider<Bean> {
    @Override
    public int getItemViewType() {
        return Bean.TYPE_HOME;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_home_fragment;
    }

    @Override
    public void convert(@NotNull BaseViewHolder baseViewHolder, Bean bean) {

    }
}
