package utilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLayer.BaseClass;
import iHelper.Iwait;

public class Waitimpl extends BaseClass implements Iwait {

	@Override
	public WebElement visibilityOfElement(WebElement wb) {
		// TODO Auto-generated method stub
		return new WebDriverWait(getDriver(),Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	}

	@Override
	public WebElement elementToBeClickable(WebElement wb) {
		// TODO Auto-generated method stub
		return new WebDriverWait(getDriver(),Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(wb));
	}

	@Override
	public List<WebElement> VisibilityOfAllElements(List<WebElement> list) {
		// TODO Auto-generated method stub
		return new WebDriverWait(getDriver(),Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(list));
	}

	@Override
	public Alert alertIsPresent() {
		// TODO Auto-generated method stub
		return new WebDriverWait(getDriver(),Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent());
	}

}
