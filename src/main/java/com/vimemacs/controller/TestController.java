package com.vimemacs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HWD
 * @date 2024/3/12 14:48
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello";
    }
}
