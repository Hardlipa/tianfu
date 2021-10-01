package com.wucy.tianfu.restapi;


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
        //检查用户名重复
        userService.save(user);
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
