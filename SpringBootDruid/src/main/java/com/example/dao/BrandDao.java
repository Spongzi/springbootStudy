package com.example.dao;

import com.example.domain.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BrandDao {
    @Select("select * from tb_brand where id = #{id}")
    Brand getById(Integer id);
}
