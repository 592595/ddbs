package com.pan.mapper.sqlserver_u_2_4_2_2;

import com.pan.dataSource.DataSource;
import com.pan.model.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("BookMapper_sqlserver")
@DataSource("datasource_sqlserver_u_2_4_2_2")
public interface BookMapper {

    //查询全部的书
    List<Books> queryAllBook();

    //搜索一本书
    Books queryBookByName(@Param("bookName") String bookName);

    //按名字更新一本书的库存
    void updateBookInv(@Param("bookNum") int booknum, @Param("bookName") String bookName);
}
