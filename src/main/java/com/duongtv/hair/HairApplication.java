package com.duongtv.hair;

import com.duongtv.hair.iservice.IStorageService;
import com.duongtv.hair.properties.StorageProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class HairApplication {

	public static void main(String[] args) {
		SpringApplication.run(HairApplication.class, args);
	}
	@Bean
	CommandLineRunner init(IStorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}
}
