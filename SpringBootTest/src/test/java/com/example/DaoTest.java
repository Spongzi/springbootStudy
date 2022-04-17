package com.example;

import com.example.domain.Book;
import com.example.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
// 添加事物的注解
@Transactional
// 是否回滚，默认值是true
@Rollback
public class DaoTest {
    @Autowired
    private BookService bookService;

    @Test
    void testSave() {
        System.out.println("GetById is running...");
        Book book = new Book();
        book.setName("SpringBoot123");
        book.setType("springBoot123");
        book.setDescription("SpringBoot123");

        bookService.save(book);
    }
}
