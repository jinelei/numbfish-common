package com.jinelei.numbfish.common.view;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.Optional;

/**
 * @Author: jinelei
 * @Description:
 * @Date: 2023/7/21
 * @Version: 1.0.0
 */
@SuppressWarnings({ "rawtypes" })
@Schema(description = "基础视图对象")
public class BaseView<T> implements Serializable {
    @Schema(description = "错误码")
    protected final Integer code;
    @Schema(description = "错误信息")
    protected final String message;
    @Schema(description = "数据")
    protected final T data;

    public BaseView(Integer code, String message, T data) {
        this.code = Optional.ofNullable(code).orElse(200);
        this.message = Optional.ofNullable(message).orElse("success");
        this.data = data;
    }

    public BaseView() {
        this(null, null, null);
    }

    public BaseView(T data) {
        this(null, null, data);
    }

    public BaseView(String message) {
        this(null, message, null);
    }

    public BaseView(String message, T data) {
        this(null, message, data);
    }

    public BaseView(Throwable e) {
        this(500, Optional.ofNullable(e).map(i -> i.getMessage()).orElse(e.getClass().getName()), null);
    }

    public BaseView(Integer code, Throwable e) {
        this(code, Optional.ofNullable(e).map(i -> i.getMessage()).orElse(e.getClass().getName()), null);
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "BaseView [code=" + code + ", message=" + message + ", data=" + data + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BaseView other = (BaseView) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (message == null) {
            if (other.message != null)
                return false;
        } else if (!message.equals(other.message))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        return true;
    }

}
