package iHelper;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public interface Iwait {
	WebElement visibilityOfElement(WebElement wb);
	WebElement elementToBeClickable(WebElement wb);
	List<WebElement> VisibilityOfAllElements(List<WebElement>list);
	Alert alertIsPresent();
}
