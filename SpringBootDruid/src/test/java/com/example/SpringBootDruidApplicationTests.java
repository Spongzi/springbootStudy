package com.example;

import com.example.dao.BrandDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDruidApplicationTests {

    @Autowired
    private BrandDao brandDao;

    @Test
    void contextLoads() {
        System.out.println(brandDao.getById(20));
    }

}
