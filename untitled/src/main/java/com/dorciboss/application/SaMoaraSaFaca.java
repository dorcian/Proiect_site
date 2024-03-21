package com.dorciboss.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.dorciboss")
public class SaMoaraSaFaca {
    public static void main(String[] args) {
       SpringApplication.run(SaMoaraSaFaca.class, args);
    }
}

