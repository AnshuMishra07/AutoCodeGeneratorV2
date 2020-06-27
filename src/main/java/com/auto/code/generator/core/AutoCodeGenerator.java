package com.auto.code.generator.core;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.collections4.CollectionUtils;

import com.auto.code.generator.specification.APIType;
import com.auto.code.generator.specification.ApiSpecification;
import com.auto.code.generator.specification.GeneralSpecification;
import com.auto.code.generator.specification.Utility;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.codemodel.JCodeModel;

public class AutoCodeGenerator {
	private final static String SPEC_FILE_NAME = "specificationFile";

	public static void main(String[] args) throws Exception {
		String specificationFile = System.getProperty(SPEC_FILE_NAME);
		if (specificationFile == null) {
			throw new Exception("specification file not found......");
		}
		ObjectMapper mapper = new ObjectMapper();
		// JSON file to Java object
		GeneralSpecification specification = mapper.readValue(new File(specificationFile), GeneralSpecification.class);
		if (specification == null) {
			throw new Exception("Blank specification file......");
		}
		Utility.validateSpecification(specification);
		String autoGenerateFilePath = specification.getAutoGeneratedFilePath();
		try {
			if (specification != null && specification.getApiSpecification() != null
					&& CollectionUtils.isNotEmpty(specification.getApiSpecification())) {
				// creating target dir.
				Path path = Paths.get(autoGenerateFilePath + "/target/classes");
				if (!Files.exists(path)) {
					try {
						Files.createDirectories(path);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				JCodeModel codeModel = new JCodeModel();
				RequestGenerator requestGenerator = new RequestGenerator();
				ResponseGenerator responseGenerator = new ResponseGenerator();
				for (ApiSpecification spec : specification.getApiSpecification()) {
					if ((spec.getApiMethodType().equalsIgnoreCase(APIType.POST.name())
							|| spec.getApiMethodType().equalsIgnoreCase(APIType.PUT.name()))
							&& spec.getApiRequest().getGenerate()) {
						requestGenerator.generateRequest(codeModel, spec, specification.getBasePackageName(),
								autoGenerateFilePath);
					}
					if (spec.getApiResponse().getGenerate()) {
						responseGenerator.generateResponse(codeModel, spec, specification.getBasePackageName(),
								autoGenerateFilePath);
					}
				}
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {

			if (specification != null && specification.getApiSpecification() != null
					&& CollectionUtils.isNotEmpty(specification.getApiSpecification())) {
				JCodeModel codeModel = new JCodeModel();
				for (ApiSpecification spec : specification.getApiSpecification()) {
					ControllerGenerator.generateController(codeModel, spec, specification.getBasePackageName(),
							specification.getRootPath(), autoGenerateFilePath);
				}
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
