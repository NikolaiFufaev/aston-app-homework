package com.example.aston_app_homework;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = JacksonAutoConfiguration.class)
public class AstonAppHomeworkApplication extends SpringBootServletInitializer {
  	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(AstonAppHomeworkApplication.class).web(WebApplicationType.SERVLET);
		ConfigurableApplicationContext context = builder.build().run(args);
	}


}
