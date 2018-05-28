package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.example.demo"} , exclude = JpaRepositoriesAutoConfiguration.class)
public class TestApplication3UsingHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication3UsingHibernateApplication.class, args);
	}
}
