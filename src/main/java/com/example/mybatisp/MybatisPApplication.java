package com.example.mybatisp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatisp")
public class MybatisPApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPApplication.class, args);
    }

}
