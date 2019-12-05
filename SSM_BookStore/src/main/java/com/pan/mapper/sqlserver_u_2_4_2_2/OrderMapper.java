//dao层
package com.pan.mapper.sqlserver_u_2_4_2_2;

import com.pan.dataSource.DataSource;
import com.pan.model.Orders;
import com.pan.model.Shoppingcarts;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("OrderMapper_sqlserver")//用于Service层
@DataSource("datasource_sqlserver_u_2_4_2_2")
public interface OrderMapper {
    //新增订单记录
    int addOrders(@Param("shoppingcarts") Shoppingcarts shoppingcarts, @Param("id_order") String id_order, @Param("price_order") double price_order, @Param("address_buyer") String address_buyer);
    //显示全部订单信息
    public List<Orders> queryAllOrders();
    //根据订单编号查询订单
    int queryOrderPayById(@Param("id_order") String id_order);
    int queryOrderDeliverById(@Param("id_order") String id_order);
    //根据订单编号删除订单
    void deleteOrderById(@Param("id_order") String id_order);
    //查询订单的图书名
    String queryOrderBooknameById(@Param("id_order") String id_order);
    //查询订单的图书数量
    int queryOrderBooksumById(@Param("id_order") String id_order);
}
