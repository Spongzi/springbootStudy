package com.example;

import com.example.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(MsgConfig.class) // 加载当前测试类专用的配置
public class ConfigurationTest {
    @Autowired
    private String msg;

    @Test
    void testConfiguration() {
        System.out.println(msg);
    }
}
