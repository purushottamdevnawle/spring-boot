package com.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Application started");
    }

    @Bean
    public CommandLineRunner getRunner() {
        return (args) -> {
            System.out.println("Commandline Runner 1 " + Arrays.toString(args));
        };
    }
}
