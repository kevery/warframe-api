package com.company.project.utils;

public class BusinessException extends RuntimeException{

    /**
     * 错误信息11111
     */
    private String msg;

    public BusinessException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
