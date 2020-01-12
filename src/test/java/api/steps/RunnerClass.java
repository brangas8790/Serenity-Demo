package api.steps;
import org.junit.runner.RunWith;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		format={"html:report/SerenityDemo.html"}
//	features="src/test/java/test.feature",
//	glue={"api.steps"}
		)


public class RunnerClass {

}
