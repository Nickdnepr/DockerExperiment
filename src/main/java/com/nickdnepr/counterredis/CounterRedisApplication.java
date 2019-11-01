package com.nickdnepr.counterredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CounterRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(CounterRedisApplication.class, args);
    }

}
