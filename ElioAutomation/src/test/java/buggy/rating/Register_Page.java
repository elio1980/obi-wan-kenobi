package buggy.rating;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_Page {

	By REGISTER_BUTTON = By.xpath("/html/body/my-app/header/nav/div/my-login/div/form/a");
	By USER = By.name("username");
	By FIRST_NAME = By.name("firstName");
	By LAST_NAME = By.name("lastName");
//	By PASSWORD = By.name("password");
	By PASSWORD = By.xpath("//*[@id=\"password\"]");
	By CONFIRM_PASSWORD = By.name("confirmPassword");
	By REGISTER_BUTTON_2 = By.xpath("/html/body/my-app/div/main/my-register/div/div/form/button");
	By BUGGY_LINK = By.xpath("/html/body/my-app/header/nav/div/a");

	public boolean register_user(WebDriver driver) {

		try {

			FileReader fr = new FileReader("./src/test/java/buggy/rating/configuration.properties");
			Properties p = new Properties();
			p.load(fr);

			driver.findElement(REGISTER_BUTTON).click();
			driver.findElement(USER).sendKeys(p.getProperty("user"));
			driver.findElement(FIRST_NAME).sendKeys(p.getProperty("firstname"));
			driver.findElement(LAST_NAME).sendKeys(p.getProperty("lastname"));
			driver.findElement(PASSWORD).sendKeys(p.getProperty("password"));
			driver.findElement(CONFIRM_PASSWORD).sendKeys(p.getProperty("confirmpassword"));
			driver.findElement(REGISTER_BUTTON_2).click();
			
			WebElement ele = (driver.findElement(By.xpath("/html/body/my-app/div/main/my-register/div/div/form/div[6]")));
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(ele));
			
			driver.findElement(BUGGY_LINK).click();

			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
			return false;

	}
}
