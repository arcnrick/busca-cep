package com.crianto.buscacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BuscaCepApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuscaCepApplication.class, args);
    }
}