package com.wucy.tianfu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-10-07
 */
@TableName("tf_todo")
@ApiModel(value = "Todo对象", description = "")
public class Todo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String todoName;

    @ApiModelProperty("定制todo该做的时间")
    private LocalDateTime doTime;

    @ApiModelProperty("结束前时间提醒")
    private LocalDateTime endTime;

    @ApiModelProperty("实际结束时间")
    private LocalDateTime realEndtime;

    @ApiModelProperty("优先级，12345，1最大")
    private Integer priority;

    private Integer planId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }
    public LocalDateTime getDoTime() {
        return doTime;
    }

    public void setDoTime(LocalDateTime doTime) {
        this.doTime = doTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public LocalDateTime getRealEndtime() {
        return realEndtime;
    }

    public void setRealEndtime(LocalDateTime realEndtime) {
        this.realEndtime = realEndtime;
    }
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    @Override
    public String toString() {
        return "Todo{" +
            "id=" + id +
            ", todoName=" + todoName +
            ", doTime=" + doTime +
            ", endTime=" + endTime +
            ", realEndtime=" + realEndtime +
            ", priority=" + priority +
            ", planId=" + planId +
        "}";
    }
}
