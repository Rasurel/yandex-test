package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/anna/Documents/workspace/testio/chromedriver");
		//DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setBrowserName("chrome");
		//driver = new RemoteWebDriver(new URL("http://10.252.47.15:4444/wd/hub"), dc);
		driver = new ChromeDriver();
	}
}
