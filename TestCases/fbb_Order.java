package TestCases;

import org.testng.annotations.Test;

import DataUtilities.Excelutility;
import globals.Constants;
import globals.Globals;
import pagObjects.LoginPageobjects;
import pagObjects.OrderObjects;
import pagObjects.QuickViewObjects;

import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;

public class fbb_Order extends Globals {
	
	@BeforeMethod
	  public void launchUrl() throws Exception {
		
		  System.setProperty("browser", "Chrome");
			 
			 setUp();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	 
		browserNav(QA_FutureGroup_URL);
		LoginPageobjects lgin = new LoginPageobjects(driver);
		
		 lgin.pncode.sendKeys(Enter_pincode);
	      lgin.checkbtn.click();
	      Thread.sleep(1000);
	      
		   
	  }
 
  @Test(priority = 0)
  public void PlaceOrder_withoutPrelogin() throws Exception {
	  
	  LoginPageobjects lgin = new LoginPageobjects(driver);
	  QuickViewObjects qv = new QuickViewObjects(driver);
	  OrderObjects od = new OrderObjects(driver);	 
	  
	  qv.clickWomens.click();
	
	 od.sortingDropdown.click();
	 od.sortNew.click();
	 Thread.sleep(1000);
	 
	  Thread.sleep(1000);
	  moveToElement(qv.PLPimage);  
	  od.AddtoBag_PLP.click();
	  WebDriverExplicitWait(driver,10,"xpath",Constants.AddtoBagSize_PLP);
	  od.AddtoBagSize_PLP.click();
	  
	  moveToElement(qv.BagIcon);
	  WebDriverExplicitWait(driver,10,"xpath",Constants.ViewBagButton);
	  od.ViewBagButton.click();
	  od.ProceedtoCheckout_Button.click();
	  
	  lgin.enterId.sendKeys(Excelutility.excelData(8, 0, 0));
		
	  lgin.enterPassword.sendKeys(Excelutility.excelData(8, 1, 0));
		
	  lgin.signinButton.click();
	  log("Logged in successfully");
	  WebDriverExplicitWait(driver,10,"id","checkoutBtn");
	  od.ProceedtoRevieworder_Button.click();
	  Thread.sleep(1000);
	  od.ProceedtoPayment_Button.click();
	  
	  WebDriverExplicitWait(driver,10,"xpath",Constants.CreditCard_Tab);
	  od.CreditCard_Tab.click();
	
	  od.UsedifferentCard_link.click();
	  
	  od.CardNumber.sendKeys(Constants.cardnumber);
	  od.CardName.sendKeys(Constants.cardname);
	  
	  od.CardExpiryMonth.click();
	  IsClickable(od.ExpiryMonth,10);
	  od.ExpiryMonth.click();
	  WebDriverExplicitWait(driver,10,"xpath",Constants.CardName);
	  od.CardExpiryYear.sendKeys(Constants.cardexpiryyear);
	  od.CardCVVNumber.sendKeys(Constants.cvvnumber);
	  od.CompletePaymentButton.click();
	  WebDriverExplicitWait(driver,100,"xpath",Constants.OrderNo);
	  log("Waiting for Transaction");
	  System.out.println("Order is successfully placed with order number " + od.OrderNo.getText());
	  
	  
  }
  @Test(enabled=true, priority = 1)
  public void PlaceOrder_AlreadyLoggedin() throws Exception  {
	  
	  LoginPageobjects lgin = new LoginPageobjects(driver);
	  QuickViewObjects qv = new QuickViewObjects(driver);
	  OrderObjects od = new OrderObjects(driver);	 
	  
	  moveToElement(lgin.loginIcon);
		
		lgin.loginButton.click();
		
		lgin.enterId.sendKeys(Excelutility.excelData(8, 0, 0));
		
		lgin.enterPassword.sendKeys(Excelutility.excelData(8, 1, 0));
		
		lgin.signinButton.click();
		 WebDriverExplicitWait(driver,10,"xpath",Constants.clickWomens);
		  qv.clickWomens.click();
		  
		  od.sortingDropdown.click();
		  od.sortNew.click();
		  Thread.sleep(1000);
		  qv.PLPimage.click();  
		  
		  od.AddtoBagSize_PDP.click();
		  od.AddtoBag_PDP.click();
		 
		  moveToElement(qv.BagIcon);
		  Thread.sleep(1000);
		  od.ViewBagButton.click();
		  od.ProceedtoCheckout_Button.click();
		  WebDriverExplicitWait(driver,10,"id","checkoutBtn");
		  od.ProceedtoRevieworder_Button.click();
		  //WebDriverExplicitWait(driver,10,"xpath",Constants.ProceedtoPayment_Button);
		  Thread.sleep(1000);
		  od.ProceedtoPayment_Button.click();
		  
		  WebDriverExplicitWait(driver,10,"xpath",Constants.CreditCard_Tab);
		  od.CreditCard_Tab.click();
		  
		  od.UsedifferentCard_link.click();
		  
		  od.CardNumber.sendKeys(Constants.cardnumber);
		  od.CardName.sendKeys(Constants.cardname);
		  
		  od.CardExpiryMonth.click();
		  IsClickable(od.ExpiryMonth,10);
		  od.ExpiryMonth.click();
		  WebDriverExplicitWait(driver,10,"xpath",Constants.CardName);
		  od.CardExpiryYear.sendKeys(Constants.cardexpiryyear);
		  od.CardCVVNumber.sendKeys(Constants.cvvnumber);
		  od.CompletePaymentButton.click();
		  WebDriverExplicitWait(driver,100,"xpath",Constants.OrderNo);
		  log("Waiting for Transaction");
		  System.out.println("Order is successfully placed with order number " + od.OrderNo.getText());
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  
	  //browserClose();
	  
  }

}
