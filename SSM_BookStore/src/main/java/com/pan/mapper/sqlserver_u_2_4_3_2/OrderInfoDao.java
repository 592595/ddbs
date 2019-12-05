package com.pan.mapper.sqlserver_u_2_4_3_2;


import com.pan.dataSource.DataSource;
import com.pan.model.OrderInfo;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository("OrderInfoDao_sqlserver")
@DataSource("datasource_sqlserver_u_2_4_3_2")
public interface OrderInfoDao {
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
     * @param map
     * @return
     */
    List<OrderInfo> findByPage(Map<String, Object> map);
}
