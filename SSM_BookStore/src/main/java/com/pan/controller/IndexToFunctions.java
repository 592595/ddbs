package com.pan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//首页跳转函数，测试使用
@Controller
@RequestMapping("/test")
public class IndexToFunctions {
    @RequestMapping("/index")
    public String toFunctions(){
        return "seller/pages/functions";
    }

//    @RequestMapping("/index")
//    public String toFunctions(){
//        return "functions";
//    }

}
