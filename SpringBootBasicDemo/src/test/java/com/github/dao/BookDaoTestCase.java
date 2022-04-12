package com.github.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.domain.Book;
import org.assertj.core.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("测试数据");
        book.setType("测试数据");
        book.setDescription("测试数据");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(13);
        book.setName("测试数据123");
        book.setType("测试数据123");
        book.setDescription("测试数据123");
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(13);
    }

    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetPage() {
        IPage<Book> page = new Page(1, 5);
        bookDao.selectPage(page, null);
    }

    @Test
    void testGetBy() {
        QueryWrapper<Book> bookQueryWrapper = new QueryWrapper<>();
        bookQueryWrapper.like("name", "spring");
        List<Book> books = bookDao.selectList(bookQueryWrapper);
        System.out.println(books);
    }

    @Test
    void testGetBy2() {
        String name = "Spring";

        LambdaQueryWrapper<Book> lbw = new LambdaQueryWrapper<>();
        lbw.like(Strings.isNullOrEmpty(name), Book::getName, name);
        List<Book> books = bookDao.selectList(lbw);
        System.out.println(books);
    }
}
