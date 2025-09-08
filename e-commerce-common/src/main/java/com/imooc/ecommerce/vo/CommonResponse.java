package com.imooc.ecommerce.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*
* <h1> 通用响应对象定义 <h1>
* */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {

    // 错误码
    private  Integer code;

    // 错误消息
    private  String message;

    // 响应数据
    private  T data;

    public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
