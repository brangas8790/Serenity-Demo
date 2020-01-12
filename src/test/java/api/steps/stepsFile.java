package api.steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.annotations.Screenshots;
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
	@Screenshots(disabled=true)
	public void ope_Discover_login_page() {
		login.open();
		
		
		
	}


	@When("^invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	@Screenshots(forEachAction=true)
	public void invalid_and(String arg1, String arg2) throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		login.login(arg1, arg2);
	}

	@Then("^display error message$")
	@Screenshots(disabled=true)
	public void display_error_message() {
		getDriver().navigate().to("https://www.ironspider.ca/forms/checkradio.htm");
		login.checkDifferentPage();
	}
}
