package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**设计模式*/
@SpringBootApplication
@EnableTransactionManagement
public class DesignModeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignModeApplication.class, args);
    }

}
