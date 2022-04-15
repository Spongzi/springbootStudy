package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 苏旭826
 */
@Configuration
public class MsgConfig {

    @Bean
    public String msg() {
        return "bean msg";
    }
}
