package selenium.vietnam.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://login.skype.com/login")
public class LoginPage extends PageObject{
	
	@FindBy(id="username")
	WebElement usernameField;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(id="signIn")
	WebElement signInbtn;
	
	@FindBy(xpath=".//*[@id='container']/div/div/div[1]/div[1]/span")
	WebElement ErrMsg;
	
	@FindBy(xpath=".//*[@id='portalHeader']/div/h1")
	WebElement title;

	public void enter_username(String username) {
		usernameField.sendKeys(username);
	}

	public void enter_password(String password) {
		passwordField.sendKeys(password);
	}

	public Object getErrMsg() {
		return ErrMsg.getText();
	}

	public void click_signinbtn() {
		signInbtn.click();
	}

	public Object getTitleSkype() {
		return title.getText();
	}

}
