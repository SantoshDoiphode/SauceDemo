package stepDefination;

import java.io.IOException;

import baseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.LoginPage;

public class StepDefination extends BaseClass {
	private LoginPage login;
	@Given("user is on login page")
	public void user_is_on_login_page() throws IOException {
		initialization("Chrome");
	}

	@When("user enter {string} as userName and {string} as password")
	public void user_enter_as_user_name_and_as_password(String userName, String password) {
		login =new LoginPage();
		login.userEnterUserNameAndPassword(userName, password);
	  
	}

	@Then("user click on login page")
	public void user_click_on_login_page() {
	 login.userClickOnLoginButton();
	}

}
