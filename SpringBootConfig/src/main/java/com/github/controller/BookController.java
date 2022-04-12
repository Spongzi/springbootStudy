package com.github.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping
    public String getById() {
        System.out.println("你好，你是我第一个自己写出来的程序");
        System.out.println("country ==>" + country);
        System.out.println("name ==>" + username);
        System.out.println("age==>" + age);
        return "你好，xxx";
    }

}
