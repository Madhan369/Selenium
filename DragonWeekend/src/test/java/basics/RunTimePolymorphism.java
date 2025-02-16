package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphism {
	public static WebDriver driver;
	public static void main(String[] args) {
		String browsername = "chrome";
		
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browsername.equals("edge")) {
			driver = new EdgeDriver();
		}else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new ChromeDriver();
		}
	}

}
