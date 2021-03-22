package com.example.baseprovidermultiadapter_demo.Bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class ContextBean {
    public static final int TYPE_SYSTEM = 11;
    public static final int TYPE_ATTENTION = 22;
    public static final int TYPE_GIFT = 33;


    private String title;
    private String context;
    private String time;
    private String name;
    private String activity;
    private int status;//1.系统通知  2.关注   3.礼物  4活动   5支付

    public ContextBean(String title, String context, String time, String name, String activity, int status) {
        this.title = title;
        this.context = context;
        this.time = time;
        this.name = name;
        this.activity = activity;
        this.status = status;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

