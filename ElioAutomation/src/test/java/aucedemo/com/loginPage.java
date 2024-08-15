package aucedemo.com;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends SauceDemo {

	WebDriver driver;

	By USER = By.id("user-name");
	By PASSWORD = By.id("password");
	By LOGIN_BUTTON = By.id("login-button");
	By ADD_BUTTON_1 = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By SORT_CONTAINER = By.xpath("//select[@class = 'product_sort_container']");
	By CART_ICON = By.xpath("//*[@id = 'shopping_cart_container']");
	By CHECKOUT_BUTTON = By.id("checkout");
	By FIRST_NAME = By.id("first-name");
	By LAST_NAME = By.id("last-name");
	By ZIP = By.id("postal-code");
	By CONTINUE_BUTTON = By.id("continue");
	By FINISH_BUTTON = By.id("finish");

	public boolean signin(WebDriver driver, String user, String password) {

		try {

			driver.findElement(USER).sendKeys(user);
			driver.findElement(PASSWORD).sendKeys(password);
			driver.findElement(LOGIN_BUTTON).click();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean productSort(WebDriver driver) {

		try {
			WebElement ele = driver.findElement(SORT_CONTAINER);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(ele));

			Select ps = new Select(driver.findElement(SORT_CONTAINER));
			ps.selectByValue("za");

			return true;

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public boolean addButton1(WebDriver driver) {

		try {
			driver.findElement(ADD_BUTTON_1).click();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean cartIcon(WebDriver driver) {
		
		WebElement ele = (driver.findElement(CART_ICON));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ele));

		try {

			driver.findElement(CART_ICON).click();

			return true;
		}

		catch (Exception e) {

			e.printStackTrace();
		}

		return false;

	}
	
	public boolean checkout(WebDriver driver) {
		
		try {
			WebElement ele = (driver.findElement(CHECKOUT_BUTTON));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(ele));
			
			driver.findElement(CHECKOUT_BUTTON).click();
			
			return true;
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean yourInformation(WebDriver driver, String firstName, String lastName, String zip) {
		
		try {
			
			WebElement ele = (driver.findElement(FIRST_NAME));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(ele));
			
			driver.findElement(FIRST_NAME).sendKeys("firstName");
			driver.findElement(LAST_NAME).sendKeys("lastName");
			driver.findElement(ZIP).sendKeys("zip");
			driver.findElement(CONTINUE_BUTTON).click();
			driver.findElement(FINISH_BUTTON).click();
			
			return true;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
}
