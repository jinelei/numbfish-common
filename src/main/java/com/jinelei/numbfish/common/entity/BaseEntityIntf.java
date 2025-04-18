package com.jinelei.numbfish.common.entity;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.time.LocalDateTime;

@SuppressWarnings("unused")
@Schema(description = "基础实体对象")
public interface BaseEntityIntf<T> extends Serializable {
    @Schema(description = "id")
    T getId();

    void setId(T id);

    @Schema(description = "备注")
    String getRemark();

    void setRemark(String remark);

    @Schema(description = "创建人")
    Long getCreatedUserId();

    void setCreatedUserId(Long createdUserId);

    @Schema(description = "创建时间")
    LocalDateTime getCreatedTime();

    void setCreatedTime(LocalDateTime createdTime);

    @Schema(description = "更新人")
    Long getUpdatedUserId();

    void setUpdatedUserId(Long updatedUserId);

    @Schema(description = "更新时间")
    LocalDateTime getUpdatedTime();

    void setUpdatedTime(LocalDateTime updatedTime);

}
