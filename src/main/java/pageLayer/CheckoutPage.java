package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.WebElementImpl;

public class CheckoutPage extends BaseClass {
	
	WebElementImpl webelement = new WebElementImpl();
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement FirstNmae;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@placeholder='Zip/Postal Code']")
	WebElement Pincode;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement continuebtn;
	
	public CheckoutPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void userEnterFirstnameLastNameAndPincode(String firstname,String lastname, String pincode) {
		webelement.sendkeys(this.FirstNmae,firstname );
		webelement.sendkeys(this.LastName, lastname);
		webelement.sendkeys(this.Pincode, pincode);
	}
	public void userClickoncontinuebtn() {
		webelement.click(continuebtn);
	}

}
