package buggy.rating;

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
		driver.get("https://buggy.justtestit.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void test() throws IOException {
		
		Main_Page mp = new Main_Page();
		Register_Page rp = new Register_Page();
		
		assertTrue("Register fail", rp.register_user(driver));
		assertTrue("user fail", mp.login(driver));
		assertTrue("Error selection make", mp.pupular_make(driver));

	}

	@After
	public void teardown(){
//		driver.quit();
	}
}
