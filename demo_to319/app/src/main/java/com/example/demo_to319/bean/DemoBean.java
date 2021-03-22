package com.example.demo_to319.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class DemoBean implements MultiItemEntity {
    public static final int TYPE_PERSONAL = 11;
    public static final int TYPE_HOME = 22;
    public static final int TYPE_LIST = 33;

    private String name;
    private String sex;
    private String age;
    private String writer;
    private String context;
    private int status;

    public DemoBean(String name, String sex, String age, String context, String writer, int status) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.context = context;
        this.writer = writer;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int getItemType() {
        if (status == 1) {
            return TYPE_HOME;
        } else if (status == 2) {
            return TYPE_PERSONAL;
        } else
            return TYPE_LIST;
    }
}
