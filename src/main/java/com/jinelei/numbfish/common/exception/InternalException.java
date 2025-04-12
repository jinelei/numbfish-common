package com.jinelei.numbfish.common.exception;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @Author: jinelei
 * @Description: 内部错误，通常是业务错误使用
 * @Date: 2023/7/12
 * @Version: 1.0.0
 */
@Schema(description = "内部错误")
public class InternalException extends BaseException {
  private static final int code = 103000;

  public InternalException() {
    super(code, InternalException.class.getSimpleName());
  }

  public InternalException(String message) {
    super(code, message);
  }

  public InternalException(String message, Throwable cause) {
    super(code, message, cause);
  }
}