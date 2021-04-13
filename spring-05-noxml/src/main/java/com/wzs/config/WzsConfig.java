package com.wzs.config;

import com.wzs.pojo.User;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wzs.pojo")
public class WzsConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
