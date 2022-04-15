package com.github.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @author 苏旭826
 * @Component 如果书写了 EnableConfigurationProperties，就不用在注册bean了
 * 2. 开启对当前bean的属性注入校验
 */
@Data
@ConfigurationProperties(prefix = "servers")
@Validated
public class ServerConfig {
    private String ipAddress;
    /**
     * 3. 设置具体的规则
     */
    @Max(value = 8888, message = "最大值不能超过8888")
    @Min(value = 2222, message = "最小值不能小于2222")
    private int port;
    private long timeout;

    @DurationUnit(ChronoUnit.MILLIS)
    private Duration serverTimeout;

    @DataSizeUnit(DataUnit.MEGABYTES)
    private DataSize dataSize;
}
