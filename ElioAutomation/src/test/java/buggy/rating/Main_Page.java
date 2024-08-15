package buggy.rating;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main_Page extends Main{
	
	By USER = By.xpath("/html/body/my-app/header/nav/div/my-login/div/form/div/input[1]");
	By PASSWORD = By.xpath("/html/body/my-app/header/nav/div/my-login/div/form/div/input[2]");
	By LOGIN_BUTTON = By.xpath("//button[@class = 'btn btn-success']");
	By MAKE = By.xpath("//img[@class = 'img-fluid center-block']");
	By MODEL = By.linkText("Mito");
	By COMMENT = By.id("comment");
	By VOTE_BUTTON = By.xpath("/html/body/my-app/div/main/my-model/div/div[1]/div[3]/div[2]/div[2]/div/button");
	By LOGO = By.xpath("//img[@title = 'Alfa Romeo']");
	
	public boolean login(WebDriver driver) {
		try {
			//Explicit wait
			WebElement ele = driver.findElement(By.xpath("//img[@class= \"img-fluid\"]"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(ele));
			
			FileReader fl = new FileReader("./src/test/java/buggy/rating/configuration.properties");
			Properties p = new Properties();
			p.load(fl);
			
			driver.findElement(USER).sendKeys(p.getProperty("user"));
			driver.findElement(PASSWORD).sendKeys(p.getProperty("password"));
			driver.findElement(LOGIN_BUTTON).click();
			
			return true;			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean pupular_make(WebDriver driver) {
		
		try {
			
			FileReader fr = new FileReader("./src/test/java/buggy/rating/configuration.properties");
			Properties p = new Properties();
			p.load(fr);
			
			//Fluent Wait
			Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(1))
					.ignoring(NoSuchElementException.class);
			
			@SuppressWarnings("unused")
			WebElement logotipo = fwait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
			      return driver.findElement(LOGO);
			}
			});
			
			driver.findElement(MAKE).click();
			driver.findElement(MODEL).click();
			driver.findElement(COMMENT).sendKeys(p.getProperty("comment"));
			driver.findElement(VOTE_BUTTON).click();
			
		return true;
		}		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

}
