package com.codezealer.shardingspheredemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_user")
public class User extends Model<User> {
    /**
     * 主键Id
     */
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