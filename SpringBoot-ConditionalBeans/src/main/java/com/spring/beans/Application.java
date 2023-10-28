package com.spring.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        System.out.println("Messenger type " + applicationContext.getBean("messenger"));
    }

    @Bean(value = "messenger")
    @ConditionalOnProperty(prefix = "my.app", name = "messenger", havingValue = "Facebook")
    public Messenger getFacebookMessenger() {
        System.out.println("Facebook Messenger");
        return new Messenger() {
        };
    }

    @Bean(value = "messenger")
    @ConditionalOnMissingBean(name = "messenger")
    public Messenger getDefaultMessenger() {
        System.out.println("Default Messenger");
        return new Messenger() {
        };
    }
}
