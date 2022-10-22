package com.devsworlds.core.config;

import com.devsworlds.core.service.DBService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    private DBService dbService;

    @Bean
    public void instanciaDB() {

    }
}
