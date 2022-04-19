package com.github;

import com.github.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoAction;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootTest
class SpringbootMongodbApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void contextLoads() {
        Book book = new Book();
        book.setId(1);
        book.setName("springBoot");
        book.setType("springBoot");
        book.setDescription("springBoot");
        mongoTemplate.save(book);
    }

    @Test
    void find() {
        List<Book> all = mongoTemplate.findAll(Book.class);
        System.out.println(all);
    }

}
