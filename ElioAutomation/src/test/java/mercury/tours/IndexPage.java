package mercury.tours;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage {

	By USERNAME = By.name("userName");
	By PASSWORD = By.name("password");
	By SUBMIT_BUTTON = By.name("submit");
	By REGISTER = By.xpath("//td[@class = 'mouseOut'] [2]");
	By HOME_BUTTON = By.xpath(
			"/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a");
	By FLIGHTS = By.xpath(
			"/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a");
	By IMAGE = By.xpath(
			"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/p[1]/img");

	WebDriver driver;

	public boolean register(WebDriver driver) {

		try {
			WebElement banner = driver.findElement(By.xpath("//img[@src = 'images/banner2.gif']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(banner));
			driver.findElement(REGISTER).click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean home(WebDriver driver) {
		try {
			WebElement banner = driver.findElement(By.xpath("//img[@src = 'images/banner2.gif']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(banner));
			driver.findElement(HOME_BUTTON).click();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean signin(WebDriver driver, String user, String password) {

		try {

			WebElement banner = driver.findElement(By.xpath("//img[@src = 'images/banner2.gif']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(banner));
			driver.findElement(USERNAME).clear();
			driver.findElement(USERNAME).sendKeys(user);

			driver.findElement(PASSWORD).clear();
			driver.findElement(PASSWORD).sendKeys(password);

			driver.findElement(SUBMIT_BUTTON).click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean flights(WebDriver driver) {
		try {
			WebElement banner = driver.findElement(By.xpath("//img[@src = 'images/banner2.gif']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(banner));
			driver.findElement(FLIGHTS).click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//FLUENT WAIT
	public boolean FluentWait(WebDriver driver) {

		try {
					
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				    .withTimeout(Duration.ofSeconds(30))
				    .pollingEvery(Duration.ofSeconds(5))
				    .ignoring(NoSuchElementException.class);
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myElement")));
				
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

//	public boolean checkingPageLinks() {
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		String url = "";
//		List<String> brokenLinks = new ArrayList<String>();
//		List<String> okLinks = new ArrayList<String>();
//
//		HttpURLConnection httpConection = null;
//		int responseCode = 200;
//		Iterator<WebElement> it = links.iterator();
//
//		While(it.hasNext());
//		{
//			url = it.next().getAttribute("href");
//			if (url == null || url.isEmpty()) {
//				System.out.print(url + "url is not configured or it is empty");
//				continue;
//			}
//
//			try {
//				httpConection = (HttpURLConnection) (new URL(url).openConnection());
//				httpConection.setRequestMethod("HEAD");
//				httpConection.connect();
//				responseCode = httpConection.getResponseCode();
//
//				if (responseCode > 400) {
//					System.out.println("ERROR BROKIN LINK -- " + url);
//					brokenLinks.add(url);
//				} else {
//					System.out.println("VALID LINK -- " + url);
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		System.out.println("Valid Links" + okLinks.size());
//		System.out.println("Invalid Links" + brokenLinks.size());
//
//		if (brokenLinks.size() > 0) {
//			System.out.println("***** ERROR ---------------- bROKEN lINKS");
//			for (int i = 0; i < brokenLinks.size(); i++) {
//				System.out.println(brokenLinks.get(i));
//			}
//			return false;
//		} else {
//			return true;
//		}
//
//	}

	public boolean validateWebelementIsDisplayed(WebDriver driver) {

		WebElement banner = driver.findElement(By.xpath("//img[@src = 'images/banner2.gif']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(banner));

		try {
			driver.findElement(FLIGHTS).click();

			if (driver.findElement(IMAGE).isDisplayed())
				return true;

			else

				driver.findElement(FLIGHTS).click();
			driver.findElement(IMAGE).isDisplayed();

			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Elemento no encontrado");
		}
		return false;

	}

	public boolean test1() {
		try {

			WebElement webelement = (driver.findElement(By.xpath(
					"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/p[1]/img")));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(webelement));

			driver.switchTo().frame("MYFRAME");
			driver.switchTo().window("window");
			driver.switchTo().defaultContent();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean getLinks(WebDriver driver) {

		try {

			File f = new File("C:\\testing\\links.txt");
			f.createNewFile();

			String s = driver.getTitle();
			String a = driver.getPageSource();

			List<WebElement> links = driver.findElements(By.tagName("a"));

			System.out.println(s);
			System.out.println(links.size());

			FileWriter w = new FileWriter("C:\\testing\\links.txt");
			@SuppressWarnings("resource")
			BufferedWriter bw = new BufferedWriter(w);
			bw.write(s);
			bw.newLine();
			bw.write(a);
			bw.newLine();
			bw.flush();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
