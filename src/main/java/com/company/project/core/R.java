package com.company.project.core;

/**
 * 响应结果生成工具
 */
public class R {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result success() {
        return new Result()
                .setSuccess(true)
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Result<T> success(T data) {
        return new Result()
                .setSuccess(true)
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result fail(String message) {
        return new Result()
                .setSuccess(false)
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }
}
