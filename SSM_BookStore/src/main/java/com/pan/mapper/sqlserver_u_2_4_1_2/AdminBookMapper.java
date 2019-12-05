package com.pan.mapper.sqlserver_u_2_4_1_2;

import com.pan.dataSource.DataSource;
import com.pan.model.AdminBook;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminBookMapper_sqlserver")
@DataSource("datasource_sqlserver_u_2_4_1_2")
public interface AdminBookMapper {

    List<AdminBook> selectAllBooks();

    int deleteBooks(String id_book);
}