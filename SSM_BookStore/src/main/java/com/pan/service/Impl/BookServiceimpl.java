package com.pan.service.Impl;

import com.pan.dataSource.DataSource;
import com.pan.mapper.oracle_u_2_4_2_1.BookMapper;
import com.pan.model.Books;
import com.pan.service.BookService;
import com.pan.util.DataSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceimpl implements BookService {

    //service 调用dao层；组合dao层
    @Autowired
    private BookMapper BookMapper_oracle;
    @Autowired
    private com.pan.mapper.sqlserver_u_2_4_2_2.BookMapper BookMapper_sqlserver;
    @Autowired
    private com.pan.mapper.postgresql_u_2_4_2_3.BookMapper BookMapper_postgresql;


    @Override
    public List<Books> queryAllBook()
    {
        List<Books> list= new ArrayList<>();
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")) {
            list= (List<Books>) BookMapper_oracle.queryAllBook();
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")) {
            System.out.println("qhz!!!");
            list = (List<Books>) BookMapper_sqlserver.queryAllBook();
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")) {
            list = (List<Books>) BookMapper_postgresql.queryAllBook();
        }
        return list;
    }

    @Override
    public Books queryBookByName(String bookName) {
        Books books=null;
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")) {
            books= BookMapper_oracle.queryBookByName(bookName);
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")) {
            books= BookMapper_sqlserver.queryBookByName(bookName);
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")) {
            books= BookMapper_postgresql.queryBookByName(bookName);
        }
        return books;
    }

    @Override
    public void updateBookInv(int booknum,String bookname){
        if(DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")){
            BookMapper_oracle.updateBookInv(booknum,bookname);
        }else if(DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")){
            BookMapper_sqlserver.updateBookInv(booknum,bookname);
        }else if(DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")){
            BookMapper_postgresql.updateBookInv(booknum,bookname);
        }
    }

}
