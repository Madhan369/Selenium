package com.trello.qspider.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JavaUtility {

	/**
	 * This method will be used to read the common data from the properties file
	 * 
	 * @author Madhan
	 * @param key
	 * @return value
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws FileNotFoundException, IOException {
		Properties pobj = new Properties();
		pobj.load(new FileInputStream("./src/test/resources/dragondata.properties"));
		String value = pobj.getProperty(key);
		return value;
	}
}
