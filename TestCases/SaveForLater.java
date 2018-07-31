package TestCases;

import globals.Constants;
import globals.Globals;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import DataUtilities.Excelutility;
import pagObjects.LoginPageobjects;
import pagObjects.OrderObjects;
import pagObjects.QuickViewObjects;
import pagObjects.SaveForLaterObjects;

public class SaveForLater extends Globals{
  
	  @BeforeMethod
	   public void url_launch() throws  Exception {
			
		  System.setProperty("browser", "Chrome");
			
			 
			 setUp();

		browserNav(QA_FutureGroup_URL);
	  }
	
/*	//Save For Later from PLP For not Logged in User
  @Test(priority = 0)
  public void fbbSaveForLaterNotLogin() throws Exception {
	  
	  LoginPageobjects lgin = new LoginPageobjects(driver);
	  SaveForLaterObjects sflater = new SaveForLaterObjects(driver);
	  
	  sflater.pncode.sendKeys(Excelutility.excelData(2, 2, 0));
	  sflater.checkbtn.click();
      Thread.sleep(1000);
	  
     moveToElement(sflater.wmenCtegory);
	  
	  Thread.sleep(1000);
	  
	  sflater.wmenLehnga.click();
	  Thread.sleep(1000);
	  
	  sflater.saveforLater.click();
	  
	  sflater.loginButton.click();
	  
	  lgin.enterId.sendKeys(Excelutility.excelData(2, 0, 0));
		
	  lgin.enterPassword.sendKeys(Excelutility.excelData(2, 1, 0));
		
	  lgin.signinButton.click();
		
		Thread.sleep(4000);
	  
  }
  
	//Save For Later from PLP For Logged in User
  @Test(priority = 1)
  public void fbbSaveForLaterPlpLogin() throws Exception {
	  SaveForLaterObjects sflater = new SaveForLaterObjects(driver);
	  
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();
	  
     moveToElement(sflater.wmenCtegory);
	  
	  Thread.sleep(1000);
	  
	  sflater.wmenLehnga.click();
	  Thread.sleep(1000);
	  
	  sflater.saveforLater.click();
	  Thread.sleep(1000);
	  WebDriverExplicitWait(driver,10,"xpath",Constants.saveforLaterPopUp);
	  
	  getText(sflater.saveforLaterPopUp);
	  
	  if(textData.trim().equalsIgnoreCase("Item removed from your saved list")){
          
		  sflater.saveforLater.click();

      }else{
              System.out.println("Product added to saved list");
      }
	  
	  }
  */
  
	//Save For Later from QuickView
  @Test(priority = 2)
  public void fbbSaveForLaterQuickView() throws Exception {
	  OrderObjects od = new OrderObjects(driver);
	  QuickViewObjects qv = new QuickViewObjects(driver);
	  SaveForLaterObjects sflater = new SaveForLaterObjects(driver);
	  
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();
	  
	  WebDriverExplicitWait(driver,10,"xpath",Constants.clickWomens);
	  
	  qv.clickWomens.click();
	  
	  od.sortingDropdown.click();
	  od.sortNew.click();
	  
	  //WebDriverExplicitWait(driver,20,"xpath",Constants.PLPimage);
	  //fluentWait(qv.PLPimage,10);
	  Thread.sleep(1000);
	  
	  moveToElement(qv.PLPimage);
	  qv.QuickviewLink.click();
	  switchToLatestTabOrWindow();
	  
	  sflater.saveforLaterQuickview.click();
	  
     
  }
  
/*//Save For Later from PDP
  @Test(priority = 3)
  public void fbbSaveForLaterPDP() throws Exception {
	  OrderObjects od = new OrderObjects(driver);
	  QuickViewObjects qv = new QuickViewObjects(driver);
	  SaveForLaterObjects sflater = new SaveForLaterObjects(driver);
	  
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();
	  
	  qv.clickWomens.click();
	  
	  od.sortingDropdown.click();
	  od.sortNew.click();
	 Thread.sleep(10000);
	  qv.PLPimage.click();
	  
	  sflater.saveforLaterPDP.click();
	  WebDriverExplicitWait(driver,10,"xpath",Constants.saveforLaterPopUp);
	  
	  getText(sflater.saveforLaterPopUp);
	  
	  if(textData.trim().equalsIgnoreCase("Item removed from your saved list")){
          
		  sflater.saveforLaterPDP.click();

      }else{
              System.out.println("Product added to saved list");
      }
	  
	  }
	  
  @Test(priority = 4)
  public void moveToAddtoBag() throws Exception{
	  SaveForLaterObjects sflater = new SaveForLaterObjects(driver);
	  
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();  

	  moveToElement(sflater.wmenCtegory);
	  
	  Thread.sleep(1000);
	  
	  sflater.wmenLehnga.click();
	  Thread.sleep(1000);
	  
	  sflater.saveforLater.click();
	  Thread.sleep(1000);
	  WebDriverExplicitWait(driver,10,"xpath",Constants.saveforLaterPopUp);
	  
	  getText(sflater.saveforLaterPopUp);
	  
	  if(textData.trim().equalsIgnoreCase("Item removed from your saved list")){
          
		  sflater.saveforLater.click();

      }else{
              System.out.println("Product added to saved list");
      }
	  
	  sflater.savedforLaterIcon.click();
	  sflater.addToBagButton.click();
	  WebDriverExplicitWait(driver,10,"xpath",Constants.addToBagSize);
	  sflater.addToBagSize.click();
	  WebDriverExplicitWait(driver,10,"xpath",Constants.addToBagPopupMsg);
	  log("Product is moving to Bag");
	  readText(sflater.addToBagPopupMsg);
	  }
  	@Test(priority = 5)
  	public void deleteProdcut() throws Exception{
	  SaveForLaterObjects sflater = new SaveForLaterObjects(driver);
	  
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();  

	  moveToElement(sflater.wmenCtegory);
	  
	  Thread.sleep(1000);
	  
	  sflater.wmenLehnga.click();
	  Thread.sleep(1000);
	  
	  sflater.saveforLater.click();
	  Thread.sleep(1000);
	  WebDriverExplicitWait(driver,10,"xpath",Constants.saveforLaterPopUp);
	  
	  getText(sflater.saveforLaterPopUp);
	  
	  if(textData.trim().equalsIgnoreCase("Item removed from your saved list")){
          
		  sflater.saveforLater.click();

      }else{
              System.out.println("Product added to saved list");
      }
	  
	  sflater.savedforLaterIcon.click();
	  
	  sflater.deleteProduct.click();
	  
	  WebDriverExplicitWait(driver,10,"xpath",Constants.deleteProductMsg);
	  
	  log("Product is removing from Saved Items");
	  readText(sflater.deleteProductMsg);
	  
	  }*/
  

	  
  @AfterMethod
  public void url_close() {
		
		//browserClose();
  }

}
