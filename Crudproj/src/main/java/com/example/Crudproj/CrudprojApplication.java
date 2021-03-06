package com.example.Crudproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="controller,service,model")
@EnableJpaRepositories(basePackages="service")
@EntityScan(basePackages="service")
@SpringBootApplication
public class CrudprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudprojApplication.class, args);
	}

}