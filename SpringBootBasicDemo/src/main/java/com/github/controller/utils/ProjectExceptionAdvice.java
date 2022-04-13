package com.github.controller.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 作为SpringMVC的异常处理器
 * @author lxlan
 * @RestControllerAdvice 异常处理器
 */

@RestControllerAdvice
public class ProjectExceptionAdvice {
    /**
     * // 拦截所有的异常信息
     */
    @ExceptionHandler
    public FormatJson doException(Exception ex) {
        // 记录日志
        // 通知运维
        // 通知开发
        ex.printStackTrace();
        return new FormatJson("服务故障，请稍后再试");
    }
}
