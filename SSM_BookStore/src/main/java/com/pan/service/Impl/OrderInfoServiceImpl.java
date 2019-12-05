package com.pan.service.Impl;


import com.pan.model.OrderInfo;
import com.pan.service.OrderInfoService;
import com.pan.util.DataSourceUtil;
import com.pan.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service()
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private com.pan.mapper.oracle_u_2_4_3_1.OrderInfoDao OrderInfoDao_oracle;
    @Autowired
    private com.pan.mapper.sqlserver_u_2_4_3_2.OrderInfoDao OrderInfoDao_sqlserver;
    @Autowired
    private com.pan.mapper.postgresql_u_2_4_3_3.OrderInfoDao OrderInfoDao_postgresql;
    //每页显示的最大数
    private final static int K=5;


    @Override
    public OrderInfo findOrderById(String order_id) {
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_3_1")){
            return OrderInfoDao_oracle.findOrderById(order_id);
        }
        else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_3_2")){
            return OrderInfoDao_sqlserver.findOrderById(order_id);
        }
        else {
            return OrderInfoDao_postgresql.findOrderById(order_id);
        }
    }

    @Override
    public Integer findOrderCount() {
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_3_1")){
            return OrderInfoDao_oracle.findOrderCount();
        }
        else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_3_2")){
            return OrderInfoDao_sqlserver.findOrderCount();
        }
        else {
            return OrderInfoDao_postgresql.findOrderCount();
        }
    }

    @Override
    public Page<OrderInfo> findByPage(int currentPage) {
          Map<String,Object> map = new HashMap<>();
          Page<OrderInfo> page = new Page<>();
          //设置当前页
        page.setCurrentPage(currentPage);
        //设置当前页显示数目为5条
        int pageSize=K;
        page.setPageSize(pageSize);
        //设置总记录条数
        int totalCount=0;
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_3_1")){
             totalCount=OrderInfoDao_oracle.findOrderCount();
        }
        else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_3_2")){
             totalCount=OrderInfoDao_sqlserver.findOrderCount();
        }
        else {
             totalCount=OrderInfoDao_postgresql.findOrderCount();
        }
        System.out.println("总页数："+totalCount);
        page.setTotalCount(totalCount);
          //设置总页数
        double tc = totalCount;
        //向上取整
        Double num=Math.ceil(tc/pageSize);
        page.setTotalPage(num.intValue());
      //  map.put("start",(currentPage-1)*pageSize);
     //   map.put("size", page.getPageSize());
        //封装每页显示的数据
        List<OrderInfo> lists;
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_3_1")){
            map.put("start",(currentPage-1)*pageSize);
            map.put("size", page.getPageSize()+(currentPage-1)*pageSize);
            lists=OrderInfoDao_oracle.findByPage(map);

        }
        else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_3_2")){
            map.put("start",(currentPage-1)*pageSize);
            map.put("size", page.getPageSize());
            lists=OrderInfoDao_sqlserver.findByPage(map);
        }
        else {
            map.put("start",(currentPage-1)*pageSize);
            map.put("size", page.getPageSize());
            lists=OrderInfoDao_postgresql.findByPage(map);
        }
        page.setLists(lists);
        return page;

    }
}
