package com.github.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.dao.BookDao;
import com.github.daomain.Book;
import com.github.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author lxlan
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService {

    /*@Autowired
    private BookDao bookDao;

    private HashMap<Integer, Book> cache = new HashMap();
    public Book getById(Integer id) {
        // 如果当前没有本次要查询的数据，则要进行查询，否则直接就从缓存中获取数据返回
        Book book = cache.get(id);
        if (book == null) {
            Book queryBook = bookDao.selectById(id);
            cache.put(id, queryBook);
            return queryBook;
        }
        return book;
    }*/
}
