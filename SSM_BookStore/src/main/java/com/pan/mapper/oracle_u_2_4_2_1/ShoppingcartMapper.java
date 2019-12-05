package com.pan.mapper.oracle_u_2_4_2_1;

import com.pan.dataSource.DataSource;
import com.pan.model.Books;
import com.pan.model.Shoppingcarts;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ShoppingcartMapper_oracle")
@DataSource("datasource_oracle_u_2_4_2_1")
public interface ShoppingcartMapper {
    //在购物车中搜索图书是否存在
    Shoppingcarts queryBookByName(@Param("bookName") String bookName);
    //在购物车中加入一本书
    int addBook(Books books);
    //在购物车中更新一种书的数量
    int updateBookSum(Books books);
    //显示购物车中全部的书籍
    List<Shoppingcarts> queryAllShoppingcarts();
    //删除购物车中的一条记录
    void DeletebyBookName(@Param("bookName") String bookName);
}