package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver ldriver;

	public Login(WebDriver rdriver) // constructor
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "email")
	WebElement txtUserName;

	@FindBy(id = "pass")
	WebElement txtPassword;

	@FindBy(name = "login")
	WebElement btnLogin;
	
	@FindBy(xpath="(//input[@placeholder='Search Facebook'])[1]")
    WebElement Search;
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit() {
		btnLogin.click();
	}
	public void setSearchfor(String text) {
		Search.sendKeys(text);
	}
}
