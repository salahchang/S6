package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;

	// test data
	String full_name = "jackie chan";
	String company_name = "Amazon";
	String email = "adkgjmk@yahoo.fr";
	String phone_number = "4587965";
	String country = "Botswana";
	String tag = "lino";
	String group = "Java";

	// login data
	String user_name = "demo@techfios.com";
	String password = "abc123";

	
	@Test
	public void ValidUserSouldBeAbleToAddCustomer() {
		driver = BrowserFactory.init();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.InsertUserName(user_name);
		login.InsertPassword(password);
		login.ClickSigninButton();
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboard();
		dashboard.ClickCustomersButton();
		dashboard.ClickAddCustomerButton();
		AddCustomerPage addC = PageFactory.initElements(driver, AddCustomerPage.class);
		addC.VerifyAddContactPage();
		addC.InsertFullname(full_name);
		addC.InsertEmail(email);
		addC.InsertCompanyName(company_name);
		addC.InsertPhoneNumber(phone_number);
		addC.SelectCountry(country);
		addC.Selectgroup(group);
		//addC.ClickSubmitButton();
		
	}

}
