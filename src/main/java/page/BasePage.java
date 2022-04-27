package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public void SelectFromDropDown(WebElement WebElement, String visibleText ) {
		Select sel = new Select(WebElement);
		sel.selectByVisibleText(visibleText);
	}
	
	
	public int GenerateRandomNO(int boundary) {
		Random rnd = new Random();
		int RandomGeneratedNo = rnd.nextInt(boundary);
		return RandomGeneratedNo;
	}
}
