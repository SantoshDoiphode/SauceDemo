package baseLayer;

import java.io.IOException;
import java.time.Duration;

import utilityLayer.DriverFactory;
import utilityLayer.PropertyReader;
import utilityLayer.WebDriverImpl;

public class BaseClass extends DriverFactory {
	
	private WebDriverImpl webdriver;
	
	private PropertyReader prop;
	public void initialization (String DriverName) throws IOException {
		setDriver(DriverName);
		webdriver=new WebDriverImpl();
		webdriver.maximize();
		webdriver.implicitelyWait(Duration.ofSeconds(30));
		webdriver.pageLoadTimeout(Duration.ofSeconds(30));
		
		 prop  = new PropertyReader();
		String SauceDemoRL = prop.getProperty("SIT_URL");
		webdriver.get(SauceDemoRL);
		
		
}
}
