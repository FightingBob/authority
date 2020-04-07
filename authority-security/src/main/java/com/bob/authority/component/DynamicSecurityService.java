package com.bob.authority.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * 动态权限相关业务类
 * Created by Littlebob on 2020/04/06
 */
public interface DynamicSecurityService {

    Map<String, ConfigAttribute> loadDataSource();
}
