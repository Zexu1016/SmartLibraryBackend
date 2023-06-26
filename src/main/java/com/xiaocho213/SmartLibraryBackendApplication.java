package com.xiaocho213;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaocho213.repository")
public class SmartLibraryBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartLibraryBackendApplication.class, args);
    }

}
