package com.nicolas.canionapi;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)//substituindo a implementação padrão pela customizada
public class ApiApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		SpringApplication.run(ApiApplication.class, args);
	}

}
