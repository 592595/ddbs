package com.pan.mapper.postgresql_u_2_4_1_3;

import com.pan.dataSource.DataSource;
import com.pan.model.AdminBook;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminBookMapper_postgresql")
@DataSource("datasource_postgresql_u_2_4_1_3")
public interface AdminBookMapper {

    List<AdminBook> selectAllBooks();

    int deleteBooks(String id_book);
}