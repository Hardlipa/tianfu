package com.wucy.tianfu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wucy.tianfu.mapper")
public class TianfuApplication {

    public static void main(String[] args) {
        SpringApplication.run(TianfuApplication.class, args);
    }

}
