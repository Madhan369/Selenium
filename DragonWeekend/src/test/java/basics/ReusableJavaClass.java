package basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReusableJavaClass {

	/**
	 * This method will be used to read to data from propertt file in Key &
	 * value pair format
	 * 
	 * @author Madhan
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/dragondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
		
	}
}
