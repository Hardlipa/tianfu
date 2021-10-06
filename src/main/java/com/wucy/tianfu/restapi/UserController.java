package com.wucy.tianfu.restapi;


import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wucy.tianfu.common.util.ResultUtil;
import com.wucy.tianfu.domain.User;
import com.wucy.tianfu.domain.common.Result;
import com.wucy.tianfu.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wucy
 * @since 2021-10-01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("enroll")
    public void enroll(@RequestBody User user) {
        userService.save(user);
    }

    @PostMapping("login")
    public Result login(@RequestBody User user) {
        QueryWrapper<User> qw = new QueryWrapper<>(user);
        User one = userService.getOne(qw);
        if (one !=null) {
            StpUtil.login(one.getId());
            return ResultUtil.success();
        }
        return ResultUtil.failure();
    }

    /**
     *检查用户名重复
     * @param username
     * @return
     */
    @PostMapping("isRepeat")
    public Result isRepeat(String username) {
        boolean isRepeat = userService.checkUsername(username);
        if (isRepeat) {
            return ResultUtil.failure();
        }
        return ResultUtil.success();
    }


}
