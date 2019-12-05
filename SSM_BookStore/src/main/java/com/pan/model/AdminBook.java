package com.pan.model;


import java.sql.Date;

public class AdminBook {
    public String getId_book() {
        return id_book;
    }

    public void setId_book(String id_book) {
        this.id_book = id_book;
    }

    public String getId_seller() {
        return id_seller;
    }

    public void setId_seller(String id_seller) {
        this.id_seller = id_seller;
    }

    public String getName__book() {
        return name__book;
    }

    public void setName__book(String name__book) {
        this.name__book = name__book;
    }

    public Integer getPrice_book() {
        return price_book;
    }

    public void setPrice_book(Integer price_book) {
        this.price_book = price_book;
    }

    public String getPress_book() {
        return press_book;
    }

    public void setPress_book(String press_book) {
        this.press_book = press_book;
    }

    public Date getTime_book() {
        return time_book;
    }

    public void setTime_book(Date time_book) {
        this.time_book = time_book;
    }

    public Integer getSum__book() {
        return sum__book;
    }

    public void setSum__book(Integer sum__book) {
        this.sum__book = sum__book;
    }

    public String getType_book() {
        return type_book;
    }

    public void setType_book(String type_book) {
        this.type_book = type_book;
    }

    private String id_book;

    private String id_seller;

    private String name__book;

    private Integer price_book;

    private String press_book;

    private Date time_book;

    private Integer sum__book;

    private String type_book;

}
