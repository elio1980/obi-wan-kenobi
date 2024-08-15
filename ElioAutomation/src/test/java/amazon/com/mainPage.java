package amazon.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class mainPage {

	By SILLA = By.xpath(
			"//a[@class = 'a-link-normal _fluid-quad-image-label-v2_style_centerImage__30wh- aok-block image-window' ]");
	By SILLA_2 = By.xpath("//img[@class= 's-image']");
	By ADD_BUTTON = By.xpath("//input[@id = 'add-to-cart-button']");
	By AMAZON_LOGO = By.xpath("//*[@id = 'nav-logo-sprites']");
	By CART_BUTTON = By.xpath("//a[@id = 'nav-cart']");
	By CHECKOUT_BUTTON = By.xpath("//input[@name = 'proceedToRetailCheckout']");
	By CEL_NUMBER = By.xpath("//input[@name = 'email']");
	By CONTINUE_BUTTON = By.xpath("//input[@id = 'continue']");
	By IDENTIFICATE_LINK = By.xpath("//span[@id = 'nav-link-accountList-nav-line-1']");
	By EMPIEZA_AQUI_LINK = By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a");

	public boolean buyAnItem(WebDriver driver) throws IOException {

		FileReader fl = new FileReader("./src/test/java/amazon/com/configuration.properties");
		Properties p = new Properties();
		p.load(fl);

		try {

			WebElement alogo = driver.findElement(By.xpath("//*[@id = 'nav-logo-sprites']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(alogo));

			driver.findElement(SILLA).click();
			driver.findElement(SILLA_2).click();
			driver.findElement(ADD_BUTTON).click();
			driver.findElement(CART_BUTTON).click();
			driver.findElement(CHECKOUT_BUTTON).click();
			driver.findElement(CEL_NUMBER).sendKeys(p.getProperty("CELPHONE"));
			driver.findElement(CONTINUE_BUTTON).click();

			return true;

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public void fluentWait(WebDriver driver) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30L))
				.pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("nav-logo-sprites"));
			}
		});
	}

	public void screenshot(WebDriver driver) throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\projectScreenshots\\homePageScreenshot.png"));

//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrFile, new File("Rout where  the screenshot will be saved"));

	}

	public void fileReader() throws IOException {

		FileReader fr = new FileReader("./src/test/java/mercury/tours/config.properties");
		Properties p = new Properties();
		p.load(fr);

	}

	public boolean newUser(WebDriver driver) {

		try {
			
			WebElement ele = driver.findElement(IDENTIFICATE_LINK);
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			driver.findElement(EMPIEZA_AQUI_LINK).click();

			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

}
