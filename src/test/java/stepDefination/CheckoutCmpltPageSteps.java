package stepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseLayer.BaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLayer.CheckoutCmpltPage;

public class CheckoutCmpltPageSteps extends BaseClass {
	
	private CheckoutCmpltPage complete = new CheckoutCmpltPage();
	
	@Given("user click on finish button")
	public void user_click_on_finish_button() {
		complete.userClickOnFinishBtn();
	}
	@Then("user click on back to home button")
	public void user_click_on_back_to_home_button() {
		complete.userClickOnBackToHomebtn();
}
	@AfterStep
	public void takeScreenshot(Scenario scenario) {
		TakesScreenshot ts = (TakesScreenshot)getDriver();
		byte[] screenshot =ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
	}
}