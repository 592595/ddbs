package com.pan.mapper.sqlserver_u_2_4_3_2;

import com.pan.dataSource.DataSource;
import com.pan.model.ExamineInventoryBook;
import com.pan.model.InventoryBook;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("IExamBookDao_sqlserver")
@DataSource("datasource_sqlserver_u_2_4_3_2")
public interface IExamBookDao {
    /**
     * 根据图书号来查询
     * @return
     */
    ExamineInventoryBook findInventoryBookById(String book_id);

    /**
     * 根据id查询图书详细信息
     * @param book_id
     * @return
     */
    InventoryBook findAllInventoryBookById(String book_id);
    /**
     * 查询所有
     * @return
     */
    //@Select("select * from examine_inventory_book_mes")
    List<InventoryBook> findInventoryBookALL();
}
