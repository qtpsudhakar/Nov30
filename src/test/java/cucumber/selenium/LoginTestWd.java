package cucumber.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import wdutil.DriverFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestWd {
	WebDriver driver;

	@Given("^I launch the chrome browser$")
	public void OpenBrowser() {
		driver = DriverFactory.getDriver("chrome");
		System.out.println("Launched the chrome browser");
		System.out.println("first change");
	}

	@Given("^I enter OrangeHRM Url$")
	public void NavigateToOhrm() {

		// specify page load time
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// element wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize window
		// driver.manage().window().maximize();

		driver.get("http://localhost:81/orangehrm/symfony/web/index.php");
		// driver.get("http://localhost:81/orangehrm/symfony/web/index.php/auth/login");

		System.out.println("Orange Hrm Application launched");
	}

	@When("^I enter the username$")
	public void enterUserName() {
		// enter text on username
		driver.findElement(By.xpath("//*[@id='txtUsername']"))
				.sendKeys("admin");
		System.out.println("Entered the username");
	}

	@When("^I enter the password$")
	public void enterPassword() {
		// enter password
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(
				"sudhakar");
		System.out.println("Entered the Password");
	}

	@When("^I enter following username and password$")
	public void enterFollowingUserNameAndPasswordAs(DataTable tbl) {
		List<List<String>> data = tbl.raw();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
	}

	/*
	 * @When("^I enter the username as (.*) and password as (.*)$") public void
	 * enterUserNameAndPasswordAs(String uname, String pwd) {
	 * System.out.println(uname); System.out.println(pwd); }
	 */

	@When("^I click on Login button$")
	public void clickOnLoginButton() {
		// click on login button
		driver.findElement(By.cssSelector("#btnLogin")).click();
		System.out.println("Clicked On login Button");
	}

	@Then("^I will see the welcome page$")
	public void verifyWelcomePageOpened() {

		Assert.assertEquals("Is welcome page displayed",
				driver.findElement(By.linkText("PIM")).isDisplayed(), true);

	}
}
