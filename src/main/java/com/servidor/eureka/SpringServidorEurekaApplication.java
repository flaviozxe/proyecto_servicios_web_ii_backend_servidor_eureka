package com.servidor.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//HABILITAR TIPO DE PROYECTO EUREKA SERVER 
@EnableEurekaServer
@SpringBootApplication
public class SpringServidorEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServidorEurekaApplication.class, args);
	}

}
