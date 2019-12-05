package com.pan.model;



public class Shoppingcarts {

    public String getId_buyer() {
        return id_buyer;
    }

    public void setId_buyer(String id_buyer) {
        this.id_buyer = id_buyer;
    }

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

    public int getSum_book() {
        return sum_book;
    }

    public void setSum_book(int sum_book) {
        this.sum_book = sum_book;
    }

    public int getPrice_book() {
        return price_book;
    }

    public void setPrice_book(int price_book) {
        this.price_book = price_book;
    }

    private String id_buyer;

    private String name_book;

    private String id_seller;

    private int sum_book;

    private int price_book;
}
