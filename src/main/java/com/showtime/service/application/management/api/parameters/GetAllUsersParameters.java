package com.showtime.service.application.management.api.parameters;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class GetAllUsersParameters {
	
	private String status;
	
	private String acceptLanguage;
	
	private HttpServletRequest httpServletRequest;

	private List<String> sort;
	
	private Integer offset;
	
	private Integer limit;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAcceptLanguage() {
		return acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}

	public HttpServletRequest getHttpServletRequest() {
		return httpServletRequest;
	}

	public void setHttpServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}

	public List<String> getSort() {
		return sort;
	}

	public void setSort(List<String> sort) {
		this.sort = sort;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "GetAllUsersParameters [status=" + status + ", acceptLanguage=" + acceptLanguage
				+ ", httpServletRequest=" + httpServletRequest + ", sort=" + sort + ", offset=" + offset + ", limit="
				+ limit + "]";
	}
	
	
}
