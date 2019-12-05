package com.pan.controller;

import com.pan.model.ExamineInventoryBook;
import com.pan.model.InventoryBook;
import com.pan.service.IExamBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller()
@RequestMapping(value = "/examBookController")
public class ExamBookController {

    @Autowired
    private IExamBookService iExamBookService;

    @RequestMapping(value = "/examBookById", method = RequestMethod.POST)
    public ModelAndView ExamBookById(String book_id) {
        ModelAndView modelAndView = new ModelAndView();
        if (book_id == null || book_id == "") {
            String error = "输入为空请重新输入";
            modelAndView.addObject("empty_error", error);
            modelAndView.setViewName("seller/pages/examinebook");
            return modelAndView;
        }
        ExamineInventoryBook eib = iExamBookService.findInventoryBookById(book_id);
        System.out.println(eib);
        if (eib != null) {
            modelAndView.addObject("bookById", eib);
            modelAndView.setViewName("seller/pages/success");
        } else {
            modelAndView.setViewName("seller/pages/failed");
        }
        return modelAndView;
    }

    @RequestMapping("/examBookAll")
    public String ExamBookAll(Model model) {
        List<InventoryBook> lists = iExamBookService.findInventoryBookALL();
        model.addAttribute("lists", lists);
        return "success1";
    }

    @RequestMapping(value = "/examBookInventoryById")
    public String ExamBookInventoryById(String book_id, Model model) {
        InventoryBook inventoryBook = iExamBookService.findAllInventoryBookById(book_id);
        model.addAttribute("inventory", inventoryBook);
        return "seller/pages/inventory";
    }
}
