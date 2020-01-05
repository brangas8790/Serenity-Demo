package api.steps;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;

public class WrappedWebDriver implements DriverSource{

	String browser="";
	@Override
	public WebDriver newDriver() {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		browser=SystemEnvironmentVariables.createEnvironmentVariables().getProperty("setup.driver");
		cap=DesiredCapabilities.chrome();
		System.setProperty("webdriver.chrome.driver", "/Users/brangas/Documents/workspace/item_details/chromedriver");
		WebDriver driver=null;
		ChromeOptions options=new ChromeOptions();
		//options.setExperimentalOption("prefs", prefs);
		options.addArguments("disable-infobars");
		options.addArguments("disable-extensions");
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		options.addArguments("--start-maximized");
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(options);
		return driver;
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return false;
	}

}
