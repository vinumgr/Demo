package TestCases;

import globals.Constants;
import globals.Globals;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import pagObjects.RegistrationPageObjects;

public class fbbRegistration extends Globals{
  
	//Launch the Browser
  @BeforeTest
  public void url_launch() throws  Exception {
		
	  System.setProperty("browser", "Chrome");
		 
		 setUp();

	browserNav(QA_FutureGroup_URL);
  }

//Test case for Registration for valid information
  @Test
  public void fbbregistration() throws Exception{
		
	  RegistrationPageObjects regd = new RegistrationPageObjects(driver);
		
	  regd.pncode.sendKeys(Enter_pincode);
	  regd.checkbtn.click();
	        Thread.sleep(1000);
	        
		moveToElement(regd.loginIcon);
		
		regd.signupbtn.click();
		
		//Enter all the Valid information in Registration Page and click on OTP generate
		
		regd.emailid.sendKeys(Constants.fbb_RegdId);
		regd.firstName.sendKeys(Constants.fbb_RegdFirstName);
		regd.lastName.sendKeys(Constants.fbb_RegdLastName);
		regd.passwrd.sendKeys(Constants.fbb_RegdPwd);
		regd.cfmpwd.sendKeys(Constants.fbb_RegdCfmPwd);
		regd.cntnumbr.sendKeys(Constants.fbb_RegdCntnber);
		
		regd.otpGeneration.click();
		
		Thread.sleep(10000);
  }
  
//Closing the Browser
  @AfterTest
  public void url_close() {
		
		browserClose();
  }

}