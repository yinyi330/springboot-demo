package com.yinyispringbootdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yinyispringbootdemo.dao.UserDao;
import com.yinyispringbootdemo.entity.User;
import com.yinyispringbootdemo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-08-06 19:53:38
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}

