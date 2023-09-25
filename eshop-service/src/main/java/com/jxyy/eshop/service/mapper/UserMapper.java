package com.jxyy.eshop.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxyy.eshop.bean.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
