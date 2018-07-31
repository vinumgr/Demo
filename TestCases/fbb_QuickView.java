package TestCases;

import org.testng.annotations.Test;

import globals.Constants;
import globals.Globals;
import pagObjects.AddToCartObjects;
import pagObjects.LoginPageobjects;
import pagObjects.OrderObjects;
import pagObjects.QuickViewObjects;

import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class fbb_QuickView extends Globals{
	
	 @BeforeMethod
	  public void launchUrl() throws Exception {
		
		  System.setProperty("browser", "Chrome");
			 
			 setUp();

		browserNav(QA_FutureGroup_URL);
		LoginPageobjects lgin = new LoginPageobjects(driver);
		OrderObjects od = new OrderObjects(driver);
		 lgin.pncode.sendKeys(Enter_pincode);
	      lgin.checkbtn.click();
	      Thread.sleep(1000);
	      QuickViewObjects qv = new QuickViewObjects(driver);
		  qv.clickWomens.click(); 
		  od.sortingDropdown.click();
			od.sortNew.click();
			Thread.sleep(10000);
			lgin.checkbtn.getAttribute("style");
	  }
	 
	 //Verify if Quick View Popup is displaying
  @Test(enabled = true, priority = 0)
  public void openQuickview() {
	  
	  QuickViewObjects qv = new QuickViewObjects(driver);
	 
	  moveToElement(qv.PLPimage);
	  qv.QuickviewLink.click();
	  
	  switchToLatestTabOrWindow();
	  verifyText(qv.QuickViewpopup_verification, "Size Guide");
	  qv.QuickViewPopupClose.click();
	  
  }
  //Verify if user is able to add a product to bag after selecting the size when logged in
  @Test(enabled = true, priority = 1)
  public void Quickview_AddtoBagLoggedin_Positive() throws Exception {
	  
	  String title = driver.getTitle();
	  QuickViewObjects qv = new QuickViewObjects(driver);
	  AddToCartObjects aToc = new AddToCartObjects(driver);
	  
	  moveToElement(qv.PLPimage);
	  qv.QuickviewLink.click();
	  switchToLatestTabOrWindow();
	 
	  //WebDriverExplicitWait(driver,10,"xpath",Constants.QuickViewproduct_size);
	  aToc.QuickviewsizeSelect();
	  qv.AddtoBagButton.click();
	  qv.QuickViewPopupClose.click();
	 
	  Thread.sleep(1000);
	  //IsClickable(qv.BagIcon,100);
	  qv.BagIcon.click();
	  log("Verify if product added to bag");
	  verifyText(qv.BagItemCount, "(1 item)");
	  
	  
  }
//Verify if user is able to add a product to bag without selecting the size when logged in
  @Test(enabled = true, priority = 2)
  public void Quickview_AddtoBagLoggedin_Negative() {
	  
	  
	  QuickViewObjects qv = new QuickViewObjects(driver);
	  
	  
	  moveToElement(qv.PLPimage);
	  qv.QuickviewLink.click();
	  switchToLatestTabOrWindow();
	  
	  qv.AddtoBagButton.click();
	  log("Verify if correct error msg displayed");
	  verifyText(qv.AddtoBagErrorMsg, "Please select a size");
	  qv.QuickViewPopupClose.click();
	 
	  
  }
//Verify if user is able to add a product to bag when not logged in
  @Test(enabled = true, priority = 3)
  public void Quickview_SaveforlaterNotloggedin() throws Exception {
	  
	  LoginPageobjects lgin = new LoginPageobjects(driver);
	  QuickViewObjects qv = new QuickViewObjects(driver);
	  
	  
	  moveToElement(qv.PLPimage);
	  qv.QuickviewLink.click();
	  switchToLatestTabOrWindow();
	  qv.SaveforLater_Link.click();
	  qv.QuickViewPopupClose.click();
	  
	  Thread.sleep(1000);
	  
	  moveToElement(qv.SaveforLater_Icon);
	  qv.saveforlater_login.click();
		
	  lgin.enterId.sendKeys(Constants.fbb_UserName);
		
	  lgin.enterPassword.sendKeys(Constants.fbb_Password);
		
	  lgin.signinButton.click();
	  
	  
	  
  }
//Verify if user is able to go to product details from QuickView
  @Test(enabled = true, priority = 4)
  public void Quickview_productdetails_Link() throws Exception {
	  
	  LoginPageobjects lgin = new LoginPageobjects(driver);
	  QuickViewObjects qv = new QuickViewObjects(driver);
	  
	  moveToElement(qv.PLPimage);
	  qv.QuickviewLink.click();
	  switchToLatestTabOrWindow();
	  Thread.sleep(1000);
	  qv.seeproductDetails.click();
	  log("Verify if it is redirected to respective PDP");
	  verifyurl(driver, "http://lbtest.fbbonline.in/Solid-Womens-Jeggings-72.html");
  }

  @AfterMethod
  public void closeBrowser() {
  
  	browserClose();
}
  }
