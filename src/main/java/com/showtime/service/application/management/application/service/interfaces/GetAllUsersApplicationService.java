package com.showtime.service.application.management.application.service.interfaces;

import java.util.List;

import com.showtime.service.application.management.application.service.implementation.IGetAllUsersApplicationService;
import com.showtime.service.application.management.generated.model.UserDtls;

public class GetAllUsersApplicationService implements IGetAllUsersApplicationService {

	@Override
	public List<UserDtls> fetchUsers(String status, List<String> sort, Integer offset, Integer limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
