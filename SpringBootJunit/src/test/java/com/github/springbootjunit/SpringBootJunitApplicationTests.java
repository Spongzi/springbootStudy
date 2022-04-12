package com.github.springbootjunit;

import com.github.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJunitApplicationTests {
    // 1. 注入你要测试的对象

    @Autowired
    private BookDao bookDao;


    @Test
    void contextLoads() {
        System.out.println("test...");
        // 2. 执行你要测试的方法
        bookDao.save();
    }

}
