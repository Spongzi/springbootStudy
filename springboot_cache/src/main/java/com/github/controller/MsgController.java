package com.github.controller;

import com.github.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lxlan
 */
@RestController
@RequestMapping("/msg")
public class MsgController {

    @Autowired
    private MsgService msgService;

    @GetMapping("{tel}")
    String get( @PathVariable String tel) {
        return msgService.get(tel);
    }

    @PostMapping
    boolean check(String tel, String code) {
        return msgService.check(tel, code);
    }
}
