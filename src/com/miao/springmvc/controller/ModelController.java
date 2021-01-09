package com.miao.springmvc.controller;

import com.miao.springmvc.domain.Goods;
import com.miao.springmvc.domain.Pet;
import com.miao.springmvc.domain.User;
import org.apache.tomcat.util.descriptor.web.ErrorPage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author miaoyin
 * @date 2021/1/8 - 15:29
 * @commet:
 */
@Controller
//将request域中的goods转存到session域中,request和session中均有该值
@SessionAttributes("goods")
public class ModelController {


    @RequestMapping("/testModel")
    public String testModel(Model model) {

        Goods goods = new Goods();
        goods.setName("corn");
        goods.setPrice(10);

        model.addAttribute("goods", goods);
        System.out.println(model.containsAttribute("goods"));
        return "forward:/modelresult.jsp";
    }

    @RequestMapping("/testMap")
    public String testMap(Map map) {

        Goods goods = new Goods();
        goods.setName("corn");
        goods.setPrice(10);

        map.put("goods", goods);
        return "forward:/modelresult.jsp";
    }

    @RequestMapping("/testmodelsession")
    public String testModelSession(@SessionAttribute("goods") Goods goods) {


        System.out.println(goods);
        return "forward:/modelresult.jsp";
    }

    @RequestMapping("/testlabel")
    public String testSpringLabel(Model model) {

        User user = new User();
        user.setUserName("hhahahah");
        user.setUserAge(21);
        String[] hobby = new String[]{"乒乓球", "羽毛球"};
        user.setHobby(hobby);

        List<String> allhobby = new ArrayList<String>();
        allhobby.add("篮球");
        allhobby.add("足球");
        allhobby.add("乒乓球");
        allhobby.add("羽毛球");


        Pet pet1 = new Pet();
        pet1.setName("tiger");
        pet1.setColor("red");
        Pet pet2 = new Pet();
        pet2.setName("cat");
        pet2.setColor("red");
        Pet pet3 = new Pet();
        pet3.setName("pig");
        pet3.setColor("black");
        Pet pet4 = new Pet();
        pet4.setName("dog");
        pet4.setColor("white");

        user.setPet(pet1);

        List<Pet> petList = new ArrayList<Pet>();
        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);
        petList.add(pet4);

        model.addAttribute("petList", petList);
        model.addAttribute("allhobby", allhobby);
        model.addAttribute("user", user);
        return "forward:/springlableresult.jsp";
    }

    @RequestMapping("/testValidate")
    public String testValidate(@Valid User user, BindingResult result,Model model) {
        int errorCount = result.getErrorCount();
        //判断有没有错误信息
        if (errorCount != 0) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                System.out.println(fieldError.getField() + "------" + fieldError.getDefaultMessage());
            }
            List<String> allhobby = new ArrayList<String>();
            allhobby.add("篮球");
            allhobby.add("足球");
            allhobby.add("乒乓球");
            allhobby.add("羽毛球");


            Pet pet1 = new Pet();
            pet1.setName("tiger");
            pet1.setColor("red");
            Pet pet2 = new Pet();
            pet2.setName("cat");
            pet2.setColor("red");
            Pet pet3 = new Pet();
            pet3.setName("pig");
            pet3.setColor("black");

            List<Pet> petList = new ArrayList<Pet>();
            petList.add(pet1);
            petList.add(pet2);
            petList.add(pet3);
            model.addAttribute("petList", petList);
            model.addAttribute("allhobby", allhobby);
            return "forward:/springlableresult.jsp";
        }
        System.out.println(user);
        return "forward:/result3.jsp";
    }
}
