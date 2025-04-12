package com.jinelei.numbfish.common.request;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

@SuppressWarnings({"rawtypes", "unused"})
@Schema(description = "分页请求对象")
public class PageRequest<T> implements Serializable {
    @Schema(description = "分页页码")
    protected Integer page = 1;
    @Schema(description = "分页大小")
    protected Integer size = 10;
    @Schema(description = "查询参数")
    protected T params;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        this.params = params;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((page == null) ? 0 : page.hashCode());
        result = prime * result + ((size == null) ? 0 : size.hashCode());
        result = prime * result + ((params == null) ? 0 : params.hashCode());
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
        PageRequest other = (PageRequest) obj;
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
        if (params == null) {
            if (other.params != null)
                return false;
        } else if (!params.equals(other.params))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PageRequest [page=" + page + ", size=" + size + ", params=" + params + "]";
    }

}
