package com.showtime.service.application.management.delegates.implementation;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.showtime.service.application.management.api.parameters.GetAllUsersParameters;
import com.showtime.service.application.management.application.service.implementation.IGetAllUsersApplicationService;
import com.showtime.service.application.management.delegates.interfaces.IGetAllUsersDelegate;
import com.showtime.service.application.management.generated.model.UserDtls;

public class GetAllUsersDelegate implements IGetAllUsersDelegate {
	
	private static final Logger log = LoggerFactory.getLogger(GetAllUsersDelegate.class);
	
	@Inject
	private IGetAllUsersApplicationService getAllUsersApplicationService;

	@Override
	public ResponseEntity<List<UserDtls>> execute(GetAllUsersParameters getAllUsersParameters) {
		
		long startTime = System.currentTimeMillis();
		log.debug("Input to EP : ", getAllUsersParameters);
		String status = getAllUsersParameters.getStatus();
		String acceptLanguage = getAllUsersParameters.getAcceptLanguage();
		List<String> sort = getAllUsersParameters.getSort();
		Integer offset = getAllUsersParameters.getOffset();
		Integer limit = getAllUsersParameters.getLimit();
		
		List<UserDtls> response = getAllUsersApplicationService.fetchUsers(status,sort,offset,limit);
		
		log.info("Time taken by the API in MS : ", startTime - System.currentTimeMillis());
		return new ResponseEntity<>(response,HttpStatus.OK);
	}

}
