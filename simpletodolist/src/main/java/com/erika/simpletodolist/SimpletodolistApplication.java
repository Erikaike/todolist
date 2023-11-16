package com.erika.simpletodolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.erika.simpletodolist.service.Generator;

@SpringBootApplication
public class SimpletodolistApplication {

	@Autowired
	public Generator generatorService;

	public static void main(String[] args) {
		SpringApplication.run(SimpletodolistApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return (String[] args) -> {
			generatorService.generateInitTasks();
		};
	}

}
