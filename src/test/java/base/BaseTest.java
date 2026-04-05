package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class BaseTest {
	
	public WebDriver driver;
	public Properties prop;
	
	@BeforeMethod
	public void setUp() {
		prop=ConfigReader.loadProperties();
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
	
	
	

}
