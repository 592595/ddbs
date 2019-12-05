package com.pan.model;



public class Books {

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public String getId_seller() {
        return id_seller;
    }

    public void setId_seller(String id_seller) {
        this.id_seller = id_seller;
    }

    public int getInv_book() {
        return inv_book;
    }

    public void setInv_book(int inv_book) {
        this.inv_book = inv_book;
    }

    public int getPrice_book() {
        return price_book;
    }

    public void setPrice_book(int price_book) {
        this.price_book = price_book;
    }

    private String name_book;//图书名

    private String id_seller;//商家编号

    private int inv_book;//图书库存

    private int price_book;//图书单价

}
