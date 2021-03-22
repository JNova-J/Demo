package com.example.demo_to319.Adapter;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.example.demo_to319.Provider.DemoProvider;
import com.example.demo_to319.bean.UserBean;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DemoAdapter extends BaseProviderMultiAdapter<UserBean> {
    public DemoAdapter() {
        addItemProvider(new DemoProvider());
    }

    @Override
    protected int getItemType(@NotNull List<? extends UserBean> list, int i) {
        UserBean userBean=list.get(i);
        switch (userBean.getStatus()){
            case 1:
                break;
        }
        return 0;
    }
}
