package com.pan.model;

import java.io.Serializable;

public class InventoryBook implements Serializable {
    private  String book_id;
    private  String book_name;
    private  String inventory;
    private  Integer selled_count;
    private  Integer book_count_sum;

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public Integer getSelled_count() {
        return selled_count;
    }

    public void setSelled_count(Integer selled_count) {
        this.selled_count = selled_count;
    }

    public Integer getBook_count_sum() {
        return book_count_sum;
    }

    public void setBook_count_sum(Integer book_count_sum) {
        this.book_count_sum = book_count_sum;
    }
}
