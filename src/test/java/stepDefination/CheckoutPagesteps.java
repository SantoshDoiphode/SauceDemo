package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLayer.CheckoutPage;

public class CheckoutPagesteps {
	
	private CheckoutPage checkout = new CheckoutPage();
	
	@Given("user enter {string} as firstName and {string} as lastName and {string} as pincode")
	public void user_enter_as_first_name_and_as_last_name_and_as_pincode(String firstName, String lastName, String pincode) {
	checkout.userEnterFirstnameLastNameAndPincode(firstName, lastName, pincode);
	}
	@Then("user click on continue button")
	public void user_click_on_continue_button() {
	  checkout.userClickoncontinuebtn();
	}

}
