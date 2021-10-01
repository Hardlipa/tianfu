package com.wucy.tianfu.restapi;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wucy.tianfu.domain.Sex;
import com.wucy.tianfu.service.SexService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wucy
 * @since 2021-10-01
 */
@RestController
@RequestMapping("/sex")
public class SexController {

    @Resource
    private SexService sexService;

    /**
     * 记录
     * @param sex
     */
    @PostMapping("notes")
    public void notes(Sex sex) {
        sexService.save(sex);
    }

    @PutMapping("update")
    public void update(Sex sex) {
        sexService.updateById(sex);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable String id) {
        sexService.removeById(id);
    }
}
