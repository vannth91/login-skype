package selenium.vietnam.steps.serenity;

import net.thucydides.core.annotations.Step;
import selenium.vietnam.pages.LoginPage;

public class LoginSteps {

	LoginPage loginPage;

	@Step
	public void open_home_page() {
		loginPage.open();
	}

	@Step
	public void input_username(String username) {
		loginPage.enter_username(username);
	}

	public void input_password(String password) {
		loginPage.enter_password(password);
	}

	public Object getErrorMsg() {
		return loginPage.getErrMsg();
	}

	public void click_signin() {
		loginPage.click_signinbtn();
	}

	public Object getTitle() {
		return loginPage.getTitleSkype();
	}
}
