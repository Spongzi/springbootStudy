package com.example.controller;

import com.example.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 苏旭826
 */
@RestController
@RequestMapping("books")
public class BookController {
    /*
    @GetMapping
    public String getById() {
        System.out.println("GetById is running...");
        return "spring boot";
    }
    */

    @GetMapping
    public Book getById() {
        System.out.println("GetById is running...");
        Book book = new Book();
        book.setId(1);
        book.setName("SpringBoot");
        book.setType("springBoot");
        book.setDescription("SpringBoot");
        return book;
    }
}
