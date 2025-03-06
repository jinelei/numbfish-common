package com.jinelei.iotgenius.common.exception;

import io.swagger.annotations.ApiModel;

/**
 * @Author: jinelei
 * @Description: 未知异常，当所有的异常都不匹配时使用
 * @Date: 2023/7/12
 * @Version: 1.0.0
 */
@ApiModel("未知异常")
public class UnknownException extends BaseException {
  private static final int code = 109000;

  public UnknownException() {
    super(code, UnknownException.class.getSimpleName());
  }

  public UnknownException(String message) {
    super(code, message);
  }

  public UnknownException(String message, Throwable cause) {
    super(code, message, cause);
  }
}