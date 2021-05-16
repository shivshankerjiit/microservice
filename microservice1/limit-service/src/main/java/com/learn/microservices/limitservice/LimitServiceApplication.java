package com.learn.microservices.limitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// springInitialzer -> web,actuator,devtools,configCloud
//create config class matching field from 'application.properties' -> @Component ,@ConfigurationProperties(value = "limit-service")
//application.properties -> limit-service.minimum=2

@SpringBootApplication
public class LimitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitServiceApplication.class, args);
	}

}
