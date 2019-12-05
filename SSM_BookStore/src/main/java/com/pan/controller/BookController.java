package com.pan.controller;

import com.pan.model.Books;
import com.pan.model.Shoppingcarts;
import com.pan.service.BookService;
import com.pan.service.ShoppingcartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调用Service层
    @Autowired
    private BookService bookService;
    //查询全部的书籍，并且返回到一个书籍展示页面
    @Autowired
    private ShoppingcartsService shoppingcartsService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list=bookService.queryAllBook();
        model.addAttribute("list",list);//向前端传对象
//        System.out.println(list);
        return "buyer/pages/allBook";
    }

//    //跳转到增加书籍页面
//    @RequestMapping("/toAddBook")
//    public  String toAddPaper(){
//        return "buyer/pages/addBook";
//    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        //System.out.println("addBooks=>"+books);
       // bookService.addBook(books);
        return "redirect:/book/allBook";//重定向回到了首页，@RequestMapping("/allBook")请求复用
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(String BookName,Model model){
//      Books books=bookService.queryBookById(id);
        System.out.println(BookName);
        Shoppingcarts shoppingcarts=shoppingcartsService.queryBookByName(BookName);
        //System.out.println(shoppingcarts);
        Books books=bookService.queryBookByName(BookName);
     //   model.addAttribute("book",books);//带到前端

        if(shoppingcarts==null)
            shoppingcartsService.addBook(books);
        else
            shoppingcartsService.updateBookSum(books);

        return "redirect:/book/allShoppingcarts";
    }

    @RequestMapping("/allShoppingcarts")
    public String all(Model model){
        List<Shoppingcarts> list=shoppingcartsService.queryAllShoppingcarts();
       // System.out.println(list);
        model.addAttribute("list",list);
        return "buyer/pages/allShoppingcarts";
    }
    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books=bookService.queryBookByName(queryBookName);
       // System.out.println(books);
        List<Books> list=new ArrayList<Books>();
        list.add(books);
        if(books==null){
            list=bookService.queryAllBook();
            model.addAttribute("error", "未查到");
        }
        model.addAttribute("list",list);
        return "buyer/pages/allBook";
    }
}
