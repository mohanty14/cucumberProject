package stepDefinations;

import org.junit.Assert;

import com.pages.loginPage;
import com.qa.driverFactory.driverfactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	private loginPage lgpage=new loginPage(driverfactory.getDriver());
	String title;
	@Given("user is on loginpage")
	public void user_is_on_loginpage() throws InterruptedException {
		//driverfactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	System.out.println("hello loin page");
		Thread.sleep(2000);
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title=lgpage.loginPageTitle();
		System.out.println("page title is :" + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String actualTitle) {
		String title=lgpage.loginPageTitle();
		Assert.assertEquals(title,actualTitle);
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(lgpage.isPasswordLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		lgpage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		lgpage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		lgpage.clickButton();
	}



}
