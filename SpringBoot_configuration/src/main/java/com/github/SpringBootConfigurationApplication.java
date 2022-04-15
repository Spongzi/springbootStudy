package com.github;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author 苏旭826
 */
@SpringBootApplication
@EnableConfigurationProperties({ServerConfig.class})
public class SpringBootConfigurationApplication {
    @Bean
    @ConfigurationProperties(prefix = "data-source")
    public DruidDataSource dataSource() {
        DruidDataSource ds = new DruidDataSource();
        return ds;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootConfigurationApplication.class, args);

        ServerConfig bean = run.getBean(ServerConfig.class);
        System.out.println(bean);

        DruidDataSource bean1 = run.getBean(DruidDataSource.class);
        System.out.println(bean1.getDriverClassName());
    }

}
