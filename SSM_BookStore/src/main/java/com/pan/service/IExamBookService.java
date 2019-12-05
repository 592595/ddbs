package com.pan.service;

import com.pan.model.ExamineInventoryBook;
import com.pan.model.InventoryBook;

import java.util.List;

public interface IExamBookService {
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
    List<InventoryBook> findInventoryBookALL();
}
