//package practicas;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.NoSuchElementException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class praticas2 {
//	
//	WebDriver driver;
//	
//	@SuppressWarnings("unchecked")
//	public void practicas(WebDriver driver) throws IOException {
//	
//	WebElement ele = driver.findElement(By.xpath("//img[@src = 'images/banner2.gif']"));
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//	wait.until(ExpectedConditions.visibilityOf(ele));
//
//	Select s = new Select(driver.findElement(null));
//	s.selectByVisibleText(null);
//	
//	driver.switchTo().frame(0);
//	driver.switchTo().defaultContent();
//	
//	FileReader fl = new FileReader("");
//	Properties p = new Properties();
//	p.load(fl);
//	
//	//id,name,classname,tag,xpath,css,linktext,partiallinktext 
//	
//	Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class):
//	
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	FluentWait wait1 = new FluentWait(driver);
//	wait1.withTimeout(Duration.ofSeconds(10));
//	wait1.pollingEvery(Duration.ofSeconds(0));
//	wait1.ignoring(NoSuchElementException.class);
//	
//	
//	
//		
//	
//	}
//
//}
