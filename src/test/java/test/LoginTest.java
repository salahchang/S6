package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	String user_name = "demo@techfios.com";
	String password = "abc123";

	@Test
	public void ValidUserShouldBeAbleToLogin() {

		driver = BrowserFactory.init();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.InsertUserName(user_name);
		login.InsertPassword(password);
		login.ClickSigninButton();
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboard();
		dashboard.ClickCustomersButton();
		dashboard.ClickAddCustomerButton();
		
		
		
		
		BrowserFactory.teardown();
	}
	
	
	
	
	
}
