package com.bob.authority.controller;

import com.bob.authority.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 后台用户管理
 * Created by LittleBob on 2020/4/6/006.
 */
@Api(tags = "SysUserController", description = "后台用户管理")
@RequestMapping("/admin")
@RestController
public class SysUserController {

    @ApiOperation("打招呼")
    @GetMapping("/sayHello")
    public CommonResult<String> sayHello() {
        return CommonResult.success(null);
    }
}
