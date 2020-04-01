package com.bob.authority.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LittleBob on 2020/4/1/001.
 */
@Api(tags = "HelloController", description = "测试控制器")
@RequestMapping("/hello")
@RestController
public class HelloController {

    @ApiOperation("打招呼")
    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello, bob.";
    }

    @ApiOperation("判断对错")
    @GetMapping("/isRight")
    public String isRight(@RequestParam(value = "isRight", defaultValue = "1")
                          @ApiParam(value = "是否正确", example = "1") Integer isRight) {
        if(1 == isRight) {
            return "是正确的";
        }else if (0 == isRight) {
            return "是错误的";
        }
        return "非10";
    }
}
