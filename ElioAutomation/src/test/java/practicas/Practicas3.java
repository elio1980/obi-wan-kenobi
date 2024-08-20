package practicas;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Practicas3 {

	static WebDriver driver;driver=new ChromeDriver();

	public static void main(String[] args) {

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			String url = link.getAttribute("href");
			verifyLink(url);
		}

		driver.quit();

	}

	public static void verifyLink(String url) {
	try {	
		@SuppressWarnings("deprecation")
		URL link = new URL(url);
		HttpURLConnection conection = (HttpURLConnection) link.openConnection();
		conection.setConnectTimeout(3000);
		conection.connect();
		
		if (conection.getResponseCode() == 200) {
			System.out.println(url + " - " + conection.getResponseMessage());
			
		} else {
			System.out.println(url + " - " + conection.getResponseMessage() + " - "+ "is a broken link");
			
		}
		
	} catch (Exception e) {
		System.out.println(url + " - " + "is a broken Link")
	}
}

}
