package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.InputFiled;

public class InputFiledTest extends BaseTest {

	@Test
	public void testFormFill() {
		InputFiled inputFiled = new InputFiled(driver, prop);
		inputFiled.formFill(prop.getProperty("name"));
	}

}
