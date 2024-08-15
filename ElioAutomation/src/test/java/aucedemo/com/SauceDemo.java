package aucedemo.com;

import static org.junit.Assert.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {	
	
	WebDriver driver;
	
	@Before
	public void configuration() {		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));			
			
		}
	
	@Test
	public void test() throws IOException {
		
		FileReader fl = new FileReader(".\\src\\test\\java\\aucedemo\\com\\config.properties");
		Properties p = new Properties();
		p.load(fl);
		
		loginPage lp = new loginPage();
		lp.signin(driver, p.getProperty("user"), p.getProperty("password"));	
		assertTrue(driver.getTitle().contains("Swag Labs"));
		assertTrue("couldn't find the sort list", lp.productSort(driver));
		assertTrue("couldn't find the button", lp.addButton1(driver));	
		assertTrue("couldn't find the cart icon", lp.cartIcon(driver));
		assertTrue("couldn't find the checkout button", lp.checkout(driver));
		assertTrue("couldn't find the FN text box", lp.yourInformation(driver, p.getProperty("firstName"), p.getProperty("lastName"), p.getProperty("zip")));
		
	}
	
	@After
	public void tearDown(){
		//driver.quit();
	}

	}


