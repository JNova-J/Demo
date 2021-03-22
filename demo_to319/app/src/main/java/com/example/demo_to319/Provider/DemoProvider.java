package com.example.demo_to319.Provider;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.demo_to319.R;
import com.example.demo_to319.bean.UserBean;

import org.jetbrains.annotations.NotNull;

public class DemoProvider extends BaseItemProvider<UserBean> {
    @Override
    public int getItemViewType() {
        return UserBean.TYPE_LIST;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_home_list;
    }

    @Override
    public void convert(@NotNull BaseViewHolder baseViewHolder, UserBean userBean) {

    }
}
