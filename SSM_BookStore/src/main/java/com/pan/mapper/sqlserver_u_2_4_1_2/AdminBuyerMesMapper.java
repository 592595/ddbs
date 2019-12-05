package com.pan.mapper.sqlserver_u_2_4_1_2;

import com.pan.dataSource.DataSource;
import com.pan.model.AdminBuyerMes;
import com.pan.model.AdminBuyerMes;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("BuyerMesMapper_sqlserver")
@DataSource("datasource_sqlserver_u_2_4_1_2")
public interface AdminBuyerMesMapper {

    List<AdminBuyerMes> selectAllBuyers();

    List<AdminBuyerMes> selectBuyerByScore();
}