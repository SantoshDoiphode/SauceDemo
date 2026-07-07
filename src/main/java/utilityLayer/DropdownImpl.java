package utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseLayer.BaseClass;
import iHelper.IDropdown;

public class DropdownImpl extends BaseClass implements IDropdown{
	
	private WebElementImpl wb = new WebElementImpl();
	private Waitimpl wait = new Waitimpl();

	@Override
	public void selectByVisibleText(WebElement wb, String VisibleText) {
		new Select(wait.visibilityOfElement(wb)).selectByVisibleText(VisibleText);
		
	}

	@Override
	public void selectByIndex(WebElement wb, int index) {
		new Select(wait.visibilityOfElement(wb)).selectByIndex(index);
		
	}

	@Override
	public void selectByvalue(WebElement wb, String Value) {
		new Select(wait.visibilityOfElement(wb)).selectByValue(Value);
		
	}

	@Override
	public void selectValue(List<WebElement> list, String value) {
		for(WebElement li:list) {
			String actValue= wb.getText(li);
			if (actValue.equals(value)) {
				wb.click(li);
				break;
			}
		}
		
	}

}
