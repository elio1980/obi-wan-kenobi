package alertsjs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertsjs {
	
	WebDriver driver;
	
@Before	
public void setup() {
	
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
}	

@Test
public void alertsJs() throws InterruptedException, IOException {
	
	driver.findElement(By.xpath("//button[normalize-space() ='Click for JS Alert']")).click();
	driver.switchTo().alert().accept();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[normalize-space() ='Click for JS Confirm']")).click();
	driver.switchTo().alert().dismiss();

	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[normalize-space() ='Click for JS Prompt']")).click();
//	Thread.sleep(5000);
	Alert  alertwindow = driver.switchTo().alert();
	System.out.print("The message displayed on alert:" + alertwindow.getText());
	alertwindow.sendKeys("whatever");
	alertwindow.accept();
	Thread.sleep(5000);
//	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(scrFile, new File("C:\\\\projectScreenshots\\\\homePageScreenshot.png"));
}

@After
public void tearDown() {
	driver.quit();
}

}
