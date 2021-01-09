package com.miao.springmvc.controller;

import com.miao.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author miaoyin
 * @date 2021/1/9 - 17:36
 * @commet:
 */
@Controller
public class JsonController {

    @PostMapping("/testJson")
    @ResponseBody
    public User testJson(){

        User user = new User();
        user.setUserName("hahah");
        user.setUserAge(21);

        return user;
    }

    @RequestMapping("/formJson")
    @ResponseBody
    //以json的形式传送参数过来用@RequestBody
    public User formJson(@RequestBody User user){

        System.out.println(user);
        return user;
    }
}
