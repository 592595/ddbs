package com.pan.controller;


import com.pan.model.OrderInfo;
import com.pan.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/orderInfoController")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    @RequestMapping("/showOrderListByPaging")
    public String showOrderListByPaging(@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage, Model model){
        model.addAttribute("pageMsg",orderInfoService.findByPage(currentPage));
        return "seller/pages/orderlist";
    }
    @RequestMapping(value = "/selectOrderById" ,method = RequestMethod.POST)
    public ModelAndView SelectOrderById (String order_id) {
        ModelAndView mav = new ModelAndView();
        OrderInfo orderInfo=orderInfoService.findOrderById(order_id);
        if(orderInfo!=null){
            mav.addObject("OrderById",orderInfo);
          mav.setViewName("seller/pages/examorder");
        }
        else
            mav.setViewName("seller/pages/failedorder");
        return mav;
    }
}
