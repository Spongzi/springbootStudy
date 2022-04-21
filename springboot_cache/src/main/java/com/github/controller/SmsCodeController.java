package com.github.controller;

import com.github.daomain.SmsCode;
import com.github.service.SmsCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lxlan
 */
@RestController
@RequestMapping("/sms")
public class SmsCodeController {

    @Autowired
    private SmsCodeService smsCodeService;

    @GetMapping
    public String getCode(String tel) {
        return smsCodeService.sendCodeToSms(tel);
    }

    @PostMapping
    public boolean checkCode(@RequestBody SmsCode smsCode) {
        return smsCodeService.checkCode(smsCode);
    }
}
