package stepDefinations;

import org.junit.Assert;

import com.pages.contactUs;
import com.qa.driverFactory.driverfactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsPage {
	private contactUs cntpage=new contactUs(driverfactory.getDriver());
	
	@When("user gets contactusPageTitle")
	public void user_gets_contactus_page_title() {
		Assert.assertTrue(cntpage.iscontactUSExist());
	}
	@And("validate homepage icon")
	public void validate_home_page_icon() {
		Assert.assertTrue(cntpage.isHomeExist());
	}

	@Then("clickOn contactus page")
	public void click_on_contactus_page() {
		cntpage.clickOnContausLink();
		System.out.println("i am in contacts page");
	}

	@Then("select value form the dropdown")
	public void select_value_form_the_dropdown() {
	    cntpage.selectSubjectdropDown("Customer service34");
	    System.out.println("select value");
	}


	
	
	
}
