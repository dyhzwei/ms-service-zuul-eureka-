package com.dsl.mshello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsHelloApplication.class, args);
	}

}
