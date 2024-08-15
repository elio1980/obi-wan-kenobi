package mercury.tours;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTourPOM {	

	WebDriver driver;	

	String password = ("12345");
//	String user = ("elio");
	String passagear_number = ("4");
	String depart = ("London");

	@Before
	public void setup() throws IOException {
		
		FileReader fr = new FileReader("./src/test/java/mercury/tours/config.properties");
		Properties p = new Properties();
		p.load(fr);

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/newtours/index.php");
//		driver.get("https://google.com");
		driver.get(p.getProperty("baseurl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test
	public void test() throws IOException {
		
		FileReader fr = new FileReader("./src/test/java/mercury/tours/config.properties");
		Properties p = new Properties();
		p.load(fr);
		
		IndexPage index = new IndexPage();
		RegisterPage register = new RegisterPage();
		FlightsPage flights = new FlightsPage();
		
//		assertEquals("Welcome: Mercury Tours", driver.getTitle());
//		assertTrue("Not able to click on register button", index.register(driver));
//		assertTrue("Not able to register a user", register.UserRegister(driver, p.getProperty("user"), password));
//		assertTrue("Not able to click on Home button", index.home(driver));
//		assertTrue("Not able to signin", index.signin(driver, p.getProperty("user"), password));
//		assertTrue("Not able to click on Flights button", index.flights(driver));		
//		assertTrue("Not able to select flight type", flights.ftype(driver));
//		assertTrue("Not able to select passagears number", flights.flightDetails(driver, passagear_number));
//		assertTrue("Not able to select departing from dropdown", flights.departing(driver, depart));
//		assertTrue("No able to click on continue button", flights.continueButton(driver));
//		assertTrue("Not able to click on back home button", flights.backButton(driver));
//		assertTrue("Element is not displayed", index.validateWebelementIsDisplayed(driver));
		assertTrue("couldn't get the links", index.getLinks(driver));
		
//		assertTrue("Not able to click on back home button", index.FluentWait(driver));

	}
	
	@Before
	public void teardown() {
//		driver.quit();
		
	}

}
