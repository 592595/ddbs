package com.pan.service;


import com.pan.model.Books;

import java.util.List;

public interface BookService {

    //查询全部的书
    public List<Books> queryAllBook();

    //按名字搜索书
    public Books queryBookByName(String bookName);

    //按图书名字更新库存
    void updateBookInv(int booknum, String bookname);
}
