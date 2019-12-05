package com.pan.service;


import com.pan.model.AdminBook;

import java.util.List;

public interface AdminBookService {
    public List<AdminBook> findAllBook();
    public int deleteBooks(String id_book);
}