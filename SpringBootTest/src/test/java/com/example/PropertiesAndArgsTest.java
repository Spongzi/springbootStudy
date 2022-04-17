package com.example;

import com.example.testcase.domain.BookCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 苏旭826
 * properties 属性可以位当前测试用例添加临时的属性配置
 * SpringBootTest(properties = {"test.prop=testVa"})
 * args属性可以位当前测试用例添加临时的命令行参数
 * SpringBootTest(args = {"--test.prop=testArgs"})
 * 当两个属性都存在的时候args的属性配置生效(命令行>properties)
 */
@SpringBootTest
public class PropertiesAndArgsTest {

    @Value("${test.prop}")
    private String msg;

    @Autowired
    private BookCase bookCase;

    @Test
    void testProperties() {
        System.out.println(msg);
        System.out.println(bookCase);
    }
}
