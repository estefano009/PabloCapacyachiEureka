package com.idat.pe;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekaServerFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerFinalApplication.class, args);
	}

}
