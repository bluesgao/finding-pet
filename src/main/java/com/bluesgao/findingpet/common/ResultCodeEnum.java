package com.bluesgao.findingpet.common;

public enum ResultCodeEnum {
    SUCCESS(200, "成功"),
    FAIL(400, "失败"),
    SYSTEM_ERROR(500, "系统错误"),
    PARAMS_ERROR(501, "参数错误");

    private int code;
    private String desc;

    ResultCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public String getDescByCode(int code) {
        for (ResultCodeEnum item : ResultCodeEnum.values()) {
            if (item.code == code) {
                return item.desc;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
