package com.pan.service.Impl;

import com.pan.model.AdminBookViolation;
import com.pan.service.AdminBookViolationService;
import com.pan.util.DataSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminBookViolationServiceImpl implements AdminBookViolationService {
    @Autowired
    private com.pan.mapper.oracle_u_2_4_1_1.AdminBookViolationMapper AdminBookViolationMapper_oracle;
    @Autowired
    private com.pan.mapper.sqlserver_u_2_4_1_2.AdminBookViolationMapper AdminBookViolationMapper_sqlserver;
    @Autowired
    private com.pan.mapper.postgresql_u_2_4_1_3.AdminBookViolationMapper AdminBookViolationMapper_postgresql;

    @Override
    public List<AdminBookViolation> findAllBook() {
        List<AdminBookViolation> list = null;
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_1_1")) {
            list = (List<AdminBookViolation>) AdminBookViolationMapper_oracle.selectAllBooks();
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_1_2")) {
            list = (List<AdminBookViolation>) AdminBookViolationMapper_sqlserver.selectAllBooks();
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_1_3")) {
            list = (List<AdminBookViolation>) AdminBookViolationMapper_postgresql.selectAllBooks();
        }
        return list;
    }

    @Override
    public int insertBooks(AdminBookViolation adminBookViolation) {
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_1_1")) {
            AdminBookViolationMapper_oracle.insertBooks(adminBookViolation);
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_1_2")) {
            AdminBookViolationMapper_sqlserver.insertBooks(adminBookViolation);
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_1_3")) {
            AdminBookViolationMapper_postgresql.insertBooks(adminBookViolation);
        }
        return 1;
    }
}
