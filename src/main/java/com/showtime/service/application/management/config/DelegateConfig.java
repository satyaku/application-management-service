package com.showtime.service.application.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.showtime.service.application.management.delegates.implementation.GetAllUsersDelegate;
import com.showtime.service.application.management.delegates.interfaces.IGetAllUsersDelegate;

@Configuration
public class DelegateConfig {
	
	@Bean
	public IGetAllUsersDelegate getBeanAllUsersDelegate(){
		return new GetAllUsersDelegate();
	}

}
