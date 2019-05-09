package com.adriano.controledeexpedicao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ControledeexpedicaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControledeexpedicaoApplication.class, args);
    }

}
