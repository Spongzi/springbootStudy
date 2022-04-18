package com.example;

import com.example.dao.BookDao;
import com.example.daomain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringBootSqlApplicationTests {
	@Autowired
	private BookDao bookDao;

	@Test
	void test () {
		bookDao.selectById(1);
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	void testJdbcTemplate() {
		String sqlStr = "select * from tb_book;";
		/*
		List<Map<String, Object>> maps = jdbcTemplate.queryForList(sqlStr);
		System.out.println(maps);
		*/
		RowMapper<Book> rm = new RowMapper<Book>() {
			@Override
			public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
				Book temp = new Book();
				temp.setId(rs.getInt("id"));
				temp.setName(rs.getString("name"));
				temp.setType(rs.getString("type"));
				temp.setDescription(rs.getString("description"));
				return temp;
			}
		};
		List<Book> query = jdbcTemplate.query(sqlStr, rm);
		System.out.println(query);
	}

	@Test
	void testJdbcTemplateSave() {
		String sqlStr = "insert into tb_Book values (3, 'springboot', 'springboot', 'springboot');";
		jdbcTemplate.update(sqlStr);
	}

}
