package com.codezealer.shardingspheredemo.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codezealer.shardingspheredemo.entity.User;
import com.codezealer.shardingspheredemo.mapper.UserMapper;
import com.codezealer.shardingspheredemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public boolean save(User entity) {
        return userMapper.insert(entity) > 0;
    }

    @Override
    public List<User> getUserList() {
        return userMapper.selectList(Wrappers.lambdaQuery());
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectById(id);
    }
}