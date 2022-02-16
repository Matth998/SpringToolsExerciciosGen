package com.generation.exercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Exercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}

}
