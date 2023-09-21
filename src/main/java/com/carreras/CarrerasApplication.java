package com.carreras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.persistence_escuela.repository")
@EntityScan(basePackages = {"com.persistence_escuela.entity"})
public class CarrerasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrerasApplication.class, args);
	}

}
