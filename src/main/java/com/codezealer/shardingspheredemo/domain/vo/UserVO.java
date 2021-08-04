package com.codezealer.shardingspheredemo.domain.vo;

import lombok.Data;

@Data
public class UserVO {

    private int id;
    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

}
