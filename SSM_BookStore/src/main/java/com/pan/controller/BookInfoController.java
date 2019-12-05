package com.pan.controller;


import com.pan.model.BookInfo;
import com.pan.service.AddBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@RequestMapping(value = "/bookInfoController")
public class BookInfoController {
    private static final int maximum=50;

    @Autowired
    AddBookService addBookService ;
    @RequestMapping("/limitedBook")
    public String LimitedBook(Model model){
        int num=addBookService.findBookCount();
        if(num>=maximum) {
            return "seller/pages/overlimit";
        }
        else {
            model.addAttribute("bookNum",num);
            return "seller/pages/inputbookinfo";
        }
    }
    @RequestMapping(value = "/InertBookInfo",method = RequestMethod.POST)
    public String InertBookInfo(BookInfo bookInfo, RedirectAttributes attr)
    {
        System.out.println("运行到这里InertBookInfo");
        if(!addBookService.checkDuplicateBook(bookInfo.getBook_id())){
            addBookService.addBook(bookInfo);

            //设置重定向参数
            attr.addAttribute("book_id",bookInfo.getBook_id());
            return "redirect:/bookInfoController/showBook";
        }
       else return "seller/pages/failshowbook";

    }
    @RequestMapping("/showBook")
    public String ShowBook(String book_id,Model model){
     //   if(book_id!=null){
            BookInfo bookInfo=addBookService.findBookById(book_id);
            model.addAttribute("insertBook",bookInfo);
            return  "seller/pages/showbook";
     //   }
       /* else {
            String paramerror="查询参数有误";
            model.addAttribute("paramerror",paramerror);

        }*/
    }

    /**
     *提交表单时，讲input输入框的date类型转换为yyyy-MM-dd字符串
     * @param binder
     * @param request
     */
   /* @InitBinder
    public  void initBinder(WebDataBinder binder, HttpServletRequest request){
        System.out.println(request.getParameter("date"));
        binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),false));
    }*/
}
