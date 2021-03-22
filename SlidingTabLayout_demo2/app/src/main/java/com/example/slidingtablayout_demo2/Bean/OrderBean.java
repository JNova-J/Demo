package com.example.slidingtablayout_demo2.Bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class OrderBean implements MultiItemEntity {
    public static final int TYPE_TO_SEND = 11;
    public static final int TYPE_TO_RECEIVE = 22;
    public static final int TYPE_REFUND = 33;

    private String name;
    private String orderNo;
    private String title;
    private String childtitle;
    private String price;
    private String totalprice;
    private String size;
    private int status;//1.待发货   2.待收货   3.退款


    public OrderBean(int status,String name, String orderNo, String title, String childtitle, String price, String totalprice, String size) {
        this.status = status;
        this.name = name;
        this.orderNo = orderNo;
        this.title = title;
        this.childtitle = childtitle;
        this.price = price;
        this.totalprice = totalprice;
        this.size = size;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChildtitle() {
        return childtitle;
    }

    public void setChildtitle(String childtitle) {
        this.childtitle = childtitle;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public int getItemType() {
        if (status == 1) {
            return TYPE_TO_SEND;
        } else if (status == 2) {
            return TYPE_TO_RECEIVE;
        } else {
            return TYPE_REFUND;
        }
    }
}
