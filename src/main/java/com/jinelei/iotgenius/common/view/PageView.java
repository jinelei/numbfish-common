package com.jinelei.iotgenius.common.view;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: jinelei
 * @Description:
 * @Date: 2024/3/12 22:25
 * @Version: 1.0.0
 */
@SuppressWarnings({"rawtypes", "unused"})
@Schema(description = "分页视图对象")
public class PageView<T> extends ListView<T> {
    /**
     * 当前页码
     */
    @Schema(description = "分页页码")
    protected final Integer page;
    /**
     * 当前页大小
     */
    @Schema(description = "分页大小")
    protected final Integer size;

    public PageView(Integer code, String message, List<T> data, Integer total, Integer page, Integer size) {
        super(Optional.ofNullable(code).orElse(200),
                Optional.ofNullable(message).orElse("success"),
                Optional.ofNullable(data).orElse(new ArrayList<>()),
                Optional.ofNullable(total).orElse(0));
        this.page = Optional.ofNullable(page).orElse(0);
        this.size = Optional.ofNullable(size).orElse(0);
    }

    public PageView(List<T> data) {
        this(null, null, data, Optional.of(data).map(List::size).orElse(0), 0,
                Optional.of(data).map(List::size).orElse(0));
    }

    public PageView(List<T> data, Integer page, Integer size) {
        this(null, null, data, Optional.of(data).map(List::size).orElse(0), page, size);
    }

    public PageView(String message, List<T> data, Integer page, Integer size) {
        this(null, message, data, Optional.of(data).map(List::size).orElse(0), page, size);
    }

    public PageView(Integer code, Throwable e) {
        this(code, e.getMessage(), null, 0, 0, 0);
    }

    public PageView(Throwable e) {
        this(500, e.getMessage(), null, 0, 0, 0);
    }

    public PageView(String message) {
        this(null, message, null, 0, 0, 0);
    }

    public PageView(String message, Integer page, Integer size) {
        this(null, message, null, 0, page, size);
    }

    public Integer getPage() {
        return page;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((page == null) ? 0 : page.hashCode());
        result = prime * result + ((size == null) ? 0 : size.hashCode());
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
        PageView other = (PageView) obj;
        if (page == null) {
            if (other.page != null)
                return false;
        } else if (!page.equals(other.page))
            return false;
        if (size == null) {
            if (other.size != null)
                return false;
        } else if (!size.equals(other.size))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PageView [page=" + page + ", total=" + total + ", code=" + code + ", message=" + message + ", size="
                + size + ", data=" + data + "]";
    }

}