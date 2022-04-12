package com.github.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetAll() {
        System.out.println(bookService.getAll());
    }

    @Test
    public void testGetByPage() {
        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page.getRecords());
        System.out.println(page.getTotal());
    }
}
