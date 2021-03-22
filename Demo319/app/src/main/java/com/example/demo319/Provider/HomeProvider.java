package com.example.demo319.Provider;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.demo319.R;
import com.example.demo319.bean.Bean;

import org.jetbrains.annotations.NotNull;

public class HomeProvider extends BaseItemProvider<Bean> {
    @Override
    public int getItemViewType() {
        return Bean.TYPE_HOME;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_home;
    }

    @Override
    public void convert(@NotNull BaseViewHolder holder, Bean bean) {
        holder.setText(R.id.tv_name,bean.getName())
                .setText(R.id.tv_context,bean.getContext())
                .setText(R.id.tv_writer,bean.getWriter());

    }
}
