package com.example.troian;

import lombok.Data;

@Data
public class HikariProperties {

    private String poolName;

    private String url;
    private String username;
    private String password;
    private String driverClassName;

    private Long maxLifeTime;
    private Integer minIdle;
    private Integer maxPoolSize;

    private Long idleTimeout;
    private Long connectionTimeout;

}