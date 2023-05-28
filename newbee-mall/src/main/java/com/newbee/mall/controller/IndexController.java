package com.newbee.mall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author Administrator
 * @Date 2023/5/25 10:29
 **/
@RestController
public class IndexController {

    @GetMapping("/index")
    public String hello() {
        return "index";
    }
}
