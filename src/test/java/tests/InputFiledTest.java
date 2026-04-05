package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.InputFiled;

public class InputFiledTest extends BaseTest {

	@Test
	public void testFormFill() {
		InputFiled inputFiled = new InputFiled(driver, prop);
		inputFiled.formFill(prop.getProperty("name"));
		
		Assert.assertEquals(driver.findElement(By.id("name")).getAttribute("value"), prop.getProperty("name"), "Name input field should be filled with the correct value");
		
		
	}

}
