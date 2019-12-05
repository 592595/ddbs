package com.pan.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class OrderInfo implements Serializable {
    private String order_id;
    private String buyer_id;
    private String seller_id;
    private String book_name;
    private Integer book_count;
    private Float book_price;
    private Timestamp ordered_time;
    private Float order_sum;
    private String buyer_address;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Integer getBook_count() {
        return book_count;
    }

    public void setBook_count(Integer book_count) {
        this.book_count = book_count;
    }

    public Float getBook_price() {
        return book_price;
    }

    public void setBook_price(Float book_price) {
        this.book_price = book_price;
    }

    public Timestamp getOrdered_time() {
        return ordered_time;
    }

    public void setOrdered_time(Timestamp ordered_time) {
        this.ordered_time = ordered_time;
    }

    public Float getOrder_sum() {
        return order_sum;
    }

    public void setOrder_sum(Float order_sum) {
        this.order_sum = order_sum;
    }

    public String getBuyer_address() {
        return buyer_address;
    }

    public void setBuyer_address(String buyer_address) {
        this.buyer_address = buyer_address;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "order_id='" + order_id + '\'' +
                ", buyer_id='" + buyer_id + '\'' +
                ", seller_id='" + seller_id + '\'' +
                ", book_name='" + book_name + '\'' +
                ", book_count=" + book_count +
                ", book_price=" + book_price +
                ", ordered_time=" + ordered_time +
                ", order_sum=" + order_sum +
                ", buyer_address='" + buyer_address + '\'' +
                '}';
    }
}
