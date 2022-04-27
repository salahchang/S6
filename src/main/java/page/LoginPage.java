package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

			WebDriver driver;
	//storing element using By class
			By usernameField = By.xpath("//*[@id=\"username\"]");
			By passwordField = By.xpath("//*[@id=\"password\"]");
			By signinButtonField = By.xpath("/html/body/div/div/div/form/div[3]/button");
			
			//storing using @FindBy
			@FindBy (how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USER_NAME_ELEMENT;
			@FindBy (how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
			@FindBy (how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGN_INBUTTON_ELEMENT;
	
			public LoginPage (WebDriver driver){
				this.driver = driver;
			}
	
			public void InsertUserName(String user_name) {
				USER_NAME_ELEMENT.sendKeys(user_name);
			}

			public void InsertPassword(String password) {
				PASSWORD_ELEMENT.sendKeys(password);
			}

			public void ClickSigninButton() {
				SIGN_INBUTTON_ELEMENT.click();
			}

}
