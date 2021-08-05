package com.codezealer.shardingspheredemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codezealer.shardingspheredemo.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 保存用户信息
     *
     * @param entity
     * @return
     */
    boolean save(User entity);

    /**
     * 查询全部用户信息
     *
     * @return
     */
    List<User> getUserList();

    User selectById(Long id);
}