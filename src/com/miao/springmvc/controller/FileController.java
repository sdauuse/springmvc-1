package com.miao.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * @author miaoyin
 * @date 2021/1/9 - 18:50
 * @commet:
 */
@Controller
public class FileController {

    @RequestMapping("/upload")
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file, HttpSession session) throws IOException {

        System.out.println("form的name属性:" + file.getName());
        System.out.println("文件的大小:" + file.getSize());
        System.out.println("文件的类型:" + file.getContentType());
        System.out.println("文件名:" + file.getOriginalFilename());


        ServletContext servletContext = session.getServletContext();
        //通过ServletContext获取项目路径： 项目名/upload
        String realPath = servletContext.getRealPath("/upload");

        File upload = new File(realPath);
        //创建文件夹，即创建路径
        if (!upload.exists()) {
            upload.mkdirs();
        }
        String fileName = file.getOriginalFilename();
        upload = new File(upload + "/" + fileName);
        file.transferTo(upload);
        return "forward:/result3.jsp";
    }
}
