package com.example.belajar.spring.demo;

import com.example.belajar.spring.demo.entity2.Address;
import com.example.belajar.spring.demo.entity2.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {

    @Bean
    public Address getAddress(){
        return new Address("Jalan Wijahan", 21);
    }
}
