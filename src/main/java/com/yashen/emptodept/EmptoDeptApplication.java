package com.yashen.emptodept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class EmptoDeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmptoDeptApplication.class, args);
        System.out.println("Server is Running");
    }

}
