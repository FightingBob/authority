package com.bob.authority.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LittleBob on 2020/4/1/001.
 */
@RestController
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello, bob.";
    }
}
