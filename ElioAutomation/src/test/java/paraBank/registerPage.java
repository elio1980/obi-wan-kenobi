package paraBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerPage extends paraBank{
	
	WebDriver driver;
	
	By FIRST_NAME = By.id("customer.firstName");	
	By LAST_NAME= By.id("customer.lastName");
	By ADDRESS= By.id("customer.address.street");
	By CITY= By.id("customer.address.city");
	By STATE= By.id("customer.address.state");
	By ZIP= By.id("customer.address.zipCode");
	By PHONE= By.id("customer.phoneNumber");
	By SSN= By.id("customer.ssn");
	By USERNAME= By.id("customer.username");
	By PASSWORD= By.id("customer.password");
	By REPEATED_PASSWORD= By.id("repeatedPassword");
	By REGISTER_BUTTON= By.className("button");
	
	public boolean register(WebDriver driver, String name, String pass, String lastN, String address, String city, String state, String zip, String phone, String ssn) {
		
		try {
			
			driver.findElement(FIRST_NAME).sendKeys(name);
			driver.findElement(LAST_NAME).sendKeys(lastN);
			driver.findElement(ADDRESS).sendKeys(address);
			driver.findElement(CITY).sendKeys(city);
			driver.findElement(STATE).sendKeys(state);
			driver.findElement(ZIP).sendKeys(zip);
			driver.findElement(PHONE).sendKeys(phone);
			driver.findElement(SSN).sendKeys(ssn);
			driver.findElement(USERNAME).sendKeys(name);
			driver.findElement(PASSWORD).sendKeys(pass);
			driver.findElement(REPEATED_PASSWORD).sendKeys(pass);
			driver.findElement(REGISTER_BUTTON).click();
			
			return true;
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}		
		return false;
		
	}

}
