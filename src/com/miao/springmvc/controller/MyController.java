package com.miao.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author miaoyin
 * @date 2021/1/7 - 14:42
 * @commet:
 */
@Controller
public class MyController {

    //转发的两种方式
    @RequestMapping("/show.action")
    public ModelAndView show(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","hhh");
        modelAndView.setViewName("/result.jsp");

        return modelAndView;
    }

    @RequestMapping("/show2.action")
    public String show2(Model model){
        model.addAttribute("name","hhhhh22");
        return "redirect:/result2.jsp";
    }
}
