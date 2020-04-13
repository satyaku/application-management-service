package com.showtime.service.application.management.delegates.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.showtime.service.application.management.api.parameters.GetAllUsersParameters;
import com.showtime.service.application.management.generated.model.UserDtls;

public interface IGetAllUsersDelegate {
	
	public ResponseEntity<List<UserDtls>> execute(GetAllUsersParameters getAllUsersParameters);

}
