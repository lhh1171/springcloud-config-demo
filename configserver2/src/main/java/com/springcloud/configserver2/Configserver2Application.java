package com.springcloud.configserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Configserver2Application {

	public static void main(String[] args) {
		//访问localhost:9999/application/master
		//localhost:9999/jqk/abc/master
		SpringApplication.run(Configserver2Application.class, args);
	}

}
