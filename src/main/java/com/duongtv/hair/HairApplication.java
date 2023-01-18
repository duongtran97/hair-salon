package com.duongtv.hair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.duongtv.hair.entities.UserEntities;
import com.duongtv.hair.repository.UserRepositiry;

@SpringBootApplication
public class HairApplication {

	private static final Logger logger = LoggerFactory.getLogger(HairApplication.class) ;
	public static void main(String[] args) {
		SpringApplication.run(HairApplication.class, args);
	}
public CommandLineRunner demo(UserRepositiry userRepositiry) {
	return (args) -> {
		// fetch all customers
		logger.info("Customers found with findAll():");
		logger.info("-------------------------------");
		for (UserEntities userEntities : userRepositiry.findAll()) {
			logger.info(userEntities.toString());
		}
		logger.info("");
	};
}
}
