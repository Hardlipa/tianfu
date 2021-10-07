package com.wucy.tianfu.service.impl;

import com.wucy.tianfu.domain.Todo;
import com.wucy.tianfu.mapper.TodoMapper;
import com.wucy.tianfu.service.TodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wucy
 * @since 2021-10-07
 */
@Service
public class TodoServiceImpl extends ServiceImpl<TodoMapper, Todo> implements TodoService {

}
