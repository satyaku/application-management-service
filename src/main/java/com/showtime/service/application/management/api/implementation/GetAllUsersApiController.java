package com.showtime.service.application.management.api.implementation;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.showtime.service.application.management.api.parameters.GetAllUsersParameters;
import com.showtime.service.application.management.delegates.interfaces.IGetAllUsersDelegate;
import com.showtime.service.application.management.generated.api.GetAllUsersApi;
import com.showtime.service.application.management.generated.model.UserDtls;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

@Controller
@Scope(value = "prototype")
public class GetAllUsersApiController implements GetAllUsersApi, ApplicationContextAware {

	private static final Logger log = LoggerFactory.getLogger(GetAllUsersApiController.class);

	@Inject
	private HttpServletRequest httpServletRequest;

	private final ObjectMapper objectMapper;

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@org.springframework.beans.factory.annotation.Autowired
	public GetAllUsersApiController(HttpServletRequest request, ObjectMapper objectMapper) {
		this.httpServletRequest = request;
		this.objectMapper = objectMapper;
	}

	@Override
	public ResponseEntity<List<UserDtls>> getAllUsers(
			@NotNull @ApiParam(value = "Get users by status Active All ", required = true) @Valid @RequestParam(value = "status", required = true) String status,
			@NotNull @ApiParam(value = "Requested number of resources to be provided in the response requested by the client ", required = true) @Valid @RequestParam(value = "limit", required = true) Integer limit,
			@NotNull @ApiParam(value = "Requested index for start of resources to be provided in the response requested by the client  ", required = true) @Valid @RequestParam(value = "offset", required = true) Integer offset,
			@ApiParam(value = "The locale of the client ") @RequestHeader(value = "Accept-Language", required = false) String acceptLanguage,
			@ApiParam(value = "The fields by which the response is sorted. The supported value is - priority. ") @Valid @RequestParam(value = "sort", required = false) List<String> sort) {
		/*
		 * String accept = httpServletRequest.getHeader("Accept"); if (accept !=
		 * null && accept.contains("application/json;charset=utf-8")) { try {
		 * return new ResponseEntity<List<UserDtls>>(objectMapper.
		 * readValue("[ {  \"email\" : \"email\",  \"username\" : \"username\"}, {  \"email\" : \"email\",  \"username\" : \"username\"} ]"
		 * , List.class), HttpStatus.NOT_IMPLEMENTED); } catch (IOException e) {
		 * log.
		 * error("Couldn't serialize response for content type application/json;charset=utf-8"
		 * , e); return new
		 * ResponseEntity<List<UserDtls>>(HttpStatus.INTERNAL_SERVER_ERROR); } }
		 */

		IGetAllUsersDelegate getAllUsersDelegate = this.applicationContext.getBean(IGetAllUsersDelegate.class);
		GetAllUsersParameters getAllUsersParameters = this.applicationContext.getBean(GetAllUsersParameters.class);

		getAllUsersParameters.setHttpServletRequest(this.httpServletRequest);
		getAllUsersParameters.setAcceptLanguage(acceptLanguage);
		getAllUsersParameters.setStatus(status);
		getAllUsersParameters.setSort(sort);
		getAllUsersParameters.setOffset(offset);
		getAllUsersParameters.setLimit(limit);

		return getAllUsersDelegate.execute(getAllUsersParameters);
	}

}
