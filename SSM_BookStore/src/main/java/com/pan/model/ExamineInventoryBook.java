package com.pan.model;

import java.io.Serializable;


public class ExamineInventoryBook implements Serializable {
    private String book_id;
    private String book_name;
    private Integer inventory;

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

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "ExamineInventoryBook{" +
                "book_id='" + book_id + '\'' +
                ", book_name='" + book_name + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
