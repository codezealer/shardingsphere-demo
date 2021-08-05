package com.codezealer.shardingspheredemo.controller;

import com.codezealer.shardingspheredemo.entity.User;
import com.codezealer.shardingspheredemo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/select")
    public List<User> select() {
        return userService.getUserList();
    }

    @GetMapping("/select/{id}")
    public User selectById(@PathVariable("id") Long id) {
        return userService.selectById(id);
    }

    @PostMapping("/insert")
    public Boolean insert(@RequestBody User user) {
        return userService.save(user);
    }
}