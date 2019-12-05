package com.pan.controller;

import com.pan.model.AdminBook;
import com.pan.model.AdminBookViolation;
import com.pan.service.AdminBookService;
import com.pan.service.AdminBookViolationService;
import com.pan.util.DataSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController3 {

    @Autowired
    private AdminBookService adminBookService;
    @Autowired
    private AdminBookViolationService adminBookViolationService;

    //    显示所有图书
    @RequestMapping("/public/BookUnder")
    public String BookUnderPage(HttpServletRequest servletRequest,
                                  HttpSession session) {
//        DataSourceUtil.setDataSource("datasource_sqlserver_u_2_4_1_2");
        List<AdminBook> list = adminBookService.findAllBook();
        session.setAttribute("data", list);
        servletRequest.setAttribute("code", 1);
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum = sum + list.get(i).getSum__book();
        servletRequest.setAttribute("sum", sum);
        return "admin/pages/BookUnder";
    }

    //    违规图书加入违规图书处理表
    @RequestMapping("/public/BookViolation")
    public String BookViolationPage(HttpServletRequest servletRequest,
                                        String BookID,
                                        HttpSession session) {
//        DataSourceUtil.setDataSource("datasource_sqlserver_u_2_4_1_2");
        List<AdminBook> list = adminBookService.findAllBook();
        for (int i=0;i<list.size();i++){
            AdminBookViolation adminBookViolation=new AdminBookViolation();
            String bookid=list.get(i).getId_book();
            if(bookid.trim().equals(BookID)){
                adminBookViolation.setId_book(list.get(i).getId_book());
                adminBookViolation.setId_seller(list.get(i).getId_seller());
                adminBookViolation.setName__book(list.get(i).getName__book());
                adminBookViolation.setPrice_book(list.get(i).getPrice_book());
                adminBookViolation.setPress_book(list.get(i).getPress_book());
                adminBookViolation.setSum__book(list.get(i).getSum__book());
                adminBookViolation.setTime_book(list.get(i).getTime_book());
//                加入违规处理表
                adminBookViolationService.insertBooks(adminBookViolation);
//                在图书表删除
                adminBookService.deleteBooks(bookid);
            }
        }
        List<AdminBookViolation> newlist = adminBookViolationService.findAllBook();
        session.setAttribute("data", newlist);
        servletRequest.setAttribute("code",1);
        return "admin/pages/BookViolation";
    }
}
