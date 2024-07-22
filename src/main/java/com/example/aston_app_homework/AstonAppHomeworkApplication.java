package com.example.aston_app_homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AstonAppHomeworkApplication extends SpringBootServletInitializer {
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(AstonAppHomeworkApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AstonAppHomeworkApplication.class, args);
	}


}
