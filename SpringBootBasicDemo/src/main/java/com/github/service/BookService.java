package com.github.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.domain.Book;

import java.util.List;

public interface BookService {
    /**
     * 保存Book方法
     * @param book 要保存book的内容
     * @return 返回是否成功
     */
    Boolean save(Book book);

    /**
     * 更新update方法
     * @param book 查询的内容
     * @return 返回是否更新成功
     */
    Boolean update(Book book);

    /**
     * 根据Id删除对应的Book
     * @param id 要删除的id
     * @return 返回是否成功
     */
    Boolean delete(Integer id);

    /**
     * 根据id查询Book
     * @param id 要查询的id
     * @return 返回查询到的结果
     */
    Book getById(Integer id);

    /**
     * 查询出所有的Book
     * @return 返回所有Book
     */
    List<Book> getAll();

    /**
     * 分页查询
     * @param currentPage 当前页面
     * @param pageSize 每页个数
     * @param book 查询条件
     * @return 分页查询结果
     */
    IPage<Book> getPage(int currentPage, int pageSize);
}
