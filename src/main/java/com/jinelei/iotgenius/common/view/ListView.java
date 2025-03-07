package com.jinelei.iotgenius.common.view;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;
import java.util.Optional;

import com.jinelei.iotgenius.common.utils.ThrowableStackTraceUtils;

/**
 * @Author: jinelei
 * @Description:
 * @Date: 2024/3/12 22:25
 * @Version: 1.0.0
 */
@SuppressWarnings("rawtypes")
@Schema(description = "列表视图对象")
public class ListView<T> extends BaseView<List<T>> {
    /**
     * 记录总数量
     */
    @Schema(description = "记录总数")
    protected final Integer total;

    public ListView(Integer code, String message, List<T> data, Integer total) {
        super(code, message, data);
        this.total = total;
    }

    public ListView(List<T> data) {
        this(null, null, data, Optional.ofNullable(data).map(List::size).orElse(0));
    }

    public ListView(String message, List<T> data) {
        this(null, message, data, Optional.ofNullable(data).map(List::size).orElse(0));
    }

    public ListView(Integer code, String message, List<T> data) {
        this(code, message, data, Optional.ofNullable(data).map(List::size).orElse(0));
    }

    public ListView(Integer code, Throwable e) {
        this(code, ThrowableStackTraceUtils.getStackTraceAsString(e), null, 0);
    }

    public ListView(Throwable e) {
        this(500, ThrowableStackTraceUtils.getStackTraceAsString(e), null, 0);
    }

    public ListView(Integer code, String message) {
        this(code, message, null, 0);
    }

    public ListView(String message) {
        this(null, message, null, 0);
    }

    public Integer getTotal() {
        return total;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((total == null) ? 0 : total.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        ListView other = (ListView) obj;
        if (total == null) {
            if (other.total != null)
                return false;
        } else if (!total.equals(other.total))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ListView [total=" + total + ", code=" + code + ", message=" + message + ", data=" + data + "]";
    }

}