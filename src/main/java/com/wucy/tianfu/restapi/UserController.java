package com.wucy.tianfu.restapi;


import com.wucy.tianfu.domain.User;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wucy
 * @since 2021-09-25
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @GetMapping("/single")
    public User single(){
        return new User();
    }
}
