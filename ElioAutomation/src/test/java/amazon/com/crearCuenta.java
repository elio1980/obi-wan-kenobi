package amazon.com;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class crearCuenta {

	By NOMBRE = By.id("ap_customer_name");
	By TELEFONO = By.id("ap_email");
	By CONTRASENA = By.id("ap_password");
	By CONTRASENA_2 = By.id("ap_password_check");
	By CONTINUAR_BUTTON = By.id("continue");

	public boolean newUser(WebDriver driver) throws IOException {

		FileReader fr = new FileReader("./src/test/java/amazon/com/configuration.properties");
		Properties p = new Properties();
		p.load(fr);

		try {

			driver.findElement(NOMBRE).sendKeys(p.getProperty("nombre"));
			driver.findElement(TELEFONO).sendKeys(p.getProperty("celphone"));
			driver.findElement(CONTRASENA).sendKeys(p.getProperty("contrasena"));
			driver.findElement(CONTRASENA_2).sendKeys(p.getProperty("contrasena"));
			driver.findElement(CONTINUAR_BUTTON).click();

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

}
