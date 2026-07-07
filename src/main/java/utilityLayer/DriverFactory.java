package utilityLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	private static ThreadLocal<WebDriver>td= new ThreadLocal<WebDriver>();
	
	public WebDriver getDriver() {
		return td.get();
	}
	public void setDriver(String driverName) {
		
		if (driverName.equalsIgnoreCase("Chrome")) {
			td.set(new ChromeDriver());
		}
		else if (driverName.equalsIgnoreCase("Edge"))
		{ td.set(new EdgeDriver());
		}
		else if (driverName.equalsIgnoreCase("incognito")) {
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--incognito")));
		}
		else {
			System.out.println("Please Enter valid browser name");
		}
	}

}