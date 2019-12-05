package com.pan.service.Impl;

import com.pan.model.Books;
import com.pan.model.Shoppingcarts;
import com.pan.service.ShoppingcartsService;
import com.pan.util.DataSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingcartsServiceimpl implements ShoppingcartsService {
    //service 调用dao层；组合dao层
    @Autowired
    private com.pan.mapper.oracle_u_2_4_2_1.ShoppingcartMapper ShoppingcartMapper_oracle;
    @Autowired
    private com.pan.mapper.sqlserver_u_2_4_2_2.ShoppingcartMapper ShoppingcartMapper_sqlserver;
    @Autowired
    private com.pan.mapper.postgresql_u_2_4_2_3.ShoppingcartMapper ShoppingcartMapper_postgresql;

    //在购物车中查询一本书的记录
    @Override
    public Shoppingcarts queryBookByName(String bookname) {
        Shoppingcarts shoppingcarts = null;
        //service 调用dao层；组合dao层
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")) {
            shoppingcarts = ShoppingcartMapper_oracle.queryBookByName(bookname);
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")) {
            shoppingcarts = ShoppingcartMapper_sqlserver.queryBookByName(bookname);
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")) {
            shoppingcarts = ShoppingcartMapper_postgresql.queryBookByName(bookname);
        }
        return shoppingcarts;
    }

    //在购物车中新加一本书的记录
    @Override
    public int addBook(Books books) {
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")) {
            ShoppingcartMapper_oracle.addBook(books);
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")) {
            ShoppingcartMapper_sqlserver.addBook(books);
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")) {
            ShoppingcartMapper_postgresql.addBook(books);
        }
        return 1;
    }

    //在购物车是一本书的数量加一
    @Override
    public int updateBookSum(Books books) {
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")) {
            ShoppingcartMapper_oracle.updateBookSum(books);
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")) {
            ShoppingcartMapper_sqlserver.updateBookSum(books);
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")) {
            ShoppingcartMapper_postgresql.updateBookSum(books);
        }
        return 1;
    }

    @Override
    public List<Shoppingcarts> queryAllShoppingcarts() {
        List<Shoppingcarts> list = null;
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")) {
            list = (List<Shoppingcarts>) ShoppingcartMapper_oracle.queryAllShoppingcarts();
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")) {
            list = (List<Shoppingcarts>) ShoppingcartMapper_sqlserver.queryAllShoppingcarts();
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")) {
            list = (List<Shoppingcarts>) ShoppingcartMapper_postgresql.queryAllShoppingcarts();
        }
        return list;
    }

    @Override
    public void DeleteByBookname(String bookName){
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")) {
             ShoppingcartMapper_oracle.DeletebyBookName(bookName);
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")) {
            ShoppingcartMapper_sqlserver.DeletebyBookName(bookName);
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")) {
            ShoppingcartMapper_postgresql.DeletebyBookName(bookName);
        }
    }

}
