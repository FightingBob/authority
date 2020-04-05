package com.bob.authority.common.api;

/**
 * 封装API的错误码
 * Created by Littlebob on 2020/4/5 0005
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
