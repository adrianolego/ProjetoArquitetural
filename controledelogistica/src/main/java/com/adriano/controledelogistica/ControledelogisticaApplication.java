package com.adriano.controledelogistica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ControledelogisticaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControledelogisticaApplication.class, args);
    }

}
