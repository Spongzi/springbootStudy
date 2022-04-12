package com.github.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.domain.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BrandDao extends BaseMapper<Brand> {
}
