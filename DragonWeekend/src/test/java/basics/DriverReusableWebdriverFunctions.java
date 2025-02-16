package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class will give you all the resuable browser components derived by 
 * selenium driver
 * @param driver
 * @author Madhan
 */
public class DriverReusableWebdriverFunctions {

	/**
	 * This method will get the Current window id which is controlled by the 
	 * selenium webdriver reference
	 * 
	 * @author Madhan
	 * @param driver
	 * @return Curent Window Id
	 */
	public static String getCurrentUrl(WebDriver driver) {
		String currentWindowId = driver.getWindowHandle();
		return currentWindowId;
	}
	
	/**
	 * This methodwill help us to get all the windoe id in the session
	 * 
	 * @param driver
	 * @return All Windows Id
	 */
	public static Set<String> getAllwindowsId(WebDriver driver) {
		Set<String> allWindowsId = driver.getWindowHandles();
		return allWindowsId;
	}
	
	/**
	 * This method will be used to close the Current window controlled by the 
	 * selenium webdriver driver.
	 * 
	 * @author Madhan
	 * @param driver
	 */
	public static void closeCurrentWindow(WebDriver driver) {
		driver.close();
	}
	
	/**
	 * This method will be used to create a new window or Tab in the ongoing session
	 * 
	 * @author Madhan
	 * @param driver
	 * @param type
	 * @return WebDriver
	 */
	public static WebDriver createNewWindowOrTab(WebDriver driver, WindowType type) {
		WebDriver newWindowRef = driver.switchTo().newWindow(type);
		return newWindowRef;
	} 
	
	/**
	 * This method will be used to switch the driver control upon it's window ID as
	 * specified in the session.
	 * 
	 * @author Madhan
	 * @param driver
	 * @param windowId
	 * @return WebDriver
	 */
	public static  WebDriver switchDriverToWindow(WebDriver driver, String windowId) {
		WebDriver window = driver.switchTo().window(windowId);
		return window;
	}
	
	/**
	 * This is method will be used to lanuch the browser as specified if not deafult
	 * browser will be launched
	 * 
	 * @author Madhan
	 * @param driver
	 * @param browserName
	 * @return WebDriver
	 */
	public static WebDriver launchBrowser(WebDriver driver,String browserName) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new ChromeDriver();
		}
		return driver;
	}
}
