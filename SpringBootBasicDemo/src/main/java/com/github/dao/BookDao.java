package com.github.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.domain.Book;
import lombok.Setter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
