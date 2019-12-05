package com.pan.mapper.postgresql_u_2_4_1_3;

import com.pan.dataSource.DataSource;
import com.pan.model.AdminBookViolation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdminBookViolationMapper_postgresql")
@DataSource("datasource_postgresql_u_2_4_1_3")
public interface AdminBookViolationMapper {

    List<AdminBookViolation> selectAllBooks();

    int insertBooks(AdminBookViolation adminBookViolation);
}