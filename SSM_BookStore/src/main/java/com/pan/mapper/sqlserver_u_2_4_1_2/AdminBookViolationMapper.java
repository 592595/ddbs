package com.pan.mapper.sqlserver_u_2_4_1_2;

        import com.pan.dataSource.DataSource;
        import com.pan.model.AdminBookViolation;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository("AdminBookViolationMapper_sqlserver")
@DataSource("datasource_sqlserver_u_2_4_1_2")
public interface AdminBookViolationMapper {

    List<AdminBookViolation> selectAllBooks();

    int insertBooks(AdminBookViolation adminBookViolation);
}