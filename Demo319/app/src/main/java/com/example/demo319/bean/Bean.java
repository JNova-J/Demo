package com.example.demo319.bean;

public class Bean {
    public static final int TYPE_HOME=11;
    public static final int TYPE_PERSONAL=22;

    private String name;
    private String context;
    private String sex;
    private String age;
    private String writer;
    private int status;

    public Bean(String name, String context, String sex, String age, String writer,int status) {
        this.name = name;
        this.context = context;
        this.sex = sex;
        this.age = age;
        this.writer=writer;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
