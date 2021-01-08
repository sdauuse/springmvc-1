package com.miao.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author miaoyin
 * @date 2021/1/7 - 22:19
 * @commet:
 */
@Controller
public class MyController2 {

    @RequestMapping("/convert")
    public ModelAndView convert(Integer age, Date date, String name) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("age", age).
                addObject("date", new SimpleDateFormat("yyyy-MM-dd").format(date)).
                addObject("name", name);
        modelAndView.setViewName("/result3.jsp");
        return modelAndView;
    }


    @RequestMapping(value = {"/testmapping1", "/testmapping2"})
    public String testMapping() {

        return "forward:/result3.jsp";
    }

    @RequestMapping(value = "/testparams", params = {"name=lky", "age=18"})
    public String testparams() {

        return "forward:/result3.jsp";
    }

    @RequestMapping("/testant/??")
    public String testant() {

        return "forward:/result3.jsp";
    }

    @RequestMapping("/testant/*/hh")
    public String testant2() {

        return "forward:/result3.jsp";
    }

    @RequestMapping("/testant/**/zz")
    public String testant3() {

        return "forward:/result3.jsp";
    }

    @GetMapping("/testrest")
    public String testrest1() {
        return "forward:/result3.jsp";
    }

    @PostMapping("/testrest")
    public String testrest2() {
        return "forward:/result3.jsp";
    }

    @PutMapping("/testrest")
    public String testrest3() {
        return "redirect:/localtestrestput";
    }

    @DeleteMapping("/testrest")
    public String testrest4() {
        return "redirect:/localtestrestdelete";
    }

    @RequestMapping("/localtestrestput")
    public String localtestrestput() {
        return "forward:/result3.jsp";
    }

    @RequestMapping("/localtestrestdelete")
    public String localtestrestdelete() {
        return "forward:/result3.jsp";
    }

    //获取请求头
    @RequestMapping("/testheader")
    public String testHeader(@RequestHeader("Connection") String connection) {

        System.out.println("请求头=========" + connection);
        return "forward:/result3.jsp";
    }
}
