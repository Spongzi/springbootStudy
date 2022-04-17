package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 苏旭826
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
