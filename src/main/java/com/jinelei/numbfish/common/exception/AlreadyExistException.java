package com.jinelei.numbfish.common.exception;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @Author: jinelei
 * @Description: 已存在异常
 * @Date: 2023/7/12
 * @Version: 1.0.0
 */
@Schema(description = "已存在异常")
public class AlreadyExistException extends BaseException {
  public static final int code = 101002;

  public AlreadyExistException() {
    super(code, AlreadyExistException.class.getSimpleName());
  }

  public AlreadyExistException(String message) {
    super(code, message);
  }

  public AlreadyExistException(String message, Throwable cause) {
    super(code, message, cause);
  }
}