package com.haihong.charge.connectivity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.haihong.charge.connectivity.dao")
public class ChargeConnectivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChargeConnectivityApplication.class, args);
    }

}
