package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class B extends DriverReusableWebdriverFunctions {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		ReusableJavaClass javaClassObj = new ReusableJavaClass();
		driver = launchBrowser(driver, javaClassObj.readDataFromPropertyFile("browserName"));
		driver.get(javaClassObj.readDataFromPropertyFile("url1"));
		createNewWindowOrTab(driver, WindowType.TAB);
		driver.get(javaClassObj.readDataFromPropertyFile("url2"));
		Set<String> allWindowId = getAllwindowsId(driver);
		for (String windowId : allWindowId) {
			String windowUrl = switchDriverToWindow(driver, windowId).getCurrentUrl();
			if (windowUrl.equals(javaClassObj.readDataFromPropertyFile("url1"))) {
				
			}else if (windowUrl.equals(javaClassObj.readDataFromPropertyFile("url2"))) {
				closeCurrentWindow(driver);
			}
		}

	}

}
