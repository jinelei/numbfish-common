package com.jinelei.iotgenius.common.exception;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @Author: jinelei
 * @Description: 数据库异常
 * @Date: 2023/7/12
 * @Version: 1.0.0
 */
@Schema(description = "数据库异常")
public class DatabaseException extends BaseException {
  private static final int code = 109000;

  public DatabaseException() {
    super(code, DatabaseException.class.getSimpleName());
  }

  public DatabaseException(String message) {
    super(code, message);
  }

  public DatabaseException(String message, Throwable cause) {
    super(code, message, cause);
  }
}