package com.example.slidingtablayout_demo2.Bean;

public class GiftBean {
    private String name;
    private String activity;
    private String context;
    private String time;

    public GiftBean(String name, String activity, String context, String time) {
        this.name = name;
        this.activity = activity;
        this.context = context;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
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
