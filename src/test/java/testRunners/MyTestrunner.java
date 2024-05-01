package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/appFeatures/contactusPage.feature"},
		glue= {"stepDefinations","AppHooks"},
		monochrome=true,
		plugin= {"pretty","summary"}
		
		)
public class MyTestrunner {
	
	

}
