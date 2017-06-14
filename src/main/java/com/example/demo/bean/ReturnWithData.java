package com.example.demo.bean;

/**
 * Created by wgl on 6/14/17.
 */
public class ReturnWithData<T> extends ReturnWithoutData {
    private T data;
    public ReturnWithData(String msg, String code,T data) {
        super(msg, code);
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
