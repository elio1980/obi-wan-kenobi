package paraBank;

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

public class paraBank {
	
	WebDriver driver;
	
	@Before
	public void configuration() {		

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
	}
	
	@Test	
	public void test() throws IOException{
		
		FileReader fl = new FileReader(".\\src\\test\\java\\paraBank\\config.properties");
		Properties p = new Properties();
		p.load(fl);
		
		mainPage mp = new mainPage();
		registerPage rp = new registerPage();
		
		
		assertTrue("Unable to click in register link", mp.register(driver));
		assertTrue("Registration fail", rp.register(driver, p.getProperty("user"), p.getProperty("pass"), p.getProperty("lastN"), p.getProperty("address"), p.getProperty("city"), p.getProperty("state"), p.getProperty("zip"), p.getProperty("phone"), p.getProperty("ssn")));
		assertTrue("Can't locate Username text box", mp.customerLogin(driver, p.getProperty("user"), p.getProperty("pass")));
		
	}
	
	@After
	public void tearDown() {		

		//driver.quit();
		
	}

}
