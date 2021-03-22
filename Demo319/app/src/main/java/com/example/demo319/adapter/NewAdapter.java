package com.example.demo319.adapter;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.example.demo319.Provider.HomeProvider;
import com.example.demo319.Provider.PersonalProvider;
import com.example.demo319.bean.Bean;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NewAdapter extends BaseProviderMultiAdapter<Bean> {
    public NewAdapter() {
        addItemProvider(new HomeProvider());
        addItemProvider(new PersonalProvider());
    }

    @Override
    protected int getItemType(@NotNull List<? extends Bean> list, int i) {
        Bean bean=list.get(i);
        switch (bean.getStatus()){
            case 1:
                return Bean.TYPE_HOME;
            case 2:
                return Bean.TYPE_PERSONAL;
        }
        return 0;
    }
}
