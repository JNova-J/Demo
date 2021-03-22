package com.example.myapplication.bean;

public class ContextBean {
    private String title;
    private String context;
    private String time;

    public ContextBean(String title, String context, String time) {
        this.title = title;
        this.context = context;
        this.time = time;
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
