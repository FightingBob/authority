package com.bob.authority.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

/**
 * Created by LittleBob on 2020/4/3/003.
 */
@Configuration
@MapperScan("com.bob.authority.mbg.mapper")
public class MybatisConfig {

}
