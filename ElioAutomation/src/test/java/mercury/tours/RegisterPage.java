package mercury.tours;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RegisterPage {

	By USER_NAME = By.name("email");
	By PASSWORD = By.name("password");
	By CONFIRM_PASSWORD = By.name("confirmPassword");
	By SEND_BUTTON = By.name("submit");	

	RemoteWebDriver driver;

	public boolean UserRegister(WebDriver driver, String user, String password) {

		try {

			driver.findElement(USER_NAME).sendKeys(user);
			driver.findElement(PASSWORD).sendKeys(password);
			driver.findElement(CONFIRM_PASSWORD).sendKeys(password);
			driver.findElement(SEND_BUTTON).click();
			
			File scrFile  = ((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\projectScreenshots\\homePageScreenshot.png"));

			return true;

		} catch (Exception e) {

			e.printStackTrace();
			return false;

		}

	}

}
