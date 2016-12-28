package basic;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/anna/Documents/workspace/testio/chromedriver");
//		Jenkins runs
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(new URL("http://10.252.47.15:5555/wd/hub"), capabilities);
		
		
//		Local runs
//		driver = new ChromeDriver();
	}
}
