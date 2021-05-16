package com.learn.microservices.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//springInitialize -> spring cloud-server, devtools
//create git repo and file 'limit-service.properties'
// application.properties -> spring.cloud.config.server.git.uri=file:\\{pwd}
// @EnableConfigServer
//http://localhost:8888/{nameOfConfigurationFileInGit}/default = http://localhost:8888/limit-service/default

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}

}
