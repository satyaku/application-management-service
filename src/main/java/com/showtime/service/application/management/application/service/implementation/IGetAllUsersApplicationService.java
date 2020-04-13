package com.showtime.service.application.management.application.service.implementation;

import java.util.List;

import com.showtime.service.application.management.generated.model.UserDtls;

public interface IGetAllUsersApplicationService {

	public List<UserDtls> fetchUsers(String status, List<String> sort, Integer offset, Integer limit);

}
