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

        return genResult(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getDesc(), data);
    }

    public static <T> Result failResult(T data) {
        return genResult(CodeEnum.FAIL.getCode(), CodeEnum.FAIL.getDesc(), data);
    }

    public static <T> Result paramsErrorResult(T data){
        return genResult(CodeEnum.PARAMS_ERROR.getCode(), CodeEnum.PARAMS_ERROR.getDesc(), data);
    }

    public static <T> Result systemErrorResult(T data){
        return genResult(CodeEnum.SYSTEM_ERROR.getCode(), CodeEnum.SYSTEM_ERROR.getDesc(), data);
    }

    private static <T> Result genResult(int code, String msg, T data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
