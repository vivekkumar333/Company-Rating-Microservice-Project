package com.learnwithtiwari.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JobMicroServiceApplication {
	

	@Bean @LoadBalanced
	RestTemplate resetTemplate() {
		return new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(JobMicroServiceApplication.class, args);
	}

}
