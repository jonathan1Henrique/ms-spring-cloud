package com.blackti.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableEurekaClient
@SpringBootApplication
public class UsuarioApplication {



    public static void main(String[] args) {
//        System.out.println("BCRYPT = "  + new BCryptPasswordEncoder().encode("12345"));
        SpringApplication.run(UsuarioApplication.class, args);

    }

}
