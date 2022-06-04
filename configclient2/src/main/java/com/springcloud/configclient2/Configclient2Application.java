package com.springcloud.configclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class Configclient2Application {
	//curl -X POST http://localhost:9090/actuator/refresh
	public static void main(String[] args) {
		SpringApplication.run(Configclient2Application.class, args);
	}

}
