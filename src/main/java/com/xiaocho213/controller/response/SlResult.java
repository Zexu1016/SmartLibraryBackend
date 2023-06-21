package com.xiaocho213.controller.response;




public record SlResult <T> (T data, Integer statusCode, String message){
    public static <T> SlResult<T> success(T data, String message) {
        return new SlResult<>(data, 200, message);
    }

    public static <T> SlResult<T> success(T data) {
        return success(data, null);
    }

    public static <T> SlResult<T> success() {
        return success(null);
    }

    public static <T> SlResult<T> fail(T data, Integer statusCode, String message) {
        return new SlResult<>(data, statusCode, message);
    }

    public static <T> SlResult<T> fail(Integer statusCode, String message) {
        return fail(null, statusCode, message);
    }
}
