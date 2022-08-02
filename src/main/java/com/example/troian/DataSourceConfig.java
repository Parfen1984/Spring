package com.example.troian;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Slf4j
@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource(HikariProperties properties) {
        return new HikariDataSource(buildHikariConfig(properties));
    }

    public static HikariConfig buildHikariConfig(HikariProperties props) {
        HikariConfig config = new HikariConfig();

        config.setPoolName(props.getPoolName());
        config.setJdbcUrl(props.getUrl());
        config.setUsername(props.getUsername());
        config.setPassword(props.getPassword());
        config.setDriverClassName(props.getDriverClassName());

        config.setMinimumIdle(props.getMinIdle());
        config.setMaximumPoolSize(props.getMaxPoolSize());
        config.setMaxLifetime(props.getMaxLifeTime());

        if (props.getIdleTimeout() != null) {
            config.setIdleTimeout(props.getIdleTimeout());
        }
        if (props.getConnectionTimeout() != null) {
            config.setConnectionTimeout(props.getConnectionTimeout());
        }

        return config;
    }
}