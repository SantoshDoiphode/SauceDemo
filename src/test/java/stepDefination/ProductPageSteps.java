package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLayer.ProductPage;

public class ProductPageSteps {
	private ProductPage product = new ProductPage();
	
	@Given("user click on filter icon")
	public void user_click_on_filter_icon() {
		product.userClickOnFilterIcon();
	     
	}
	
	@Then("user click on price range options")
	public void user_click_on_price_range_options() {
	   product.userSelectPriceRange();
	}

	@Then("user click on first add to cart option")
	public void user_click_on_first_add_to_cart_option() {
	  product.userClickOnFirstAddToCartIcon();
	}
	@Then("user click on go to cart icon")
	public void user_click_on_go_to_cart_icon() {
		product.userClickOnGoToCartIcon();
	
	  
	}
	@Then("user click on checkOut button")
	public void user_click_on_check_out_button() {
	    product.userClickCheckOutButton();
	}

}
