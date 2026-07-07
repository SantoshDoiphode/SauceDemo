package iHelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface IDropdown {
	void selectByVisibleText(WebElement wb,String VisibleText);
	
	void selectByIndex(WebElement wb,int index);
	
	void selectByvalue(WebElement wb,String Value);
	
	void selectValue(List<WebElement>list,String value);
}
