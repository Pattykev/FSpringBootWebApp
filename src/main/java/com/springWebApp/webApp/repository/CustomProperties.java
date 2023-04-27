package com.springWebApp.webApp.repository;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "com.springwebapp.webapp")
@Data
public class CustomProperties {
    private String apiUrl;
}
