package com.pan.controller;

import com.pan.model.Books;
import com.pan.model.Orders;
import com.pan.model.Shoppingcarts;
import com.pan.service.BookService;
import com.pan.service.OrderService;
import com.pan.service.ShoppingcartsService;
import com.pan.util.RandomId_order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Controller
@RequestMapping("/order")
public class OrderController {
    //controller 调用Service层
    @Autowired
    private BookService bookService;
    @Autowired
    private ShoppingcartsService shoppingcartsService;
    @Autowired
    private OrderService orderService;

    Properties properties;
    //展示当前购物车中的全部的图书
    @RequestMapping("/allShoppingcarts")
    public String allShoppingcarts(Model model){
        List<Shoppingcarts> list=shoppingcartsService.queryAllShoppingcarts();
        model.addAttribute("list",list);
        return "buyer/pages/Orders";
    }

    //查询用户想要购买的购物车图书
    @RequestMapping("/addorder")
    public String addorder(Model model,String BookName){
        Shoppingcarts shoppingcarts=shoppingcartsService.queryBookByName(BookName);
        model.addAttribute("shoppingcarts",shoppingcarts);
        return "buyer/pages/CheckOrder";
    }

    @RequestMapping("/deliverOrder")
    public String deliverOrder(Shoppingcarts shoppingcarts, String address_buyer,Model model){
        RandomId_order randomId_order=new RandomId_order();
        double price_order=shoppingcarts.getPrice_book()*shoppingcarts.getSum_book();
        Books books=bookService.queryBookByName(shoppingcarts.getName_book());
        if(shoppingcarts.getSum_book()>books.getInv_book()) {
            model.addAttribute("error", "对不起，超出库存");
            return "buyer/pages/CheckOrder";
        }
        if(price_order>=200)
            price_order=price_order*0.8;
         orderService.addOrder(shoppingcarts,randomId_order.getOrderIdByUUID(),price_order,address_buyer);
         //参数分别是：购物车类，随机生成的订单号,订单的总金额，地址
         bookService.updateBookInv(shoppingcarts.getSum_book(),shoppingcarts.getName_book());
         //下单更新库存
        //下单更新购物车
        shoppingcartsService.DeleteByBookname(shoppingcarts.getName_book());
        return "redirect:/order/allOrders";//请求复用
    }

    @RequestMapping("/allOrders")
    public String allOrders(Model model){
        List<Orders> list=orderService.queryAllOrders();
        model.addAttribute("list2",list);
        return "buyer/pages/allOrders";
    }

    @RequestMapping("/showOrders")
    public String showOrders(Model model){
        List<Orders> list=orderService.queryAllOrders();
        model.addAttribute("list2",list);
        return "buyer/pages/ShowOrders";
    }

    @RequestMapping("/DeleteFailed")
    public String DelFailed(Model model){
        List<Orders> list=orderService.queryAllOrders();
        model.addAttribute("list2",list);
        return "buyer/pages/DeleteFailed";
    }

    @RequestMapping("/DeleteSuccess")
    public String DelSuccess(Model model){
        List<Orders> list=orderService.queryAllOrders();
        model.addAttribute("list2",list);
        return "buyer/pages/DeleteSuccess";
    }


    @RequestMapping(value = "/checkorder")
    public String checkOrder(String id_order) {
        int judge=orderService.JudgeDelete(id_order);
            if(judge==1) {//可以撤销
                //撤销订单，归还库存
                String bookName=orderService.queryOrderBooknameById(id_order);
                int bookSum=orderService.queryOrderBooksumById(id_order);
                bookSum=0-bookSum;
                orderService.deleteOrderById(id_order);
                bookService.updateBookInv(bookSum,bookName);
                return "redirect:/order/DeleteSuccess";
            }
            if(judge==0) {
                return "redirect:/order/DeleteFailed";
            }
        return "redirect:/order/showOrders";
    }
}
