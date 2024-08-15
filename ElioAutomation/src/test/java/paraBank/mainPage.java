package paraBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainPage{

	By USER = By.xpath("//*[@name = 'username']");
	By PASSWORD = By.xpath("//*[@name = 'password']");
	By LOGIN_BUTTON = By.xpath("//*[@class = 'button']");	
	By REGISTER_LINK = By.xpath("//a[contains (text(), 'Register')]");

	WebDriver driver;

	public boolean customerLogin(WebDriver driver, String user, String password) {
		
		try {
			
			driver.findElement(USER).sendKeys(user);
			driver.findElement(PASSWORD).sendKeys(password);
			Thread.sleep(Duration.ofSeconds(5));
			driver.findElement(LOGIN_BUTTON).click();
			
			return true;
		}
		
		catch(Exception e) {
			
			e.printStackTrace();			
		}		
		return false;
	}
	
	public boolean register(WebDriver driver) {
		
		try {
			
			driver.findElement(REGISTER_LINK).click();
			
			return true;			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();			
		}
		return false;
		
	}

}
