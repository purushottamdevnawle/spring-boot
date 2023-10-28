package com.spring.apprunner;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ApplicationRunner getApplicationRunner() {
        return (args) -> {
            System.out.println("Source args " + Arrays.toString(args.getSourceArgs()));
            args.getOptionNames().forEach(arg -> System.out.println("Optional arg " + arg + " : " + args.getOptionValues(arg)));
            args.getNonOptionArgs().forEach(arg -> System.out.println("Mandatory arg " + arg + " : " + args.getOptionValues(arg)));
        };
    }
}
