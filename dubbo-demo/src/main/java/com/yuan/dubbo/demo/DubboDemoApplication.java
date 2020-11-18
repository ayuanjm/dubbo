package com.yuan.dubbo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author yuan
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DubboDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoApplication.class, args);
    }

}
