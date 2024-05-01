package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.utils.ElemntUtils;

public class contactUs {
	private WebDriver driver;
	ElemntUtils elementutils=new ElemntUtils(driver);

public contactUs(WebDriver driver) {
	this.driver=driver;
}

	private By ContaUsLInk=By.xpath("//a[@title='Contact Us']");

	private By home=By.className("home");
	private By subjectHeading=By.xpath("//label[text()='Subject Heading']");
	private By subjectValue=By.xpath("//select[@class='form-control23']");
	
	public boolean iscontactUSExist() {
		return driver.findElement(ContaUsLInk).isDisplayed();
	}
	public boolean isHomeExist() {
		return driver.findElement(home).isDisplayed();
	}
	public boolean issubjectHeadingExist() {
		return driver.findElement(subjectHeading).isDisplayed();
	}
	public void selectSubjectdropDown(String value) {
List<WebElement> values = driver.findElements(subjectValue);
		
		for(int i=0; i<values.size(); i++){
			String text  = values.get(i).getText();
			System.out.println(text);
			if(text.equals(value)){
				values.get(i).click();
				break;
			}
	}
		
	}
	public void clickOnContausLink() {
		boolean cntlink=driver.findElement(home).isDisplayed();
		if(cntlink) {
			driver.findElement(home).click();
		}
	}
}
