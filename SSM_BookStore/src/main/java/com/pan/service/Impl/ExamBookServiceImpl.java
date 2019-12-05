package com.pan.service.Impl;


import com.pan.model.ExamineInventoryBook;
import com.pan.model.InventoryBook;
import com.pan.service.IExamBookService;
import com.pan.util.DataSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class ExamBookServiceImpl implements IExamBookService {

    @Autowired
    private com.pan.mapper.oracle_u_2_4_3_1.IExamBookDao IExamBookDao_oracle;
    @Autowired
    private com.pan.mapper.sqlserver_u_2_4_3_2.IExamBookDao IExamBookDao_sqlserver;
    @Autowired
    private com.pan.mapper.postgresql_u_2_4_3_3.IExamBookDao IExamBookDao_postgresql;

    @Override
    public ExamineInventoryBook findInventoryBookById(String book_id) {
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_3_1")){
            return IExamBookDao_oracle.findInventoryBookById(book_id);
        }
        else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_3_2")){
            return IExamBookDao_sqlserver.findInventoryBookById(book_id);
        }
        else {
            return IExamBookDao_postgresql.findInventoryBookById(book_id);
        }
    }

    @Override
    public InventoryBook findAllInventoryBookById(String book_id) {

        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_3_1")){
            return IExamBookDao_oracle.findAllInventoryBookById(book_id);
        }
        else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_3_2")){
            return IExamBookDao_sqlserver.findAllInventoryBookById(book_id);
        }
        else{
            return IExamBookDao_postgresql.findAllInventoryBookById(book_id);
        }
    }

    @Override
    public List<InventoryBook> findInventoryBookALL() {
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_3_1")){
            return IExamBookDao_oracle.findInventoryBookALL();
        }
        else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_3_2")){
            return IExamBookDao_sqlserver.findInventoryBookALL();
        }
        else{
            return IExamBookDao_postgresql.findInventoryBookALL();
        }
    }
}
