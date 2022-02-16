package com.generation.exercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Exercicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio2Application.class, args);
	}

}
