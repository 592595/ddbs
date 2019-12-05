package com.pan.service;


import com.pan.model.OrderInfo;
import com.pan.util.Page;

public interface OrderInfoService {
    /**
     * 通过订单id查询
     * @param order_id
     */
    OrderInfo findOrderById(String order_id);

    /**
     * 查询总个数
     * @return
     */
    Integer findOrderCount();

    /**
     * 分页查询
     * @param currentPage
     * @return
     */
        Page<OrderInfo> findByPage(int currentPage);
}
