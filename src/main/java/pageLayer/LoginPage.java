package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.WebElementImpl;

public class LoginPage extends BaseClass {
	private WebElementImpl webelement = new WebElementImpl();
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@class=\'submit-button btn_action\']")
	private WebElement Loginbtn;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void userEnterUserNameAndPassword(String userName, String Password) {
		webelement.sendkeys(this.userName, userName);
		webelement.sendkeys(this.password, Password);
	}
	public void userClickOnLoginButton() {
		webelement.click(Loginbtn);
	}
}
