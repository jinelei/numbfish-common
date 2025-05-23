package com.jinelei.numbfish.common.response;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;

@SuppressWarnings("rawtypes")
@Schema(description = "基础响应对象")
public class BaseResponse<T> implements Serializable {
    @Schema(description = "id")
    protected T id;
    @Schema(description = "权限备注")
    protected String remark;
    @Schema(description = "是否启用")
    protected Boolean enabled;
    @Schema(description = "创建人")
    protected Long createdUserId;
    @Schema(description = "创建时间")
    protected LocalDateTime createdTime;
    @Schema(description = "更新人")
    protected Long updatedUserId;
    @Schema(description = "更新时间")
    protected LocalDateTime updatedTime;
    @Schema(description = "删除人")
    protected String deletedUserId;
    @Schema(description = "删除时间")
    protected LocalDateTime deletedTime;
    public T getId() {
        return id;
    }
    public void setId(T id) {
        this.id = id;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public Long getCreatedUserId() {
        return createdUserId;
    }
    public void setCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
    }
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }
    public Long getUpdatedUserId() {
        return updatedUserId;
    }
    public void setUpdatedUserId(Long updatedUserId) {
        this.updatedUserId = updatedUserId;
    }
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }
    public String getDeletedUserId() {
        return deletedUserId;
    }
    public void setDeletedUserId(String deletedUserId) {
        this.deletedUserId = deletedUserId;
    }
    public LocalDateTime getDeletedTime() {
        return deletedTime;
    }
    public void setDeletedTime(LocalDateTime deletedTime) {
        this.deletedTime = deletedTime;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((remark == null) ? 0 : remark.hashCode());
        result = prime * result + ((enabled == null) ? 0 : enabled.hashCode());
        result = prime * result + ((createdUserId == null) ? 0 : createdUserId.hashCode());
        result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
        result = prime * result + ((updatedUserId == null) ? 0 : updatedUserId.hashCode());
        result = prime * result + ((updatedTime == null) ? 0 : updatedTime.hashCode());
        result = prime * result + ((deletedUserId == null) ? 0 : deletedUserId.hashCode());
        result = prime * result + ((deletedTime == null) ? 0 : deletedTime.hashCode());
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
        BaseResponse other = (BaseResponse) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (remark == null) {
            if (other.remark != null)
                return false;
        } else if (!remark.equals(other.remark))
            return false;
        if (enabled == null) {
            if (other.enabled != null)
                return false;
        } else if (!enabled.equals(other.enabled))
            return false;
        if (createdUserId == null) {
            if (other.createdUserId != null)
                return false;
        } else if (!createdUserId.equals(other.createdUserId))
            return false;
        if (createdTime == null) {
            if (other.createdTime != null)
                return false;
        } else if (!createdTime.equals(other.createdTime))
            return false;
        if (updatedUserId == null) {
            if (other.updatedUserId != null)
                return false;
        } else if (!updatedUserId.equals(other.updatedUserId))
            return false;
        if (updatedTime == null) {
            if (other.updatedTime != null)
                return false;
        } else if (!updatedTime.equals(other.updatedTime))
            return false;
        if (deletedUserId == null) {
            if (other.deletedUserId != null)
                return false;
        } else if (!deletedUserId.equals(other.deletedUserId))
            return false;
        if (deletedTime == null) {
            if (other.deletedTime != null)
                return false;
        } else if (!deletedTime.equals(other.deletedTime))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "BaseResponse [id=" + id + ", remark=" + remark + ", enabled=" + enabled + ", createdUserId="
                + createdUserId + ", createdTime=" + createdTime + ", updatedUserId=" + updatedUserId + ", updatedTime="
                + updatedTime + ", deletedUserId=" + deletedUserId + ", deletedTime=" + deletedTime + "]";
    }

}
