package com.blackti.folha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FolhaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FolhaApplication.class, args);
    }

}
