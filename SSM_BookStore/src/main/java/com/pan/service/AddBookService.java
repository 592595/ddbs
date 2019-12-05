package com.pan.service;


import com.pan.model.BookInfo;

public interface AddBookService {
    /**
     * 查询上架图书总数
     * @return
     */
    Integer findBookCount();

    /**
     * 添加图书
     * @param bookInfo
     */
    void addBook(BookInfo bookInfo);

    /**
     * 检查是否有重复的图书
     * @param book_id
     * @return 是返回真，否则返回假
     */
    boolean checkDuplicateBook(String book_id);

    /**
     * 根据id查询刚刚上架的图书
     * @param book_id
     * @return
     */
    BookInfo findBookById(String book_id);
}
