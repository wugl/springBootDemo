package com.example.demo.bean;

/**
 * Created by wgl on 6/14/17.
 */
public class ReturnWithoutData {
    private String msg,code;

    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }

    public ReturnWithoutData(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }
}
