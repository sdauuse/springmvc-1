package com.miao.springmvc.controller;

import com.miao.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author miaoyin
 * @date 2021/1/7 - 14:42
 * @commet:
 */
@Controller
public class MyController {

    //转发的两种方式
//    @RequestMapping("/show.action")
    @RequestMapping("/show")
    public ModelAndView show() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "hhh");
        modelAndView.setViewName("/result.jsp");

        return modelAndView;
    }

    //@RequestMapping("/show2.action")
    @RequestMapping("/show2")//默认required=true
    public String show2(@RequestParam(value = "id", required = false, defaultValue = "100") Integer idkey, String name) {
        System.out.println("id=======" + idkey);
        System.out.println("name===========" + name);
        return "forward:/result2.jsp";
    }

    @RequestMapping("/myform")
    public String myform(User user){
        System.out.println(user);
        return "forward:/result2.jsp";
    }
    @RequestMapping("/myform2")
    public String myform2(User user){
        System.out.println(user);
        return "forward:/result2.jsp";
    }
    @RequestMapping("/myform3")
    public String myform3(User user){
        System.out.println(user);
        return "forward:/result2.jsp";
    }
    @RequestMapping("/myform4")
    public String myform4(User user){
        System.out.println(user);
        return "forward:/result2.jsp";
    }

}
