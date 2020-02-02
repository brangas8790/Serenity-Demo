package api.steps;

import java.io.IOException;

import org.openqa.selenium.By;
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
	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() {
		System.out.println("AM IN LOGIN PAGE");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I submit username and password$")
	public void i_submit_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
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
	@Given("^search text \"([^\"]*)\"$")
	public void search_text(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		getDriver().navigate().to("https://www.amazon.com/");
		getDriver().findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(arg1);
	}

	@When("^click entered$")
	public void click_entered() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^display search results$")
	public void display_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	@Given("^search resuls \"([^\"]*)\"$")
	public void search_resuls(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		getDriver().findElement(By.xpath("//*[@id='nav-xshop']/a[1]")).click();
	}

	@When("^click somehyperlink$")
	public void click_somehyperlink() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^see wats happening$")
	public void see_wats_happening() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}
