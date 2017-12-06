package cucumber.selenium;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	@Before("@Login")
	public void beforeLoginCtest(){
		System.out.println("precondition executed");
	}
	@Before
	public void beforeCtest(){
		System.out.println("precondition executed");
	}
	@After
	public void afterCtest(){
		System.out.println("postcondition executed");
	}
}
