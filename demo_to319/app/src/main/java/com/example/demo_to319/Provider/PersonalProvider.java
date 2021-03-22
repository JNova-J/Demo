package com.example.demo_to319.Provider;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.demo_to319.R;
import com.example.demo_to319.bean.UserBean;

import org.jetbrains.annotations.NotNull;

public class PersonalProvider extends BaseItemProvider<UserBean> {
    @Override
    public int getItemViewType() {
        return UserBean.TYPE_PERSONAL;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_user;
    }

    @Override
    public void convert(@NotNull BaseViewHolder holder, UserBean item) {
        holder.setText(R.id.tv_name,item.getName())
                .setText(R.id.tv_sex,item.getSex())
                .setText(R.id.tv_age,item.getAge());

    }
}
