package com.qa.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverfactory {
public WebDriver driver;
  public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
  //driver details
  
  public WebDriver init_driver(String browser) {
	  System.out.println("browser value is :" + browser);
	  if(browser.equals("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  tlDriver.set(new ChromeDriver());
		  
	  }
	  else if(browser.equals("firefox")) {
		  WebDriverManager.firefoxdriver().setup();
		  tlDriver.set(new FirefoxDriver());
		  
	  }
	  else {
		  System.out.println("please enter the correct browser : " + browser);
	  }
	  getDriver().manage().deleteAllCookies();
	  getDriver().manage().window().maximize();
	  return getDriver();
  }
  public static synchronized WebDriver getDriver() {
	  return tlDriver.get();
  }
}

