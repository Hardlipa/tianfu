package com.wucy.tianfu.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author wucy
 * @since 2021-09-25
 */
@TableName("tf_sex")
@ApiModel(value = "Sex对象", description = "")
public class Sex implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private LocalDateTime endTime;

    @ApiModelProperty("持续时间，单位分钟")
    private Integer keep;

    @ApiModelProperty("等级，撸3，看黄2，黄欲1")
    private Integer level;

    @ApiModelProperty("犯戒的原因")
    private String reason;

    @ApiModelProperty("感想")
    private String feel;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public Integer getKeep() {
        return keep;
    }

    public void setKeep(Integer keep) {
        this.keep = keep;
    }
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getFeel() {
        return feel;
    }

    public void setFeel(String feel) {
        this.feel = feel;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Sex{" +
            "id=" + id +
            ", endTime=" + endTime +
            ", keep=" + keep +
            ", level=" + level +
            ", reason=" + reason +
            ", feel=" + feel +
            ", userId=" + userId +
        "}";
    }
}
