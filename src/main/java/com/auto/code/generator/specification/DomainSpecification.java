package com.auto.code.generator.specification;

import java.util.List;

public class DomainSpecification extends BaseDomainSpecification {
	private String returnType;
	private List<BaseDomainSpecification> complexType;

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public List<BaseDomainSpecification> getComplexType() {
		return complexType;
	}

	public void setComplexType(List<BaseDomainSpecification> complexType) {
		this.complexType = complexType;
	}

}
