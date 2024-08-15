package practicas;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practicas {
	
	By SEARCHBOX = By.xpath("//textarea[@class = 'gLFyf']");
	By GURU99LINK = By.linkText("https://demo.guru99.com/test/newtours/reservation.php");
	By BANNER = By.xpath("//img[@src = 'images/banner2.gif']");
	By AIRLINE = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select");
	By CONTINUE_BUTTON = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input");
	
	WebDriver driver;
	
	@Before
	public void setup(){
		
		System.setProperty("WebDriver.driver.chromedriver", "./src/test/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		
	}
	
	@Test
	
	public void test(WebDriver driver){
		
			driver.findElement(SEARCHBOX).clear();
			driver.findElement(SEARCHBOX).sendKeys("https://demo.guru99.com/test/newtours/reservation.php");
			driver.findElement(GURU99LINK).click();				
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf((WebElement) BANNER));	
			
			Select Airline = new Select(driver.findElement(AIRLINE));
			Airline.selectByVisibleText("Unified Airlines");
			
			driver.findElement(CONTINUE_BUTTON);			

	}
	
	@After
	public void teardown() {
		driver.quit();
	}

}
