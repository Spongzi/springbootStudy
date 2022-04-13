package com.github.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.domain.Book;

/**
 * @author lxlan
 */
public interface IBookService extends IService<Book> {
    /**
     * 分页查询
     * @param currentPage 当前页面
     * @param pageSize 每页数量
     * @param book 查询条件
     * @return 返回查询的page
     */
    IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
