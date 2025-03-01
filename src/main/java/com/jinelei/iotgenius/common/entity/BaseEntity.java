package com.jinelei.iotgenius.common.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

public class BaseEntity implements Serializable {
    @ApiModelProperty("权限备注")
    protected String remark;
    @ApiModelProperty("创建人")
    protected String creator;
    @ApiModelProperty("创建时间")
    protected LocalDateTime createTime;
    @ApiModelProperty("更新人")
    protected String updater;
    @ApiModelProperty("更新时间")
    protected LocalDateTime updateTime;
    @ApiModelProperty("删除人")
    protected String deleter;
    @ApiModelProperty("删除时间")
    protected LocalDateTime deleteTime;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeleter() {
        return deleter;
    }

    public void setDeleter(String deleter) {
        this.deleter = deleter;
    }

    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(remark, creator, createTime, updater, updateTime, deleter, deleteTime);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseEntity other = (BaseEntity) obj;
        return Objects.equals(remark, other.remark) &&
                Objects.equals(creator, other.creator) &&
                Objects.equals(createTime, other.createTime) &&
                Objects.equals(updater, other.updater) &&
                Objects.equals(updateTime, other.updateTime) &&
                Objects.equals(deleter, other.deleter) &&
                Objects.equals(deleteTime, other.deleteTime);
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "remark='" + remark + '\'' +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", updater='" + updater + '\'' +
                ", updateTime=" + updateTime +
                ", deleter='" + deleter + '\'' +
                ", deleteTime=" + deleteTime +
                '}';
    }
}
