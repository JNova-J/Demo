package com.example.demo319.Provider;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.demo319.R;
import com.example.demo319.bean.Bean;

import org.jetbrains.annotations.NotNull;

public class PersonalProvider extends BaseItemProvider<Bean> {
    @Override
    public int getItemViewType() {
        return Bean.TYPE_PERSONAL;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_user;
    }

    @Override
    public void convert(@NotNull BaseViewHolder holder, Bean bean) {
        holder.setText(R.id.tv_name,bean.getName())
                .setText(R.id.tv_sex,bean.getSex())
                .setText(R.id.tv_age,bean.getAge());

    }
}
