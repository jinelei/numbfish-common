package com.jinelei.numbfish.common.exception;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @Author: jinelei
 * @Description: 记录不存在异常
 * @Date: 2023/7/12
 * @Version: 1.0.0
 */
@Schema(description = "记录不存在异常")
public class NotExistException extends BaseException {
  private static final int code = 101003;

  public NotExistException() {
    super(code, NotExistException.class.getSimpleName());
  }

  public NotExistException(String message) {
    super(code, message);
  }

  public NotExistException(String message, Throwable cause) {
    super(code, message, cause);
  }
}