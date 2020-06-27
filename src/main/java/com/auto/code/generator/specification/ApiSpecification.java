package com.auto.code.generator.specification;

import java.util.List;

import javax.validation.constraints.NotBlank;

public class ApiSpecification {
	@NotBlank
	private String apiUrl;
	@NotBlank
	private String apiMethodType;
	private BusinessClassSpecification service;
	private BusinessClassSpecification dao;
	private BusinessClassSpecification controller;
	private DomainSpecification apiRequest;
	@NotBlank
	private DomainSpecification apiResponse;
	private List<FieldSpecification> queryParams;

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getApiMethodType() {
		return apiMethodType;
	}

	public void setApiMethodType(String apiMethodType) {
		this.apiMethodType = apiMethodType;
	}

	public DomainSpecification getApiRequest() {
		return apiRequest;
	}

	public void setApiRequest(DomainSpecification apiRequest) {
		this.apiRequest = apiRequest;
	}

	public DomainSpecification getApiResponse() {
		return apiResponse;
	}

	public void setApiResponse(DomainSpecification apiResponse) {
		this.apiResponse = apiResponse;
	}

	public List<FieldSpecification> getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(List<FieldSpecification> queryParams) {
		this.queryParams = queryParams;
	}

	public BusinessClassSpecification getService() {
		return service;
	}

	public void setService(BusinessClassSpecification service) {
		this.service = service;
	}

	public BusinessClassSpecification getController() {
		return controller;
	}

	public void setController(BusinessClassSpecification controller) {
		this.controller = controller;
	}

	public void setDao(BusinessClassSpecification dao) {
		this.dao = dao;
	}

	public BusinessClassSpecification getDao() {
		return dao;
	}

}
