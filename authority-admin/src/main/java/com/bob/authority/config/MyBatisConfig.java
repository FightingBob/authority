package com.bob.authority.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.security.servlet.WebSecurityEnablerConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * @EnableTransactionManagement 事务支持
 * Created by Littlebob on 2020/4/5 0005.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({
        "com.bob.authority.mapper"
})
public class MyBatisConfig extends WebSecurityEnablerConfiguration {


}
