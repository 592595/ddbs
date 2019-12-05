package com.pan.service;


import com.pan.model.Books;
import com.pan.model.Shoppingcarts;

import java.util.List;

public interface ShoppingcartsService {
    //在购物车中查询一本书的记录
    public Shoppingcarts queryBookByName(String bookname);
    //在购物车中新加一本书的记录
    public int addBook(Books books);
    //在购物车使得一本书的数量加一
    public int updateBookSum(Books books);
    //显示购物车中全部书籍
    public List<Shoppingcarts> queryAllShoppingcarts();
    //删除购物车中的一条记录
    void  DeleteByBookname(String bookName);
}
