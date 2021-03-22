package com.example.baseprovidermultiadapter_demo.Adapter;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.example.baseprovidermultiadapter_demo.Bean.ContextBean;
import com.example.baseprovidermultiadapter_demo.Provider.AttentionProvider;
import com.example.baseprovidermultiadapter_demo.Provider.GiftProvider;
import com.example.baseprovidermultiadapter_demo.Provider.SystemProvider;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ProviderMultiAdapter extends BaseProviderMultiAdapter<ContextBean> {
    public ProviderMultiAdapter() {
        super();
        addItemProvider(new SystemProvider());
        addItemProvider(new GiftProvider());
        addItemProvider(new AttentionProvider());
    }

    @Override
    protected int getItemType(@NotNull List<? extends ContextBean> list, int i) {
        ContextBean contextBean = list.get(i);
        switch (contextBean.getStatus()) {
            case 1:
            case 4:
            case 5:
            default:
                return ContextBean.TYPE_SYSTEM;
            case 2:
                return ContextBean.TYPE_ATTENTION;
            case 3:
                return ContextBean.TYPE_GIFT;
        }

    }
}