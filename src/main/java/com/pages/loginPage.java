package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
private WebDriver driver;
  


private By emailId=By.id("email");

private By password=By.id("passwd");
private By submitBtn=By.name("SubmitLogin");
private By forgotPassword=By.linkText("Forgot your password?");



public loginPage(WebDriver driver) {
	this.driver=driver;
}
public String loginPageTitle (){
	return driver.getTitle();
}
public boolean isPasswordLinkExist() {
	return driver.findElement(forgotPassword).isDisplayed();
}
public void enterUserName(String UserName) {
	driver.findElement(emailId).sendKeys(UserName);
}
public void enterPassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(password).sendKeys("8");
	
}
public void clickButton() {
	driver.findElement(submitBtn).click();
}
}