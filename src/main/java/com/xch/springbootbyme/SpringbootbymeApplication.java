package com.xch.springbootbyme;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(value = {"com.xch.springbootbyme.dao"})
@EnableTransactionManagement
public class SpringbootbymeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootbymeApplication.class, args);
    }

}
