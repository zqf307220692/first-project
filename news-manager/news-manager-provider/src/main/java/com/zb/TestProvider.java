package com.zb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zb.mapper")
public class TestProvider {
    public static void main(String [] args){
        SpringApplication.run(TestProvider.class);
    }
}
