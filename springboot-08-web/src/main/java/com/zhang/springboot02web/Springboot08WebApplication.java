package com.zhang.springboot02web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.zhang.springboot02web.Dao")
@SpringBootApplication
public class Springboot08WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot08WebApplication.class, args);
    }

}
