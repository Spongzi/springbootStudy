package com.github.service;

import com.github.daomain.SmsCode;
import com.sun.org.apache.bcel.internal.classfile.Code;

/**
 * @author lxlan
 */
public interface SmsCodeService {
    /**
     * 获取验证码
     * @param tel 验证码手机号
     * @return 返回得到的验证码
     */
    String sendCodeToSms(String tel);

    /**
     * 检查验证码是否正确
     * @param smsCode 给一个对象参数
     * @return 返回结果是否正确
     */
    boolean checkCode(SmsCode smsCode);
}
