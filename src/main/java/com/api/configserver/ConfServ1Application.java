package com.api.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfServ1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfServ1Application.class, args);
	}

}
