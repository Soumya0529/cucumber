package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPageObjects;

public class stepdefinition {
	public WebDriver driver;
	public LoginPageObjects obj;
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	
	}
	@Given("user is on the nopcommerce website")
	public void user_is_on_the_nopcommerce_website() {
	   
	    driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	    obj= new LoginPageObjects(driver);
	}

	@When("user enters email as {string}  and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) {
	    obj.setEmail(email);
	    obj.setpwd(pwd);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
	   obj.lgnBtnClick();
	   Thread.sleep(2000);
	}

	@Then("user is on the dashboard page with title {string}")
	public void user_is_on_the_dashboard_page_with_title(String title) {
	   if(driver.getPageSource().contains("Login was unsuccessful.")) {
		   Assert.assertTrue("Unsuccessful login", false);
	   }
		String ttl=driver.getTitle();
	    Assert.assertEquals(title,ttl);
	    obj.lgoutBtnClick();
	}
	@After
	public void tearDown() {
		driver.close();
	}

}	
