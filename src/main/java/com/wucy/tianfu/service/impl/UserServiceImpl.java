package com.wucy.tianfu.service.impl;

import com.wucy.tianfu.domain.User;
import com.wucy.tianfu.mapper.UserMapper;
import com.wucy.tianfu.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wucy
 * @since 2021-10-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public boolean checkUsername(String username) {
        return false;
    }
}
