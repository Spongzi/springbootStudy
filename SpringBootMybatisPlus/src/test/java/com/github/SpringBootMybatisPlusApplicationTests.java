package com.github;

import com.github.dao.BrandDao;
import com.github.domain.Brand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootMybatisPlusApplicationTests {

    @Autowired
    private BrandDao brandDao;

    @Test
    void contextLoads() {
        Brand brand = brandDao.selectById(20);
        System.out.println(brand);
        List<Brand> brands = brandDao.selectList(null);
        System.out.println(brands);
    }

}
