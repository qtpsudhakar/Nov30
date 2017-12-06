package wdutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	static WebDriver driver;

	public static WebDriver getDriver(String brName) {

		switch (brName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver",
					"F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver",
					"F:\\SeleniumSoftware\\BrowserDrivers\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("no browser name matched");
			// exit from execution
			System.exit(0);
		}
		
		return driver;
	}

}
