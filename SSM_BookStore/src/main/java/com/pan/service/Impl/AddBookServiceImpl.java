package com.pan.service.Impl;

import com.pan.model.BookInfo;
import com.pan.service.AddBookService;
import com.pan.util.DataSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddBookServiceImpl implements AddBookService {
    @Autowired
    private com.pan.mapper.oracle_u_2_4_3_1.AddBookDao AddBookDao_oracle;
    @Autowired
    private com.pan.mapper.sqlserver_u_2_4_3_2.AddBookDao AddBookDao_sqlserver;
    @Autowired
    private com.pan.mapper.postgresql_u_2_4_3_3.AddBookDao AddBookDao_postgresql;
    @Override
    public Integer findBookCount() {

        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_3_1")){
            return AddBookDao_oracle.findBookCount();
        }
        else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_3_2")){
            return AddBookDao_sqlserver.findBookCount();
        }
        else {
            return AddBookDao_postgresql.findBookCount();
        }

    }

    @Override
    public void addBook(BookInfo bookInfo) {
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_3_1")){
           AddBookDao_oracle.addBook(bookInfo);
        }
        else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_3_2")){
             AddBookDao_sqlserver.addBook(bookInfo);
        }
        else {
             AddBookDao_postgresql.addBook(bookInfo);
        }
        //addBookDao.addBook(bookInfo);
    }

    @Override
    public boolean checkDuplicateBook(String book_id) {
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_3_1")){
            return AddBookDao_oracle.checkDuplicateBook(book_id);
        }
        else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_3_2")){
            return AddBookDao_sqlserver.checkDuplicateBook(book_id);
        }
        else {
            return AddBookDao_postgresql.checkDuplicateBook(book_id);
        }

    }

    @Override
    public BookInfo findBookById(String book_id) {
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_3_1")){
            return AddBookDao_oracle.findBookById(book_id);
        }
        else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_3_2")){
            return AddBookDao_sqlserver.findBookById(book_id);
        }
        else {
            return AddBookDao_postgresql.findBookById(book_id);
        }

    }
}
