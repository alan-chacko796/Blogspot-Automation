package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputFiled {
	WebDriver driver;
	Properties prop;
	WebDriverWait wait;
	
	//Locators for input fields
	By nameInput = By.id("name");
	
	public InputFiled(WebDriver driver, Properties prop) {
		this.driver=driver;
		this.prop=prop;
		this.wait=new WebDriverWait(driver, java.time.Duration.ofSeconds(15));

	}
	
	public void formFill(String name) {
		WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(nameInput));
		nameField.sendKeys(name);
	}
	
	

}
