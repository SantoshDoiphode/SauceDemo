package utilityLayer;

import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;
import iHelper.IwebElement;

public class WebElementImpl extends BaseClass implements IwebElement{
	private Waitimpl wait = new Waitimpl();
	@Override
	public void click(WebElement wb) {
		wait.elementToBeClickable(wb).click();
		
	}

	@Override
	public void submit(WebElement wb) {
		wait.elementToBeClickable(wb).submit();
		
	}

	@Override
	public void sendkeys(WebElement wb, String Value) {
		wait.visibilityOfElement(wb).sendKeys(Value);
		
	}

	@Override
	public String getText(WebElement wb) {
		// TODO Auto-generated method stub
		return wait.visibilityOfElement(wb).getText();
	}

	@Override
	public String getAttribute(WebElement wb, String key) {
		// TODO Auto-generated method stub
		return wait.visibilityOfElement(wb).getAttribute(key);
	}

	@Override
	public boolean isDisplayed(WebElement wb) {
		// TODO Auto-generated method stub
		return wait.visibilityOfElement(wb).isDisplayed();
	}

	@Override
	public boolean isSelected(WebElement wb) {
		// TODO Auto-generated method stub
		return wait.visibilityOfElement(wb).isSelected();
	}

	@Override
	public boolean isEnabled(WebElement wb) {
		// TODO Auto-generated method stub
		return wait.visibilityOfElement(wb).isEnabled();
	}

}
