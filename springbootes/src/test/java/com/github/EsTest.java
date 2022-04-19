package com.github;

import com.github.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EsTest {
    @Autowired
    private BookDao bookDao;

    @Test
    void fn() {
        bookDao.selectById(1);
    }
}
