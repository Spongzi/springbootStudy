package com.github.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.controller.utils.FormatJson;
import com.github.domain.Book;
import com.github.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 苏旭
 */
@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {

    // 创建记录日志
//    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private IBookService bookService;

    @GetMapping
    public FormatJson getAll() {
        log.info("你好");
        return new FormatJson(true, bookService.list());
    }

    @PostMapping
    public FormatJson save(@RequestBody Book book) {
        return new FormatJson(bookService.save(book));
    }

    @PutMapping
    public FormatJson update(@RequestBody Book book) {
        System.out.println("test hot deploy...");
        System.out.println("test hot deploy...");
        System.out.println("test hot deploy...");
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
    public FormatJson getBy(@PathVariable Integer current, @PathVariable Integer pageSize, Book book) {
        System.out.println("参数==>" + book);
        IPage<Book> page = bookService.getPage(current, pageSize, book);
        // 如果当前页面值大于了最大页码值，那么重新执行查询操作，使用最大页码值当作当前页码值
        if (current > page.getPages()) {
            page = bookService.getPage((int)page.getPages(), pageSize, book);
        }
        return new FormatJson(true, page);
    }
}
