package com.example.demo_to319.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.example.demo_to319.Provider.HomeProvider;
import com.example.demo_to319.Provider.ListProvider;
import com.example.demo_to319.Provider.PersonalProvider;
import com.example.demo_to319.bean.UserBean;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MoreMuAdapter extends BaseProviderMultiAdapter<UserBean> {
    public MoreMuAdapter() {
        addItemProvider(new HomeProvider());
        addItemProvider(new PersonalProvider());
        addItemProvider(new ListProvider());
    }

    @Override
    protected int getItemType(@NotNull List<? extends UserBean> list, int i) {
        UserBean userBean=list.get(i);
        switch (userBean.getStatus()){
            case 1:
                return UserBean.TYPE_HOME;
            case 2:
                return UserBean.TYPE_PERSONAL;
            case 3:
                return UserBean.TYPE_LIST;

        }
        return 0;
    }
}
