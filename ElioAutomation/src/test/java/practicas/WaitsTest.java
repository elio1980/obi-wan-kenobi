package practicas;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsTest {
	By BANNER = By.xpath("//img[@src= \'images/banner2.gif\']");
	

	private WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.id("id"));

	}

	@Test
	public void waits() {
		
//		implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		Explicit wait
		WebElement banner = (driver.findElement(By.xpath(null)));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(banner));		
		
//		Fluent wait					
		Wait<WebDriver> fw  = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30)) 			
				.pollingEvery(Duration.ofSeconds(2)) 			
				.ignoring(NoSuchElementException.class);
		
		ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOfElementLocated(By.id("elementID"));
		
		@SuppressWarnings("unused")
		WebElement element = fw.until(condition);
		
	}

}
