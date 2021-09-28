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
@TableName("tf_user_auth")
@ApiModel(value = "UserAuth对象", description = "")
public class UserAuth implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String username;

    private String password;

    private LocalDateTime lastLogintime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDateTime getLastLogintime() {
        return lastLogintime;
    }

    public void setLastLogintime(LocalDateTime lastLogintime) {
        this.lastLogintime = lastLogintime;
    }

    @Override
    public String toString() {
        return "UserAuth{" +
            "userId=" + userId +
            ", username=" + username +
            ", password=" + password +
            ", lastLogintime=" + lastLogintime +
        "}";
    }
}
