package com.qinsol.insbot.nbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PolicyAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolicyAdminApplication.class, args);
	}
}
