package com.miao.springmvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author miaoyin
 * @date 2021/1/9 - 18:50
 * @commet:
 */
@Controller
public class FileController {

    //文件下载
    //:.+用于找到参数的扩展名，如111.png,获取.png
    @RequestMapping("/download/{filename:.+}")
    public ResponseEntity download(@PathVariable String filename, HttpSession session) throws Exception {

        //1.获取文件路径
        ServletContext servletContext = session.getServletContext();
        String realPaht = servletContext.getRealPath("/download/" + filename);

        //2.把文件读取程序当中
        FileInputStream fileInputStream = new FileInputStream(realPaht);
        byte[] body = new byte[fileInputStream.available()];
        fileInputStream.read(body);

        //3.创建响应头
        HttpHeaders httpHeaders = new HttpHeaders();
        //处理下载中文文件乱码
        filename = URLEncoder.encode(filename,"UTF-8");
        httpHeaders.add("Content-Disposition", "attachment;filename" + filename);

        ResponseEntity<byte[]> entity = new ResponseEntity<>(body, httpHeaders, HttpStatus.OK);


        return entity;
    }

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
