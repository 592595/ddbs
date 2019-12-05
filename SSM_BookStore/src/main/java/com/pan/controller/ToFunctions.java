package com.pan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jump")
public class ToFunctions {
    @RequestMapping("/index")
    public String toFunction(){
        return "buyer/pages/function";
    }
}
