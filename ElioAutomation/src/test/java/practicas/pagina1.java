package practicas;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagina1 {
	
	By SEARCH_BAR = By.xpath("//*[@class = 'gLFyf']");
	By BUTTON = By.xpath("//*[@class = 'gb_Ad']");
	
	WebDriver driver;

public Boolean mainPage(WebDriver driver) {
	
	try {	
	driver.findElement(BUTTON).click();
//	driver.findElement(SEARCH_BAR).sendKeys("basura");	
	return true;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return false;
	
}

}
