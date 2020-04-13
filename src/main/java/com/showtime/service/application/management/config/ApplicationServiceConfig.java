package com.showtime.service.application.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.showtime.service.application.management.application.service.implementation.IGetAllUsersApplicationService;
import com.showtime.service.application.management.application.service.interfaces.GetAllUsersApplicationService;

@Configuration
public class ApplicationServiceConfig {
	
	@Bean
	public IGetAllUsersApplicationService getBeanAllUsersApplicationService(){
		return new GetAllUsersApplicationService();
	}
	

}
