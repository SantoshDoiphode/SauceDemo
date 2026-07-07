package iHelper;

import org.openqa.selenium.WebElement;

public interface IwebElement {
	void click(WebElement wb);
	
	void submit(WebElement wb);
	
	void sendkeys(WebElement wb,String Value);
	
	String getText(WebElement wb);
	
	String getAttribute(WebElement wb,String key);
	
	boolean isDisplayed(WebElement wb);
	
	boolean isSelected(WebElement wb);
	
	boolean isEnabled(WebElement wb);
}
