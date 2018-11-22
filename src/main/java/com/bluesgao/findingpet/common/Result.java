package com.bluesgao.findingpet.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer code;
    private String msg;
    private T data;

    public static <T> Result successResult(T data) {

        return genResult(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getDesc(), data);
    }

    public static <T> Result failResult(T data) {
        return genResult(ResultCodeEnum.FAIL.getCode(), ResultCodeEnum.FAIL.getDesc(), data);
    }

    public static <T> Result paramsErrorResult(T data){
        return genResult(ResultCodeEnum.PARAMS_ERROR.getCode(), ResultCodeEnum.PARAMS_ERROR.getDesc(), data);
    }

    public static <T> Result systemErrorResult(T data){
        return genResult(ResultCodeEnum.SYSTEM_ERROR.getCode(), ResultCodeEnum.SYSTEM_ERROR.getDesc(), data);
    }

    private static <T> Result genResult(int code, String msg, T data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
