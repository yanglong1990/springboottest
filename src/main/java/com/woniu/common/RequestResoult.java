package com.woniu.common;
/**
* @Author: ysl
* @Description: 统一返回采纳数
* @DateTime: 2022/10/25 14:08
*/
public class RequestResoult<T> {
    //状态码
    private String code;

    //状态说明,对code的说明
    private String msg;

    //接口数据
    private T data;
}

