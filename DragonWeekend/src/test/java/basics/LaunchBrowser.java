package basics;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.trello.qspider.genericutility.JavaUtility;

public class LaunchBrowser {

	public static WebDriver driver ;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		JavaUtility javaUtils = new JavaUtility();
		if (javaUtils.readDataFromPropertyFile("browserName").equals("chrome")) {
			driver = new ChromeDriver();
		} else if (javaUtils.readDataFromPropertyFile("browserName").equals("edge")) {
			driver = new EdgeDriver();
		} else if (javaUtils.readDataFromPropertyFile("browserName").equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
	}

}
