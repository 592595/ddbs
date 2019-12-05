package com.pan.service.Impl;

import com.pan.mapper.oracle_u_2_4_2_1.OrderMapper;
import com.pan.model.Orders;
import com.pan.model.Shoppingcarts;
import com.pan.service.OrderService;
import com.pan.util.DataSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceimpl implements OrderService {//服务实现类
    @Autowired
    private OrderMapper OrderMapper_oracle;
    @Autowired
    private com.pan.mapper.sqlserver_u_2_4_2_2.OrderMapper OrderMapper_sqlserver;
    @Autowired
    private com.pan.mapper.postgresql_u_2_4_2_3.OrderMapper OrderMapper_postgresql;

    @Override
    public List<Orders> queryAllOrders()
    {
        List<Orders> list=new ArrayList<>();
        if(DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")){
            list=(List<Orders>) OrderMapper_oracle.queryAllOrders();
        }else if(DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")){
            list=(List<Orders>) OrderMapper_sqlserver.queryAllOrders();
        }else if(DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")){
            list=(List<Orders>)OrderMapper_postgresql.queryAllOrders();
        }
        return list;
    }

    @Override
    public int addOrder(Shoppingcarts shoppingcarts, String id_order, double price_order, String address_buyer){
        if(DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")) {
            OrderMapper_oracle.addOrders(shoppingcarts,id_order,price_order, address_buyer);
        }else if(DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")){
            OrderMapper_sqlserver.addOrders(shoppingcarts,id_order,price_order, address_buyer);
        }else if(DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")){
            OrderMapper_postgresql.addOrders(shoppingcarts,id_order,price_order,address_buyer);
        }
        return 1;
    }

    @Override
    public int JudgeDelete(String id_order){
        int judge=2;
        if(DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")){
            if(OrderMapper_oracle.queryOrderPayById(id_order)==0&&OrderMapper_oracle.queryOrderDeliverById(id_order)==0)
                judge=1;
            else
                judge=0;
        }else if(DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")){
            if(OrderMapper_sqlserver.queryOrderPayById(id_order)==0&&OrderMapper_sqlserver.queryOrderDeliverById(id_order)==0)
                judge= 1;
            else
                judge= 0;
        }else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")){
            if(!OrderMapper_postgresql.queryOrderPayById(id_order) && !OrderMapper_postgresql.queryOrderDeliverById(id_order))
                judge= 1;
            else
                judge= 0;
        }
        return judge;
    }

    @Override
    public void deleteOrderById(String id_order){
        if(DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")) {
            OrderMapper_oracle.deleteOrderById(id_order);
        }else if(DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")){
            OrderMapper_sqlserver.deleteOrderById(id_order);
        }else if(DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")){
            OrderMapper_postgresql.deleteOrderById(id_order);
        }
    }

    @Override
    public String queryOrderBooknameById(String id_order){
        String bookname=null;
        if(DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")) {
            bookname=OrderMapper_oracle.queryOrderBooknameById(id_order);
        }else if(DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")){
            bookname=OrderMapper_sqlserver.queryOrderBooknameById(id_order);
        }else if(DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")){
            bookname=OrderMapper_postgresql.queryOrderBooknameById(id_order);
        }
        return bookname;
    }

    @Override
    public int queryOrderBooksumById(String id_order){
        int booksum=0;
        if(DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_2_1")) {
            booksum=OrderMapper_oracle.queryOrderBooksumById(id_order);
        }else if(DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_2_2")){
            booksum=OrderMapper_sqlserver.queryOrderBooksumById(id_order);
        }else if(DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_2_3")){
            booksum=OrderMapper_postgresql.queryOrderBooksumById(id_order);
        }
        return booksum;
    }
}
