package com.github.utils;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author lxlan
 */
@Component
public class CodeUtils {

    private String[] patch = {"00000", "0000", "000", "00", "0", "0"};

    public String generator(String tel) {
        int hash = tel.hashCode();
        int encryption = 20220421;
        long result = hash ^ encryption;
        long nowTime = System.currentTimeMillis();
        result = result ^ nowTime;
        long code = result % 1000000;
        code = code < 0 ? -code : code;
        String codeStr = code + "";
        int len = codeStr.length();

        return patch[len - 1] + codeStr;
    }


    /** 要走Spring容器*/
    @Cacheable(value = "smsCode", key = "#tel")
    public String get(String tel) {
        // 返回null，如果有值的话直接返回值，否则返回null
        return null;
    }
}
