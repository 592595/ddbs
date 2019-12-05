package com.pan.service.Impl;

import com.pan.mapper.oracle_u_2_4_1_1.AdminBuyerMesMapper;
import com.pan.model.AdminBuyerMes;
import com.pan.service.AdminBuyerService;

import com.pan.util.DataSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminAdminBuyerServiceImpl implements AdminBuyerService {

    @Autowired
    private com.pan.mapper.oracle_u_2_4_1_1.AdminBuyerMesMapper BuyerMesMapper_oracle;
    @Autowired
    private com.pan.mapper.sqlserver_u_2_4_1_2.AdminBuyerMesMapper BuyerMesMapper_sqlserver;
    @Autowired
    private com.pan.mapper.postgresql_u_2_4_1_3.AdminBuyerMesMapper BuyerMesMapper_postgresql;

    @Override
    public List<AdminBuyerMes> findAllBuyers() {
        List<AdminBuyerMes> list=null;
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_1_1")) {
            System.out.println("BuyerMesMapper_oracle.selectAllBuyers()");
            list= (List<AdminBuyerMes>) BuyerMesMapper_oracle.selectAllBuyers();
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_1_2")) {
            System.out.println("BuyerMesMapper_sqlserver.selectAllBuyers()");
            list = (List<AdminBuyerMes>) BuyerMesMapper_sqlserver.selectAllBuyers();
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_1_3")) {
            list = (List<AdminBuyerMes>) BuyerMesMapper_postgresql.selectAllBuyers();
        }
        return list;
    }

    @Override
    public List<AdminBuyerMes> findBuyerByScore() {
        List<AdminBuyerMes> list=null;
        if (DataSourceUtil.getDataSource().equals("datasource_oracle_u_2_4_1_1")) {
            list= (List<AdminBuyerMes>) BuyerMesMapper_oracle.selectBuyerByScore();
        } else if (DataSourceUtil.getDataSource().equals("datasource_sqlserver_u_2_4_1_2")) {
            list = (List<AdminBuyerMes>) BuyerMesMapper_sqlserver.selectBuyerByScore();
        } else if (DataSourceUtil.getDataSource().equals("datasource_postgresql_u_2_4_1_3")) {
            list = (List<AdminBuyerMes>) BuyerMesMapper_postgresql.selectBuyerByScore();
        }
        return list;
    }
}
