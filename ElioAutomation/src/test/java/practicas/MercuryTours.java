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

public class MercuryTours {
	
	//Absolute xpath;
	By HOME = By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a");
	By REGISTER = By.xpath("");
	By DEPARTING = By.name("fromPort");
	
	WebDriver driver;
	
	@Before
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
	
	@Test
	public boolean Test() {
		
		try {
		
		driver.findElement(HOME).click();
		
		WebElement home = driver.findElement(HOME);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));		
		wait.until(ExpectedConditions.visibilityOf(home));
		
		Select departing = new Select(driver.findElement(DEPARTING));
		departing.selectByVisibleText("paris");	
		}
		
		catch(Exception e) {
			System.out.println("Test fail");
			e.printStackTrace();
		}
		return false;
		
	}
	
	@After
	public void TearDown() {
		driver.quit();
		
	}

}
