package api.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;

public class stepsFile extends PageObject {
	
    
	LoginPage login;
	
	@Steps
	 WrappedWebDriver wrappDriver;
	
	 WebDriver driver;
	 EnvironmentVariables environmentVariables;
	
	@Given("^ope Discover login page$")
	public void ope_Discover_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
//		driver=wrappDriver.newDriver();
//		driver.navigate().to("https://www.google.com");
		//System.out.println(ThucydidesSystemProperty.WEBDRIVER_BASE_URL.from(environmentVariables));
		login.open();
		
		System.out.println(ThucydidesSystemProperty.WEBDRIVER_BASE_URL.from(environmentVariables));
		login.openUrl(ThucydidesSystemProperty.WEBDRIVER_BASE_URL.from(environmentVariables));
		
		
	}


	@When("^invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void invalid_and(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^display error message$")
	public void display_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
}
