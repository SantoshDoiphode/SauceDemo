package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.DropdownImpl;
import utilityLayer.WebElementImpl;

public class ProductPage extends BaseClass {
		private WebElementImpl webElement = new WebElementImpl();
		private DropdownImpl dropdown = new DropdownImpl();
		
		@FindBy(xpath="//select[@class='product_sort_container']")
		 private WebElement filteroptions;
		
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
		 private WebElement firstAddToCartBtn;
		
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		 private WebElement shoppingCartLink;
		
		@FindBy(xpath="//button[@id='checkout']")
		 private WebElement chekOutbtn;
		
		public ProductPage() {
			PageFactory.initElements(getDriver(), this);
		}
		public void userClickOnFilterIcon() {
			webElement.click(this.filteroptions);
		}
		
		public void userSelectPriceRange() {
			dropdown.selectByVisibleText(this.filteroptions, "Price (low to high)");
		}
		public void userClickOnFirstAddToCartIcon() {
			webElement.click(this.firstAddToCartBtn);
			
		}
		public void userClickOnGoToCartIcon() {
			webElement.click(this.shoppingCartLink);
		}
		public void userClickCheckOutButton() {
			webElement.click(this.chekOutbtn);
		}
		
		
		}
