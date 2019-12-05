package com.pan.mapper.oracle_u_2_4_1_1;

import com.pan.dataSource.DataSource;
import com.pan.model.AdminBook;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminBookMapper_oracle")
@DataSource("datasource_oracle_u_2_4_1_1")
public interface AdminBookMapper {

    List<AdminBook> selectAllBooks();

    int deleteBooks(String id_book);


}