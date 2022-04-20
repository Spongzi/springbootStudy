package com.github.controller;

import com.github.dao.BookDao;
import com.github.daomain.Book;
import com.github.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lxlan
 */
@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookDao bookDao;



    @GetMapping
    List<Book> selectAllBook() {
        return bookDao.selectList(null);
    }

    @GetMapping("{id}")
    Book selectBook(@PathVariable int id) {
        return bookDao.selectById(id);
    }

    @PostMapping
    void saveBook(@RequestBody Book book) {
        bookDao.insert(book);
    }

    @PutMapping
    void editBook(@RequestBody Book book) {
        bookDao.updateById(book);
    }

    @DeleteMapping("{id}")
    void deleteBook(@PathVariable int id) {
        bookDao.deleteById(id);
    }
}
