package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lxlan
 */
@SpringBootApplication
public class SpringBootBasicDemoApplication {

    public static void main(String[] args) {
        // 关闭热启动
        // System.setProperty("spring.devtools,restart.enabled", "false");
        SpringApplication.run(SpringBootBasicDemoApplication.class, args);
    }

}
