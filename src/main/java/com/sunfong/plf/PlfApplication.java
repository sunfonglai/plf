package com.sunfong.plf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.sunfong.plf.mapper")
@SpringBootApplication
public class PlfApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlfApplication.class, args);
    }
}
