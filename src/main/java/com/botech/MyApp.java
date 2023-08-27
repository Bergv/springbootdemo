package com.botech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.botech.mapper")
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
        System.out.println("-----------");
        System.out.println("---  1  ---");
        System.out.println("---  2  ---");
        System.out.println("---  3  ---");
        System.out.println("-----------");

        System.out.println(666);
        System.out.println();
        System.out.println();
    }
}
