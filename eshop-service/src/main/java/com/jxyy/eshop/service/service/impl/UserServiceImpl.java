package com.jxyy.eshop.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxyy.eshop.bean.model.User;
import com.jxyy.eshop.service.mapper.UserMapper;
import com.jxyy.eshop.service.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
