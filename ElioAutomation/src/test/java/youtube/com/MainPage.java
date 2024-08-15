package youtube.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

	By SEARCH_BOX = By.xpath("//input[@id = 'search']");
	By SEARCH_ICON = By.xpath("//button[@id = \"search-icon-legacy\"]");
	By VIDEO = By.partialLinkText("♪ Bowser: Peaches | SUPER MARIO BROS: LA PELÍCULA 2023 ( Español )");
	WebDriver driver;

	public boolean search(WebDriver driver) {

		try {
			driver.findElement(SEARCH_BOX).sendKeys("mario bros");
			driver.findElement(SEARCH_ICON).click();
			
			
			driver.findElement(VIDEO).click();
		
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
