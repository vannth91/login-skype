package selenium.vietnam.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import selenium.vietnam.steps.serenity.LoginSteps;

public class LoginScenarioSteps {
	
	@Steps
	LoginSteps loginStep;
	
	@Given("^Go to URL$")
	public void go_to_URL() throws Throwable {
		loginStep.open_home_page();
	}

	@When("^Input username is \"([^\"]*)\"$")
	public void input_username_is(String username) throws Throwable {
	    loginStep.input_username(username);
	}

	@When("^Input password \"([^\"]*)\"$")
	public void input_password(String password) throws Throwable {
	    loginStep.input_password(password);
	}
	
	@When("^Click button Sign in$")
	public void click_button_Sign_in() throws Throwable {
	    loginStep.click_signin();
	}

	@Then("^Alert message \"([^\"]*)\"$")
	public void alert_message(String actual_msg) throws Throwable {
	    Assert.assertEquals(loginStep.getErrorMsg(), actual_msg);
	}
	
	@Then("^Verify Title \"([^\"]*)\"$")
	public void verify_Title(String actual_title) throws Throwable {
		Assert.assertEquals(loginStep.getTitle(), actual_title);
	}

}
