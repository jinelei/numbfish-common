package com.jinelei.numbfish.common.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(description = "树形响应对象")
public interface TreeResponse<T> {
    @Schema(description = "子级")
    List<T> getChildren();

    void setChildren(List<T> children);

}
