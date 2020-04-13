package com.showtime.service.application.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.showtime.service.application.management.api.parameters.GetAllUsersParameters;

@Configuration
public class ParametersConfig {
	
	@Bean
	@Scope(value = "prototype")
	public GetAllUsersParameters getBeanAllUsersParameters(){
		return new GetAllUsersParameters();
	}

}
