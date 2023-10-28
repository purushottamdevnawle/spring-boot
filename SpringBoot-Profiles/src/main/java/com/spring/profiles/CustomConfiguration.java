package com.spring.profiles;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomConfiguration {

    @Value("${app.value}")
    private int value;

    @EventListener(ApplicationStartedEvent.class)
    public void getApplicationRunner() {
        System.out.println(value);
    }
}
