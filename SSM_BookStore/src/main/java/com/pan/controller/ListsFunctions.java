package com.pan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 左侧功能超链接的跳转
 */
@Controller
@RequestMapping("/functions")
public class ListsFunctions {
    /**
     * 查询库存功能的跳转
     * @return
     */
    @RequestMapping("/inventory")
    public String ExamineInventory()
    {
        return "seller/pages/examinebook";
    }
    @RequestMapping("/nofunction")
    public String NoFuntion()
    {
        return "seller/pages/nofuntion";
    }


}
