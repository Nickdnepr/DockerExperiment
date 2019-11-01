package com.nickdnepr.counterredis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class Config {

    @Bean
    JedisConnectionFactory factory(){
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName("redis-server");
        jedisConnectionFactory.setPort(6379);
        return jedisConnectionFactory;
    }

    @Bean
    RedisTemplate<String, Object> template(){
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory());
        return template;
    }

}
