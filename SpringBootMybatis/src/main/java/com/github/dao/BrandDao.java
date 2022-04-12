package com.github.dao;

import com.github.domain.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BrandDao {
    @Select("select * from tb_brand where id = #{id}")
    Brand getById(Integer id);
}
