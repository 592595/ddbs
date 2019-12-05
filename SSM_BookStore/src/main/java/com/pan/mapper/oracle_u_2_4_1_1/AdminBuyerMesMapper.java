package com.pan.mapper.oracle_u_2_4_1_1;

import com.pan.dataSource.DataSource;
import com.pan.model.AdminBuyerMes;
import com.pan.model.AdminBuyerMes;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("BuyerMesMapper_oracle")
@DataSource("datasource_oracle_u_2_4_1_1")
public interface AdminBuyerMesMapper {

    List<AdminBuyerMes> selectAllBuyers();

    List<AdminBuyerMes> selectBuyerByScore();
}