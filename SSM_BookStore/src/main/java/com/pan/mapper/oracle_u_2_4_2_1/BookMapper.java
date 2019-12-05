package com.pan.mapper.oracle_u_2_4_2_1;

import com.pan.dataSource.DataSource;
import com.pan.model.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("BookMapper_oracle")
@DataSource("datasource_oracle_u_2_4_2_1")
public interface BookMapper {
    //增加一本书
    //int addBook(Books books);

    //删除一本书
    //int deleteBookById(@Param("bookID") int id);

    //更新一本书的库存
    void updateBookInv(@Param("bookNum") int booknum, @Param("bookName") String bookName);


    //查询全部的书
    List<Books> queryAllBook();

    //搜索一本书
    Books queryBookByName(@Param("bookName") String bookName);
}
