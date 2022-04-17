package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;

/**
 * @author 苏旭826
 */
public interface BookService extends IService<Book> {
    /**
     * 保存book对象到数据库
     * @param book 要保存的对象
     * @return 返回保存是否成功
     */
    boolean save(Book book);
}
