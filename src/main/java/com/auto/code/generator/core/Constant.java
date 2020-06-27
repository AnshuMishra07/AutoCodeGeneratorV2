package com.auto.code.generator.core;

public class Constant {
	public final static String REST_CONTROLLER_ANNOTATION = "org.springframework.web.bind.annotation.RestController";
	public final static String REQUEST_MAPPING = "org.springframework.web.bind.annotation.RequestMapping";
	public final static String POST_MAPPING = "org.springframework.web.bind.annotation.PostMapping";
	public final static String PATH_VARIABLE_ANNOTATION = "org.springframework.web.bind.annotation.PathVariable";
	public final static String REQUEST_BODY_ANNOTATION = "org.springframework.web.bind.annotation.RequestBody";
	public final static String AUTOWIRE_ANNOTATION = "org.springframework.beans.factory.annotation.Autowired";
	public final static String GET_MAPPING = "org.springframework.web.bind.annotation.GetMapping";
	public final static String REQUEST_PARAM = "org.springframework.web.bind.annotation.RequestParam";
	public final static String PUT_MAPPING = "org.springframework.web.bind.annotation.PutMapping";
	public final static String DELETE_MAPPING = "org.springframework.web.bind.annotation.DeleteMapping";
	public final static String REPOSITORY_ANNOTATION = "org.springframework.stereotype.Repository";
	public final static String SERVICE_ANNOTATION = "org.springframework.stereotype.Service";

	// Domain
	public final static String DOMAIN_PACKAGE_NAME = ".domain.";
	public final static String DAO_PACKAGE_NAME = ".dao.";
	public final static String SERVICE_PACKAGE_NAME = ".service.";

	public final static String REQUEST_VARIABLE_NAME = "request";
	public final static String RESPONSE_VARIABLE_NAME = "response";
	// Compiling Java Classes. Please don't change.
	public final static String FILE_SEPRATOR = "file.separator";
	public final static String JAVA_CLASS_PATH = "java.class.path";
	public final static String PATH_SEPRATOR = "path.separator";
	public final static String CURRENT_DIR = ".";
	public final static String SPACE = " ";
	public final static String COMPILE_COMMAND = "javac  -classpath ";
	public final static String DESTINATION_DIR_CMD = " -d ";

	public final static String JAVA_EXT = ".java";
	public final static String TARGET_DIR = "target/classes/";

}