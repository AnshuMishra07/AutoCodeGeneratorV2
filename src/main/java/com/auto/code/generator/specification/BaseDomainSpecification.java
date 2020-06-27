package com.auto.code.generator.specification;

import java.util.List;
import java.util.Set;

public class BaseDomainSpecification {
	private String className;
	private List<FieldSpecification> fields;
	private Boolean generate;
	private String enumName;
	private Set<String> enumValues;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Boolean getGenerate() {
		return generate;
	}

	public void setGenerate(Boolean generate) {
		this.generate = generate;
	}

	public String getEnumName() {
		return enumName;
	}

	public void setEnumName(String enumName) {
		this.enumName = enumName;
	}

	public Set<String> getEnumValues() {
		return enumValues;
	}

	public void setEnumValues(Set<String> enumValues) {
		this.enumValues = enumValues;
	}

	public List<FieldSpecification> getFields() {
		return fields;
	}

	public void setFields(List<FieldSpecification> fields) {
		this.fields = fields;
	}

}
