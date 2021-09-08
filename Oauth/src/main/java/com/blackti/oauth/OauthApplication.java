package com.blackti.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class OauthApplication {

    public static void main(String[] args) {
//        System.out.println(new BCryptPasswordEncoder().encode("123456"));
        SpringApplication.run(OauthApplication.class, args);
    }

}
