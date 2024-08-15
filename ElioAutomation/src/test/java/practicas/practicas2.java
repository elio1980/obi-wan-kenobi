package practicas;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practicas2 {	
	
	WebDriver driver;
	
	@After
	public void setup() throws IOException {
		
		FileReader fr = new FileReader("./src/test/java/Practicas/variables.properties");
		Properties p = new Properties();
		p.load(fr);
		
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(p.getProperty("baseUrl"));
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		
		
	}
	
	@Test
	public void test(){
		
		pagina1 paginauno = new pagina1();
		assertTrue("message", paginauno.mainPage(driver));
		
	}
	
	@Before
	public void teardown() {
//		driver.quit();
	}

}
