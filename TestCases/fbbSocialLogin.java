package TestCases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DataUtilities.Excelutility;
import globals.Constants;
import globals.Globals;
import pagObjects.LoginPageobjects;
import pagObjects.QuickViewObjects;

public class fbbSocialLogin extends Globals{
	
	@BeforeMethod
	  public void url_launch() throws  Exception {
			
		  System.setProperty("browser", "Chrome");
			
			 
			 setUp();

		browserNav(QA_FutureGroup_URL);
	  }
	 //Signin with Facebook from Login page with valid credentials 
	  
	@Test(priority=0)
	  public void fbb_Facebooklogin() throws Exception {
		  QuickViewObjects qv = new QuickViewObjects(driver); 
		  LoginPageobjects lgin = new LoginPageobjects(driver);
			
		  lgin.pncode.sendKeys(Excelutility.excelData(2, 2, 0));
	      lgin.checkbtn.click();
	      Thread.sleep(1000);
		        
			moveToElement(lgin.loginIcon);
			Thread.sleep(1000);
			lgin.loginButton.click();
			
			lgin.signinFb.click();
			
			switchToNextTabOrWindow();
			
			driver.manage().window().maximize();
			
			lgin.fbUserid.sendKeys(Constants.fbb_Facebook_Username);
			lgin.fbPwd.sendKeys(Constants.fbb_Facebook_Passwod);
			
			lgin.fblogin.click();
			log("Facebook Signin is successful");
			
			Thread.sleep(1000);
			
			switchWindowByTitle("My account");
			
			moveToElement(lgin.loginIcon);
			
		   lgin.signoutButton.click();
		   
		   lgin.signMeOutbutton.click();
			
		   log("Logged out sucessfully");
		   
			}
	  
	  //Signin with Google from Login page with valid credentials
	  @Test(priority=1, enabled = false)
	  public void fbb_Googlelogin() throws Exception {
		   
		  LoginPageobjects lgin = new LoginPageobjects(driver);
			
		  lgin.pncode.sendKeys(Excelutility.excelData(2, 2, 0));
	      lgin.checkbtn.click();
	      Thread.sleep(1000);
		        
			moveToElement(lgin.loginIcon);
			
			lgin.loginButton.click();
			
			lgin.signinGoogle.click();
			
			switchToLatestTabOrWindow();
			
			driver.manage().window().maximize();
			
			lgin.googleUsername.sendKeys(Constants.fbb_Google_Username);
			lgin.googleNext.click();
			Thread.sleep(1000);
			lgin.googlePwd.sendKeys(Constants.fbb_Google_Passwod);
			
			lgin.googleSignin.click();
			
			log("Google Signin is successful");
			Thread.sleep(1000);
			
			switchWindowByTitle("My account");
			
			moveToElement(lgin.loginIcon);
			
		   lgin.signoutButton.click();
		   
		   lgin.signMeOutbutton.click();
			
		   log("Logged out sucessfully");
		   
			
			}
	  
	  @AfterMethod
	  public void afterMethod() {
		  
		//browserClose();
		  
	  }

}
