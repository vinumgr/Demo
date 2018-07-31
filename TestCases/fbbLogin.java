package TestCases;

import globals.Constants;
import globals.Globals;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DataUtilities.Excelutility;
import pagObjects.LoginPageobjects;

public class fbbLogin extends Globals {
  
	//Launch the Browser
	@BeforeMethod
  public void url_launch() throws  Exception {
		
	  System.setProperty("browser", "Chrome");
		
		 
		 setUp();

	browserNav(QA_FutureGroup_URL);
  }

	//Test case for Login with Valid credentials
  @Test(priority = 0)
  public void fbblogin() throws Exception{
		
		LoginPageobjects lgin = new LoginPageobjects(driver);
		
		lgin.pncode.sendKeys(Excelutility.excelData(2, 2, 0));
        lgin.checkbtn.click();
        Thread.sleep(1000);
        	
	        
		moveToElement(lgin.loginIcon);
		
		lgin.loginButton.click();
		
		lgin.enterId.sendKeys(Excelutility.excelData(2, 0, 0));
		
		lgin.enterPassword.sendKeys(Excelutility.excelData(2, 1, 0));
		
		 Thread.sleep(1000);
		
		lgin.signinButton.click();
		
		Thread.sleep(1000);
		
		//captureScreen();
		
		
  }
  
  
 /* //Test case for Login with Valid credentials and Logout
  @Test(priority = 1)
  public void fbblogin_signout() throws Exception{
		
		LoginPageobjects lgin = new LoginPageobjects(driver);
		
		lgin.pncode.sendKeys(Excelutility.excelData(2, 2, 0));
        lgin.checkbtn.click();
        Thread.sleep(1000);
	
	        
		moveToElement(lgin.loginIcon);
		
		lgin.loginButton.click();
		
		lgin.enterId.sendKeys(Excelutility.excelData(3, 0, 0));
		
		lgin.enterPassword.sendKeys(Excelutility.excelData(3, 1, 0));
		
		Thread.sleep(1000);
		
		lgin.signinButton.click();
		
		Thread.sleep(10000);
		
		moveToElement(lgin.loginIcon);
		
		Thread.sleep(1000);
		
	   lgin.signoutButton.click();
		
		Thread.sleep(1000);
  }
  
 //Invalid user name and Valid Password
  @Test(priority = 2)
  public void fbbinvalidusername() throws Exception{
	  
		LoginPageobjects lgin = new LoginPageobjects(driver);
		
		lgin.pncode.sendKeys(Excelutility.excelData(2, 2, 0));
        lgin.checkbtn.click();
        Thread.sleep(1000);
	
	        
		moveToElement(lgin.loginIcon);
		
		lgin.loginButton.click();
		
		lgin.enterId.sendKeys(Excelutility.excelData(4, 0, 0));
		
		lgin.enterPassword.sendKeys(Excelutility.excelData(4, 1, 0));
		
		lgin.signinButton.click();
		
		Thread.sleep(10000);
		
		getText(lgin.errormsg);
		
		Thread.sleep(1000);
		
		 if(textData.trim().equalsIgnoreCase("Enter valid Mobile Number/Email id")){
	            System.out.println("Testcase pass");

	        }else{
	                System.out.println("Testcase fail");
	        }
		
		Thread.sleep(10000);
  }
  
//Valid user name and invalid Password
  @Test(priority = 3)
  public void fbbinvalidpwd() throws Exception{
	  
		LoginPageobjects lgin = new LoginPageobjects(driver);
		
		lgin.pncode.sendKeys(Excelutility.excelData(2, 2, 0));
        lgin.checkbtn.click();
        Thread.sleep(1000);
	
	        
		moveToElement(lgin.loginIcon);
		
		lgin.loginButton.click();
		
		Thread.sleep(10000);
		
		lgin.enterId.sendKeys(Excelutility.excelData(5, 0, 0));
		
		lgin.enterPassword.sendKeys(Excelutility.excelData(5, 1, 0));
		
		lgin.signinButton.click();
		
		
		
		WebDriverExplicitWait(driver,10,"xpath",".//*[@id='form-account-create-t']/fieldset/div[5]/p");
		
		getText(lgin.errormsg);
		
		 if(textData.trim().equalsIgnoreCase("Enter valid Mobile Number/Email id")){
			   System.out.println("Testcase pass");

	        }else{
	                System.out.println("Testcase fail");
	        }
		
		Thread.sleep(10000);
  }
  
//User Name Left blank
  
  @Test(priority = 4)
  
  public void fbbinvalid_BlankUsername() throws Exception {
   
	  LoginPageobjects lgin = new LoginPageobjects(driver);
		
	  lgin.pncode.sendKeys(Excelutility.excelData(2, 2, 0));
      lgin.checkbtn.click();
      Thread.sleep(1000);
	
	        
		moveToElement(lgin.loginIcon);
		
		lgin.loginButton.click();
		
		lgin.enterId.sendKeys(Excelutility.excelData(6, 0, 0));
		
		lgin.enterPassword.sendKeys(Excelutility.excelData(6, 1, 0));
		
		lgin.signinButton.click();
		
		
		
		WebDriverExplicitWait(driver,10,"xpath",".//*[@id='form-account-create-t']/fieldset/div[5]/p");
		
		getText(lgin.errormsg);
		
		 if(textData.trim().equalsIgnoreCase("Enter valid Mobile Number/Email id")){
			   System.out.println("Testcase pass");

	        }else{
	                System.out.println("Testcase fail");
	        }
  }
  
  
//Password Left blank
  
  @Test(priority = 5)
  
  public void fbbinvalid_Blankpassword() throws Exception {
   
	  LoginPageobjects lgin = new LoginPageobjects(driver);
		
	  lgin.pncode.sendKeys(Excelutility.excelData(2, 2, 0));
      lgin.checkbtn.click();
      Thread.sleep(1000);
	
	        
		moveToElement(lgin.loginIcon);
		
		lgin.loginButton.click();
		
		lgin.enterId.sendKeys(Excelutility.excelData(7, 0, 0));
		
		lgin.enterPassword.sendKeys(Excelutility.excelData(7, 1, 0));
		
		Thread.sleep(10000);
		
		lgin.signinButton.click();
		
		
		
		WebDriverExplicitWait(driver,10,"xpath",".//*[@id='form-account-create-t']/fieldset/div[5]/p");
		
		getText(lgin.errormsg);
		
		 if(textData.trim().equalsIgnoreCase("Incorrect sign in credentials")){
			   System.out.println("Testcase pass");

	        }else{
	                System.out.println("Testcase fail");
	        }
  }
  
//User name and Password Left blank
  
  @Test(priority = 6)
  
  public void invalid_Blankcredentials() throws Exception {
   
	  LoginPageobjects lgin = new LoginPageobjects(driver);
		
	  lgin.pncode.sendKeys(Excelutility.excelData(2, 2, 0));
      lgin.checkbtn.click();
      Thread.sleep(1000);
	
	        
		moveToElement(lgin.loginIcon);
		
		lgin.loginButton.click();
		
		lgin.enterId.sendKeys(Excelutility.excelData(8, 0, 0));
		
		lgin.enterPassword.sendKeys(Excelutility.excelData(8, 1, 0));
		
		lgin.signinButton.click();
		
	
		
		WebDriverExplicitWait(driver,10,"xpath",".//*[@id='form-account-create-t']/fieldset/div[5]/p");
		
		getText(lgin.errormsg);
		
		 if(textData.trim().equalsIgnoreCase("Enter valid Mobile Number/Email id")){
			   System.out.println("Testcase pass");

	        }else{
	                System.out.println("Testcase fail");
	        }
		 
		  }*/
  
  
  
 
  
  //Closing the Browser
  @AfterMethod
  public void testIT(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			captureScreen();
		}
			
		
		browserClose();
  }

}