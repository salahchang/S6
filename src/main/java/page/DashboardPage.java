package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement Dashboard_Page_Element;
	@FindBy ( how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMERS_ELEMENT;
	@FindBy ( how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_ELEMENT;
	
	
	public DashboardPage(WebDriver driver) {
	this.driver = driver;
	}
	
	public void verifyDashboard() {
		Assert.assertEquals(Dashboard_Page_Element.getText(), "Dashboard", "page not found!!");
	}
	
	public void ClickCustomersButton() {
		CUSTOMERS_ELEMENT.click();
	}
	
	public void ClickAddCustomerButton() {
		ADD_CUSTOMER_ELEMENT.click();
	}
	
}
