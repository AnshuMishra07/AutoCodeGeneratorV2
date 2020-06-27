package com.auto.code.generator.core;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Compiler {

	private static void runProcess(String command) throws Exception {
		System.out.println("Java class Path---" + System.getProperty(Constant.JAVA_CLASS_PATH));
		Process pro = Runtime.getRuntime().exec(command);
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(pro.getInputStream()));

		BufferedReader stdError = new BufferedReader(new InputStreamReader(pro.getErrorStream()));

		// Read the output from the command
		System.out.println("Here is the standard output of the command:\n");
		String s = null;
		while ((s = stdInput.readLine()) != null) {
			System.out.println(s);
		}

		// Read any errors from the attempted command
		System.out.println("Here is the standard error of the command (if any):\n");
		while ((s = stdError.readLine()) != null) {
			System.out.println(s);
		}
		pro.waitFor();
	}

	public void compile(String sourceDir, String destinationDir) {
		try {
			String path = System.getProperty(Constant.PATH_SEPRATOR);
			StringBuilder builder = new StringBuilder();
			builder.append(Constant.COMPILE_COMMAND);
			builder.append(destinationDir);
			builder.append(Constant.CURRENT_DIR);
			builder.append(path);
			builder.append(System.getProperty(Constant.JAVA_CLASS_PATH));
			builder.append(Constant.SPACE);
			builder.append(sourceDir);
			builder.append(Constant.DESTINATION_DIR_CMD);
			builder.append(destinationDir);
			runProcess(builder.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
