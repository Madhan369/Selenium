package basics;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromProperties {
	public void readDataFromPropertiesFile() throws Throwable {
		//Create an object for file Input stream with dile relative path.
		FileInputStream fis = new FileInputStream("./src/test/resources/dragondata.properties");
		// Create an object of properties class of java
		Properties pobj = new Properties();
		// Load the fis object to pobj obj ref
		pobj.load(fis);
		// from properties object call the getProperties()
		String value = pobj.getProperty("url");
		System.out.println(value);
	}

}
