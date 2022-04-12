package com.github.controller;

import com.github.dao.FormatJson;
import com.github.domain.Book;
import com.github.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lxlan
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public FormatJson getAll() {
        return new FormatJson(true, bookService.list());
    }

    @PostMapping
    public FormatJson save(@RequestBody Book book) {
        return new FormatJson(bookService.save(book));
    }

    @PutMapping
    public FormatJson update(@RequestBody Book book) {
        return new FormatJson(bookService.updateById(book));
    }

    @DeleteMapping("{id}")
    public FormatJson delete(@PathVariable Integer id) {
        return new FormatJson(bookService.removeById(id));
    }

    @GetMapping("{id}")
    public FormatJson getById(@PathVariable Integer id) {
        return new FormatJson(true, bookService.getById(id));
    }

    @GetMapping("{current}/{pageSize}")
    public FormatJson getBy(@PathVariable Integer current, @PathVariable Integer pageSize) {
        return new FormatJson(true, bookService.getPage(current, pageSize));
    }
}
