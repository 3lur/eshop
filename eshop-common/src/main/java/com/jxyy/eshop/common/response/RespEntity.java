package com.jxyy.eshop.common.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class RespEntity<T> implements Serializable {
    private Integer status;
    private Boolean success;
    private String message;
    private T data;
    private String time;
}
