package api.steps;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.Color;

import net.serenitybdd.core.Serenity;
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
	//uname.type("testttuyt");
	pwd.sendKeys(passwd);
    submit.click();
    System.out.println(getDriver().getWindowHandles().size());
    ((JavascriptExecutor)getDriver()).executeScript("window.open()");
    System.out.println(getDriver().getWindowHandle().toString());
    List<String> tabs=new ArrayList<String>(getDriver().getWindowHandles());
    getDriver().switchTo().window(tabs.get(1));
    System.out.println(Serenity.getCurrentSessionID());
    getDriver().get("https://www.google.com");
    getDriver().switchTo().window(tabs.get(0));
    getDriver().get("https://www.facebook.com");
   // getDriver().navigate().back();
    //String color1=uname.getCssValue("color");
  //  uname.get
   // String hex=Color.fromString(color1).asHex();
  //  Thread.sleep(10000);
  
    
	}
	
	public void checkDifferentPage(){
		checboxValidation.click();
		
	}
	

}
