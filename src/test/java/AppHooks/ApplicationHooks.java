package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.driverFactory.driverfactory;
import com.qa.utils.configReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	
	private driverfactory dfactorry;
	private WebDriver driver;
	Properties prop;
	@Before(order=0)
	public void getProperty() {
		configReader con=new configReader();
	 prop=	con.init_prop();
	}

	@Before(order=1)
		public void init_browser() {
		String browserName=prop.getProperty("browser");
		dfactorry=new driverfactory(); 
		driver=dfactorry.init_driver(browserName);
		
		}
	@Before(order=2)
	public void init_URL() {
	
		String urlName=prop.getProperty("url");
		driverfactory.getDriver().get(urlName);
	
	}
	
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
		
	}
	
	@After(order=1)
	public void teardown(Scenario scenario) {
		
				if (scenario.isFailed()) {
					// take screenshot:
					String screenshotName = scenario.getName().replaceAll(" ", "_");
					byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
					scenario.attach(sourcePath, "image/png", screenshotName);
	}

	}
}
	

