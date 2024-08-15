package practicas;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsTest {

	By locator_1 = By.className("q");
	By locator_2 = By.id("email");
	By locator_3 = By.name("firstName");
	By locator_4 = By.tagName("q");
	By locator_5 = By.linkText("Register here");
	By locator_6 = By.partialLinkText("q");
	By locator_7 = By.cssSelector("q");
	By locator_8 = By.xpath("//img[@src= 'images/mast_register.gif']");

	By locator_9 = By.name("password");
	By locator_10 = By.name("confirmPassword");
	By locator_11 = By.xpath(
			"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input");
	By HOME = By.linkText("Home");
	By FLIGHTS = By.linkText("Flights");
	By COUNT = By.name("passCount");
	By DEPARTING = By.name("fromPort");

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
	}

	@Test
	public void locators_Test() {
		driver.findElement(locator_5).click();
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
		if (driver.findElement(locator_8).isDisplayed()) {
			
			driver.findElement(locator_2).sendKeys("elio_leon_@hotmail.com");
			driver.findElement(locator_9).sendKeys("12345");
			driver.findElement(locator_10).sendKeys("12345");
			driver.findElement(locator_11).click();
			driver.findElement(HOME).click();
			driver.findElement(FLIGHTS).click();

			Select Passengers = new Select(driver.findElement(COUNT));
			Passengers.selectByVisibleText("2");
			
			Select Departing = new Select(driver.findElement(DEPARTING));
			Departing.selectByVisibleText("London");
			
		} else
			System.out.print("Failure");

	}

	@After
	public void tearDown() {
//		driver.quit();
	}

}
