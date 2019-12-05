package com.pan.service.Impl;

import com.pan.model.AdminBook;
import com.pan.service.AdminBookService;
import com.pan.util.DataSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminBookServiceImpl implements AdminBookService {

    @Autowired
    private com.pan.mapper.oracle_u_2_4_1_1.AdminBookMapper AdminBookMapper_oracle;
    @Autowired
    private com.pan.mapper.sqlserver_u_2_4_1_2.AdminBookMapper AdminBookMapper_sqlserver;
    @Autowired
    private com.pan.mapper.postgresql_u_2_4_1_3.AdminBookMapper AdminBookMapper_postgresql;

    @Override
    public List<AdminBook> findAllBook() {
        List<AdminBook> list = null;
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_1_1")) {
            list = (List<AdminBook>) AdminBookMapper_oracle.selectAllBooks();
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_1_2")) {
            list = (List<AdminBook>) AdminBookMapper_sqlserver.selectAllBooks();
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_1_3")) {
            list = (List<AdminBook>) AdminBookMapper_postgresql.selectAllBooks();
        }
        return list;
    }

    @Override
    public int deleteBooks(String id_book) {
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_1_1")) {
            AdminBookMapper_oracle.deleteBooks(id_book);
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_1_2")) {
            AdminBookMapper_sqlserver.deleteBooks(id_book);
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_1_3")) {
            AdminBookMapper_postgresql.deleteBooks(id_book);
        }
        return 1;
    }
}
