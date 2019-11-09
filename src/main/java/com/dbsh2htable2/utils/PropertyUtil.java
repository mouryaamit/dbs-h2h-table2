package com.dbsh2htable2.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dbsh2htable2.DbsH2hTable2Application;

public class PropertyUtil {
	private static Properties properties;

	private static final Logger logger = LoggerFactory.getLogger(DbsH2hTable2Application.class);

	public static void setProperties(String propertyFilePath) {
		logger.debug("propertyFilePath " + propertyFilePath);
		File file = new File(propertyFilePath);
		FileInputStream fileInput;
		properties = new Properties();

		try {
			fileInput = new FileInputStream(file);
			properties.load(fileInput);
			fileInput.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getProperty(String propertyName) {

		return properties.getProperty(propertyName);

	}
}
