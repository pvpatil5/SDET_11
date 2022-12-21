package com.sales.pctraders.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData_propfile 
{

	public String redadatafrompropfile(String key) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(IAutoConstants.PROPFILEPATH);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String value=properties.getProperty(key);
		return value;

	}
	public String redadatafrompropfile_MAnu(String key) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(IAutoConstants.PROPFILEPATH2);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String value=properties.getProperty(key);
		return value;

	}
}
