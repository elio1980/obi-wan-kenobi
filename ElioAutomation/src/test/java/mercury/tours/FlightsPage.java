package mercury.tours;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPage {
	By PASSAGERS = By.name("passCount");
	By DEPARTING = By.xpath("//select[@name = 'fromPort' ]");
	By CONTINUE_BUTTON = By.name("findFlights");
	By BACK_TO_HOME = By.xpath("//img[@src = 'images/home.gif']");
	By FLIGHT_TYPE_ONE_WAY = By.xpath("//*[@name = 'tripType'][2]");

	WebDriver driver;

	public boolean flightDetails(WebDriver driver, String passagear_number) {

		try {
			WebElement banner = driver.findElement(By.xpath("//img[@src = 'images/banner2.gif']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(banner));
			Select passagears = new Select(driver.findElement(PASSAGERS));
			passagears.selectByVisibleText(passagear_number);

			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean departing(WebDriver driver, String depart) {

		try {
			WebElement banner = driver.findElement(By.xpath("//img[@src = 'images/banner2.gif']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(banner));
			Select departing = new Select(driver.findElement(DEPARTING));
			departing.selectByVisibleText(depart);

			return true;
		}

		catch (Exception e) {
			e.printStackTrace();

		}
		return false;

	}

	public boolean continueButton(WebDriver driver) {

		try {
			driver.findElement(CONTINUE_BUTTON).click();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean backButton(WebDriver driver) {

		try {
			WebElement banner = driver.findElement(By.xpath("//img[@src = 'images/banner2.gif']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(banner));
			driver.findElement(BACK_TO_HOME).click();

			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean ftype(WebDriver driver) {
		try {
			driver.findElement(FLIGHT_TYPE_ONE_WAY).click();
			return true;} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
