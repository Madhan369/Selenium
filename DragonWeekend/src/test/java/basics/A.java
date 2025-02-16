package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class A extends DriverReusableWebdriverFunctions {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = launchBrowser(driver, "chrome");
		driver.get("https://www.facebook.com/");
		createNewWindowOrTab(driver, WindowType.TAB);
		driver.get("https://www.shoppersstack.com/");
		Set<String> allWindowId = getAllwindowsId(driver);
		for (String windowId : allWindowId) {
			String windowUrl = switchDriverToWindow(driver, windowId).getCurrentUrl();
			if (windowUrl.equals("https://www.facebook.com/")) {
				
			}else if (windowUrl.equals("https://www.shoppersstack.com/")) {
				closeCurrentWindow(driver);
			}
		}

	}

}
