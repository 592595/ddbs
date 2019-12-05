package com.pan.mapper.oracle_u_2_4_1_1;

import com.pan.dataSource.DataSource;
import com.pan.model.AdminBookViolation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminBookViolationMapper_oracle")
@DataSource("datasource_oracle_u_2_4_1_1")
public interface AdminBookViolationMapper {

    List<AdminBookViolation> selectAllBooks();

    int insertBooks(AdminBookViolation adminBookViolation);

}