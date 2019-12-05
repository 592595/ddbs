package com.pan.model;


import java.io.Serializable;
import java.sql.Date;

public class BookInfo implements Serializable {
    private String book_id;
    private String book_name;
    private String author;
    private Double book_price;
    private String publishing_house;
    private String book_type;
    private Date publishing_time;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getBook_price() {
        return book_price;
    }

    public void setBook_price(Double book_price) {
        this.book_price = book_price;
    }

    public String getPublishing_house() {
        return publishing_house;
    }

    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }

    public String getBook_type() {
        return book_type;
    }

    public void setBook_type(String book_type) {
        this.book_type = book_type;
    }

    public Date getPublishing_time() {
        return publishing_time;
    }

    public void setPublishing_time(Date publishing_time) {
        this.publishing_time = publishing_time;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "book_id='" + book_id + '\'' +
                ", book_name='" + book_name + '\'' +
                ", author='" + author + '\'' +
                ", book_price=" + book_price +
                ", publishing_house='" + publishing_house + '\'' +
                ", book_type='" + book_type + '\'' +
                ", publishing_time=" + publishing_time +
                ", inventory=" + inventory +
                '}';
    }
}
