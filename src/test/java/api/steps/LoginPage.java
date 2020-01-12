package api.steps;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.Scenario;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;


public class LoginPage extends PageObject{

	@FindBy(xpath="//*[@id='userid-content']")
	 WebElementFacade uname;
	
	@FindBy(xpath="//*[@id='password-content']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@value='red']")
	WebElementFacade checboxValidation;
	
	@FindBy(xpath="//*[@id='main-content-rwd']/div/div[1]/div//input[@id='log-in-button']")
	WebElementFacade submit;
	
	@Step("testLoginPage")
	public void login(String username, String passwd) throws InterruptedException, IOException{
	uname.sendKeys(username);
	uname.type("testttuyt");
	pwd.sendKeys(passwd);
    submit.click();
   
	}
	public void checkDifferentPage(){
		checboxValidation.click();
		
	}
	

}
