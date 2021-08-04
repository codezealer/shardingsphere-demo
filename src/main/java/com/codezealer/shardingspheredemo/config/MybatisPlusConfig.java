package com.codezealer.shardingspheredemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.codezealer.shardingspheredemo.mapper")
public class MybatisPlusConfig {
}
