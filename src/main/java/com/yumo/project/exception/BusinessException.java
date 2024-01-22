package com.yumo.project.exception;

import com.yumo.project.common.ErrorCode;

/**
 * 自定义异常类
 *
 * @author <a href=" https://github.com/coderyumo">程序员雨墨</a>
 */
public class BusinessException extends RuntimeException {

    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
