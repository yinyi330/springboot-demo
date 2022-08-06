package com.yinyispringbootdemo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yinyispringbootdemo.dao.ResponesData;
import com.yinyispringbootdemo.entity.User;
import com.yinyispringbootdemo.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-08-06 19:53:20
 */
@RestController
@RequestMapping("user")
public class UserController  {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param user 查询实体
     * @return 所有数据
     */
    @GetMapping("selectAll")
    @ApiOperation(value = "swagger测试")
    public ResponesData selectAll(Page<User> page, User user) {
        return  ResponesData.success(this.userService.page(page, new QueryWrapper<>(user)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selelectOne/{id}")
    @ApiOperation(value = "swagger测试")
    public ResponesData selectOne(@PathVariable String id) {
        return ResponesData.success((this.userService.getById(id)));
    }

    /**
     * 新增数据
     *
     * @param user 实体对象
     * @return 新增结果
     */
    @PostMapping("/insert")
    @ApiOperation(value = "swagger测试")
    public ResponesData insert(@RequestBody User user) {
        return ResponesData.success((this.userService.save(user)));
    }

    /**
     * 修改数据
     *
     * @param user 实体对象
     * @return 修改结果
     */
    @PutMapping("/update")
    @ApiOperation(value = "swagger测试")
    public ResponesData update(@RequestBody User user) {
        return ResponesData.success(((this.userService.updateById(user))));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping("/delete")
    @ApiOperation(value = "swagger测试")
    public ResponesData delete(@RequestParam("idList") List<Long> idList) {
        return ResponesData.success((this.userService.removeByIds(idList)));
    }
}

