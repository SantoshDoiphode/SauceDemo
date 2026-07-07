package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.WebElementImpl;

public class CheckoutCmpltPage extends BaseClass{
	private WebElementImpl webelement = new WebElementImpl(); 
	
	@FindBy(xpath="//button[@class='btn btn_action btn_medium cart_button']")
	WebElement FinishBtn;
	
	@FindBy(xpath="//button[@class='btn btn_primary btn_small']")
	WebElement BackToHome;
	
	public CheckoutCmpltPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void userClickOnFinishBtn() {
		webelement.click(FinishBtn);
	}
	public void userClickOnBackToHomebtn() {
		webelement.click(BackToHome);
	}
}
