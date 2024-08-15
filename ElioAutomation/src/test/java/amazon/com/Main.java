package amazon.com;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void test() throws IOException {

		mainPage mp = new mainPage();
		crearCuenta cc = new crearCuenta();

//		assertTrue("Unable to add the item", mp.buyAnItem(driver));
		assertTrue("Unable to register user", mp.newUser(driver));
		assertTrue("Unable to send user data", cc.newUser(driver));

	}
	
	@After
	public void teardown() {
		
//		driver.quit();
		
	}

}
