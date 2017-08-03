package com.antilamer.jsfShop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Value("${spring.datasource.url}")
    private String dataBaseURL;

    @Value("${spring.datasource.username}")
    private String dataBaseUsername;

    @Value("${spring.datasource.password}")
    private String dataBasePassword;

    @Value("${spring.jpa.properties.hibernate.default_schema}")
    private String dataBaseSchema;

    @Bean(name = "dataSource")
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        driverManagerDataSource.setUrl(dataBaseURL);
        driverManagerDataSource.setUsername(dataBaseUsername);
        driverManagerDataSource.setPassword(dataBasePassword);
        driverManagerDataSource.setSchema(dataBaseSchema);
        return driverManagerDataSource;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
}
