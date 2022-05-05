package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	WebDriver ldriver;
	public LoginPageObjects(WebDriver rdriver) {
		ldriver=rdriver;
	 PageFactory.initElements(ldriver,this);
	}

	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtpwd;
	
	@FindBy(xpath="//button[text()='Log in']")
	@CacheLookup
	WebElement lgnBtn;
	
	@FindBy(xpath="//a[text()='Logout']")
	@CacheLookup
	WebElement lgoutBtn;
	
	public void setEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setpwd(String pwd) {
		txtpwd.clear();
		txtpwd.sendKeys(pwd);
	}
	
	public void lgnBtnClick() {
		lgnBtn.click();
	}

	public void lgoutBtnClick() {
		lgoutBtn.click();
	}
}
