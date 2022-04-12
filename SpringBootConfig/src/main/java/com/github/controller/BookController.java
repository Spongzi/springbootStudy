package com.github.controller;

import com.github.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    private String country;

    @Value("${user.name}")
    private String username;

    @Value("${user.age}")
    private int age;

    @Value("${tempDir}")
    private String tempDir;

    // 使用自动装配将所有的数据封装到一个Environment对象当中去
    @Autowired
    private Environment environment;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById() {
        System.out.println("你好，你是我第一个自己写出来的程序");
        System.out.println("country ==>" + country);
        System.out.println("name ==>" + username);
        System.out.println("age==>" + age);
        System.out.println("tempDir==>" + tempDir);
        System.out.println("=============================");
        System.out.println(environment.getProperty("user.name"));
        System.out.println(myDataSource);
        return "你好，xxx";
    }

    @PostMapping("testPost")
    public void test(){
        System.out.println("hah");
    }

}
