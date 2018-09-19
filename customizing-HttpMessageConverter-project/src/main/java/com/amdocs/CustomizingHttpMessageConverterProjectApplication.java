package com.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CustomizingHttpMessageConverterProjectApplication extends SpringBootServletInitializer {

	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CustomizingHttpMessageConverterProjectApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomizingHttpMessageConverterProjectApplication.class, args);
	}
}
