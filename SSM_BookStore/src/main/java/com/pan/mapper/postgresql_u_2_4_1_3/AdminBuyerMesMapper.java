package com.pan.mapper.postgresql_u_2_4_1_3;

import com.pan.dataSource.DataSource;
import com.pan.model.AdminBuyerMes;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("BuyerMesMapper_postgresql")
@DataSource("datasource_postgresql_u_2_4_1_3")
public interface AdminBuyerMesMapper {

    List<AdminBuyerMes> selectAllBuyers();

    List<AdminBuyerMes> selectBuyerByScore();
}