package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")
	WebElement ADD_CONTACTS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//body/section/descendant::div[@class='col-md-6 col-sm-12']/div[@class='form-group']/div[@class='col-lg-8']/select[@id='cid']")
	WebElement COMPANY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//body/section/descendant::div[@class='col-md-6 col-sm-12']/div[@class='form-group']/div[@class='col-lg-8']/select[@id='country']")
	WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"rform\"]/div[1]/div[1]/div[10]/div/span/span[1]/span/ul")
	WebElement TAG_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SAVE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"group\"]") WebElement GROUP_ELEMENT;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void VerifyAddContactPage() {
		Assert.assertEquals(ADD_CONTACTS_ELEMENT.getText(), "Add Contact", "page not found :D");
	}
	
	public void InsertFullname(String full_name) {
		FULL_NAME_ELEMENT.sendKeys(full_name);
	}

	public void InsertCompanyName(String company_name) {
		SelectFromDropDown(COMPANY_NAME_ELEMENT, company_name);
	}

	public void InsertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(GenerateRandomNO(99) + email);
	}

	public void InsertPhoneNumber(String phone_number) {
		PHONE_ELEMENT.sendKeys(phone_number + GenerateRandomNO(999));
	}

	public void SelectCountry(String country) {
//		COUNTRY_ELEMENT.click();
		SelectFromDropDown(COUNTRY_ELEMENT, country);
	}

	public void Selectgroup(String group) {
		GROUP_ELEMENT.click();
		SelectFromDropDown(GROUP_ELEMENT, group);
	}
	public void ClickSubmitButton() {
		SAVE_ELEMENT.click();
	}

}
