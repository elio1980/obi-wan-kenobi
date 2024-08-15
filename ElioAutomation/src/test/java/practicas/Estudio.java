import java.io.FileReader;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Estudio(){
	 
	 static WebDriver driver;

	@Before	 
	 public void setUp() {
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("URL");
	}		 

	@Test
	public void test() {
		
		//FileReader
		FileReader fl = new FileReader("Relative path");
		Properties p = new Properties();
		p.load(fl);
		
		//Select
		Select ele = new Select(driver.findElement(By.xpath(null)));
		ele.selectByVisibleText("value");
		
		//Switch
		driver.switchTo().window(null);
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//Explicit wait
		WebElement ele2 = driver.findElement(By.xpath(""));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(ele2));
		
		//fluent wait
		Wait<WebDriver> fw = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(1)
				.ingnoring(NoSuchElementException.class);		
		ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOf(By.id("elementId"));
		WebElement ele3 = fw.until(condition);
		
		//Locators		
		Id, Name, ClassName, partialLinkText, linkTest, xpath, TagName, CSS
		
		//Alerts in java script
		
		//click in acept button
		driver.findElement(By.xpath(""));
		driver.switchTo().alert().accept();
		
		//click in close button
		driver.findElement(By.xpath(null));		
		driver.switchTo().alert().desmiss();		
		
		//send keys and acept
		driver.findElement(By.id("id")).click();
		Alert alertWindow = driver.switchTo.alert();
		alertWindow.sendKeys("String");
		alertWindow.accept();		
		driver.switchTo.alert().desmiss();
		
		
		Wait<WebDriver> fw = new fluentWait<WebDriver>driver
				.manage().timeouts().implicitlyWait(Duration.ofSeconds(0))
				.polling(Duration.ofSeconds(3))
				.ingnore(noSuchElementExeception.class);
		
		WebElement ele = driver.findElement(By.id(null));
		fw.wait(ExpectedConditions, visibilityOf(ele));
		
		Wait<WebDriver> fw = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(1)
				.ingnoring(NoSuchElementException.class);		
		ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOf(By.id("elementId"));
		WebElement ele3 = fw.until(condition);
		
		WebElement ele = driver.findElement(By.id(null));
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(0));
		ew.wait(until.expectedCondition.visibilityof(ele));
		
		Wait<WebDriver> fw = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(0))
				.pollingEvery(Duration.ofSeconds(0))
				.ignoring(NoSuchElementException.class);
		
		ExpectedCondition<WebElement> condition1 = ExpectedCondition.visibilityOf(By.id(null));
		WebElement ele4 = fw.until(condition1);
		
		EXpectedCondition<WebElement> condition1 = ExpectedCondition
		)
		Wait<WebDriver> fw2 = new fluentWait<WebDriver>(driver)
		.withtimeut(Duration.ofSeconds(0))
		.polling(3)
		.ingnoreing(notsuchelementexception.class)
		
		ExpectedCondtion<WebElement> condition = ExpectedCondition.visibilityOf(By.id(null));
		WebElement ele = fw2.until(condition);
		
		
		Wait<WebDriver> fw = new fluentWait<WebDriver>(driver)
				.withtimeouts(Duration.ofSeconds(0))
				.polling(3)
				.ignore(notSuchElementException);
		
		WebElement<WebDriver> condition = visibilityOfElement(By.id(null));
		WebElement ele = condition.until(fw);
		
		
		Wait<WebDriver> fw = new fluentWait<WebDriver>(driver)
				.withTimeOut(Duration.ofSeconds(0))
				.polling(3)
				.ignore(notSuchElementException);
		
		ExpectedContion <WebElement> condition = ExpectedCondtion.visibilityOf(By.id(null));
		WebElement ele = fw.until(condition);
		
		
		
		Wait<WebDriver> fw = new fluentWait(driver)
				.withTimeOuts(DurationOf.seconds)
				.pollingEvery(3)
				.ignore(NotSuchElementEXception.class);
		
		ExpectedCondtion<WebElement> condition = ExpectedCondition.visibilityOf(By.id(null));
		WebElement ele = fw.until(condition);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void tearDown() {
		
		driver.close();	 a

}

