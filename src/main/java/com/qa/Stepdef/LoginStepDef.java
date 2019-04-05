package com.qa.Stepdef;

import com.Pages.qa.LoginPage;
import com.TestBase.qa.TestBase;
import com.TestUtil.qa.TestUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDef extends TestBase{
	
	LoginPage loginPage;
	
	@Before 
	public void SetUP() {
		
		logger.info("Opening Browser");
		initil();
		
		
	}
	
	@Given("^I am in login page$")
	public void i_am_in_login_page()  {
		
		TestUtil.captureScreenShot(driver, "LoginPage");
		
		loginPage = new LoginPage();
	    
	}

	@When("^user enter user name and password and click signin button$")
	public void user_enter_user_name_and_password_and_click_signin_button()  {
		
		
		loginPage.VerifyLogin(prop.getProperty("UserName"), prop.getProperty("Password"));
	    
	}

	@Then("^verify user login successfully$")
	public void verify_user_login_successfully()  {
		
		TestUtil.captureScreenShot(driver, "HomePage");
		
		boolean dash = loginPage.VerifyHomePage();
		Assert.assertTrue(dash);
	}
	
	@After
	public void Teardown() {
		
		
		driver.quit();
	}


}
