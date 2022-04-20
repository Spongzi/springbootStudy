package com.github.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.daomain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lxlan
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
