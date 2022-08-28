package com.fundamentosPlatzi.springboot.fundamentos.configuration;

import com.fundamentosPlatzi.springboot.fundamentos.bean.MyBeanPropertiesImplement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanPropertiesImplement function() {
        return new MyBeanPropertiesImplement(name, apellido);
    }
}
