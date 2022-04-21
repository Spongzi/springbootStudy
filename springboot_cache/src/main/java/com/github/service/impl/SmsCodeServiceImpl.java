package com.github.service.impl;

import com.github.daomain.SmsCode;
import com.github.service.SmsCodeService;
import com.github.utils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author lxlan
 */
@Service
public class SmsCodeServiceImpl implements SmsCodeService {

    @Autowired
    private CodeUtils codeUtils;

    @Override
    @CachePut(value = "smsCode", key = "#tel")
    public String sendCodeToSms(String tel) {
        return codeUtils.generator(tel);
    }

    @Override
    public boolean checkCode(SmsCode smsCode) {
        // 取出内存中的Code，与传递过来的验证码比对，如果相同返回true否则返回false
        String code = smsCode.getCode();
        String cacheCode = codeUtils.get(smsCode.getTel());
        return code.equals(cacheCode);
    }
}
