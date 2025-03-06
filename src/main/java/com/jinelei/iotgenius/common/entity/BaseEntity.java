package com.jinelei.iotgenius.common.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;

public class BaseEntity<T> implements Serializable {
    @ApiModelProperty("id")
    protected T id;
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
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((remark == null) ? 0 : remark.hashCode());
        result = prime * result + ((creator == null) ? 0 : creator.hashCode());
        result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
        result = prime * result + ((updater == null) ? 0 : updater.hashCode());
        result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
        result = prime * result + ((deleter == null) ? 0 : deleter.hashCode());
        result = prime * result + ((deleteTime == null) ? 0 : deleteTime.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BaseEntity<T> other = (BaseEntity<T>) obj;
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
        if (creator == null) {
            if (other.creator != null)
                return false;
        } else if (!creator.equals(other.creator))
            return false;
        if (createTime == null) {
            if (other.createTime != null)
                return false;
        } else if (!createTime.equals(other.createTime))
            return false;
        if (updater == null) {
            if (other.updater != null)
                return false;
        } else if (!updater.equals(other.updater))
            return false;
        if (updateTime == null) {
            if (other.updateTime != null)
                return false;
        } else if (!updateTime.equals(other.updateTime))
            return false;
        if (deleter == null) {
            if (other.deleter != null)
                return false;
        } else if (!deleter.equals(other.deleter))
            return false;
        if (deleteTime == null) {
            if (other.deleteTime != null)
                return false;
        } else if (!deleteTime.equals(other.deleteTime))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "BaseEntity [id=" + id + ", remark=" + remark + ", creator=" + creator + ", createTime=" + createTime
                + ", updater=" + updater + ", updateTime=" + updateTime + ", deleter=" + deleter + ", deleteTime="
                + deleteTime + "]";
    }

}
