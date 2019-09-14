package com.kgc.ftltest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.kgc.ftltest.dao")
@EnableTransactionManagement
public class FtltestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FtltestApplication.class, args);
    }

}
