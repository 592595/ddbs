package com.pan.model;

import java.sql.Timestamp;

public class Orders {//订单实体类
    private String id_order;
    private String id_seller;
    private String name_book;
    private int sum_book;
    private int price_book;
    private int price_order;
    private Timestamp time_order;



    public String getTime_order() {
        return time_order.toString();
    }

    public void setTime_order(Timestamp time_order) {
        this.time_order = time_order;
    }

    private String address_buyer;

    public String getId_order() {
        return id_order;
    }

    public void setId_order(String id_order) {
        this.id_order = id_order;
    }

    public String getId_seller() {
        return id_seller;
    }

    public void setId_seller(String id_seller) {
        this.id_seller = id_seller;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public int getSum_book() {
        return sum_book;
    }

    public void setSum_book(int sum_book) {
        this.sum_book = sum_book;
    }

    public double getPrice_book() {
        return price_book;
    }

    public void setPrice_book(int price_book) {
        this.price_book = price_book;
    }

    public double getPrice_order() {
        return price_order;
    }

    public void setPrice_order(int price_order) {
        this.price_order = price_order;
    }

    public String getAddress_buyer() {
        return address_buyer;
    }

    public void setAddress_buyer(String address_buyer) {
        this.address_buyer = address_buyer;
    }
}
