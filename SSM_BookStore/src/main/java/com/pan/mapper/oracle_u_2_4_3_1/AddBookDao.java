package com.pan.mapper.oracle_u_2_4_3_1;


import com.pan.dataSource.DataSource;
import com.pan.model.BookInfo;
import org.springframework.stereotype.Repository;

@Repository("AddBookDao_oracle")
@DataSource("datasource_oracle_u_2_4_3_1")
public interface AddBookDao {
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
