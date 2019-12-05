package com.pan.service;

import com.pan.model.Orders;
import com.pan.model.Shoppingcarts;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {//订单服务类
    //新增订单记录
     int addOrder(Shoppingcarts shoppingcarts, String id_order, double price_order, String address_buyer);
    //shoppingcarts从前端获得，id_order自动生成随机编号，price_order计算得出,address_buyer用户输入
    //显示全部订单信息
     List<Orders> queryAllOrders();
    //判断能否删除
    int JudgeDelete(String id_order);
    //根据订单编号删除订单
    void deleteOrderById(String id_order);
    //根据订单编号查询图书名
    String queryOrderBooknameById(String id_order);
    //根据订单编号查询图书数量
    int queryOrderBooksumById(String id_order);
}
