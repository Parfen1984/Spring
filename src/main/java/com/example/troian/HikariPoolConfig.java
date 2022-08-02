package com.example.troian;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HikariPoolConfig {

    @Bean
    @ConfigurationProperties(prefix = "default-hikari-pool")
    public HikariProperties defProps() {
        return new HikariProperties();
    }

}