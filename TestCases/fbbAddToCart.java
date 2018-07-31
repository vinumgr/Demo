package TestCases;

import globals.Globals;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import pagObjects.AddToCartObjects;
import pagObjects.OrderObjects;


public class fbbAddToCart extends Globals{
  
  @BeforeMethod
   public void url_launch() throws  Exception {
		
	  System.setProperty("browser", "Firefox");
		
		 
		 setUp();

	browserNav(QA_FutureGroup_URL);
  }
  
 /* //Add product to cart from PLP  for particular size and Go to cart page through mini cart(For Logged in User)
  @Test(priority = 0)
  public void fbbAddtoCArtMinicart() throws Exception {
	   
	  AddToCartObjects atcart = new AddToCartObjects(driver);
		
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();
	       
	  moveToElement(atcart.wmenCtegory);
	  
	  Thread.sleep(1000);
	  
	  atcart.wmenLehnga.click();
	  Thread.sleep(1000);
    //driver.navigate().refresh();
	 moveToElement(atcart.productImage);
	  
	  atcart.wmenPlpAddtobag.click();
	  
	  moveToElement(atcart.productImage);
	  
	  Thread.sleep(100);
	  
	  
	  if( atcart.selectsizePlpsmall.isEnabled()) {
		 
		  atcart.selectsizePlpsmall.click();
			 System.out.println("Small size is selected");
			  
		    }
	
	 else if(atcart.selectsizePlpmedium.isEnabled())  {
		 atcart.selectsizePlpmedium.click();
		    System.out.println("Medium size is selected");
		    
		    }
	 else if(atcart.selectsizePlplarge.isEnabled())  {
		 atcart.selectsizePlplarge.click();
		    System.out.println("Large size is selected");
		    }
	 else if(atcart.selectsizePlpxl.isEnabled())  {
		 atcart.selectsizePlpxl.click();
		    System.out.println("XL size is selected");
		    }
	 else if(atcart.selectsizePlpxxl.isEnabled())  {
		 atcart.selectsizePlpxxl.click();
		    System.out.println("XXL size is selected");
		    }
	 else {
		 System.out.println("Product is Out of stock");
	 }
	  
	  Thread.sleep(100);
	  
	  moveToElement(atcart.miniCartIcon);
	  
	  Thread.sleep(1000);
	  
	 atcart.minicartViewall.click();
	 
  
}
  
 //Add product to cart from PLP  for particular size and Go to cart page through cart icon on header(For Logged in User)
  @Test(priority = 1)
  public void fbbAddtoCArtplpIcon() throws Exception {
	   
	  AddToCartObjects atcart = new AddToCartObjects(driver);
		
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();
	       
	  moveToElement(atcart.wmenCtegory);
	  
	  Thread.sleep(100);
	  
	  atcart.wmenLehnga.click();
	 
    //driver.navigate().refresh();
	 moveToElement(atcart.productImage);
	  
	  atcart.wmenPlpAddtobag.click();
	  
	  moveToElement(atcart.productImage);
	  
	  Thread.sleep(100);
	  
	  
	  if( atcart.selectsizePlpsmall.isEnabled()) {
		 
		  atcart.selectsizePlpsmall.click();
			 System.out.println("Small size is selected");
			  
		    }
	
	 else if(atcart.selectsizePlpmedium.isEnabled())  {
		 atcart.selectsizePlpmedium.click();
		    System.out.println("Medium size is selected");
		    
		    }
	 else if(atcart.selectsizePlplarge.isEnabled())  {
		 atcart.selectsizePlplarge.click();
		    System.out.println("Large size is selected");
		    }
	 else if(atcart.selectsizePlpxl.isEnabled())  {
		 atcart.selectsizePlpxl.click();
		    System.out.println("XL size is selected");
		    }
	 else if(atcart.selectsizePlpxxl.isEnabled())  {
		 atcart.selectsizePlpxxl.click();
		    System.out.println("XXL size is selected");
		    }
	 else {
		 System.out.println("Product is Out of stock");
	 }
	  
	  
	  
	  Thread.sleep(1000);
	  
	 atcart.miniCartIcon.click();
	 
  
}
  
   //Add product to cart for particular size from PDP and Go to cart page through cart icon on header(For Logged in User)
  @Test(priority = 2)
  public void fbbAddtoCArtIcon() throws Exception {
	   
	  AddToCartObjects atcart = new AddToCartObjects(driver);
		
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();
	       
	  moveToElement(atcart.wmenCtegory);
	  
	  Thread.sleep(100);
	  
	  atcart.wmenLehnga.click();
	 
    //driver.navigate().refresh();
	 moveToElement(atcart.productImage);
	  
	  atcart.productImage.click();
	  
	  Thread.sleep(100);
	  
	  
	  if( atcart.selectsizePdpsmall.isEnabled()) {
		 
		  atcart.selectsizePdpsmall.click();
			 System.out.println("Small size is selected");
			  
		    }
	
	 else if(atcart.selectsizePdpmedium.isEnabled())  {
		 atcart.selectsizePdpmedium.click();
		    System.out.println("Medium size is selected");
		    
		    }
	 else if(atcart.selectsizePdplarge.isEnabled())  {
		 atcart.selectsizePdplarge.click();
		    System.out.println("Large size is selected");
		    }
	 else if(atcart.selectsizePdpxl.isEnabled())  {
		 atcart.selectsizePdpxl.click();
		    System.out.println("XL size is selected");
		    }
	 else if(atcart.selectsizePdpxxl.isEnabled())  {
		 atcart.selectsizePdpxxl.click();
		    System.out.println("XXL size is selected");
		    }
	 else {
		 System.out.println("Product is Out of stock");
	 }
	  
	  atcart.addtobagPdp.click();
	  
	  Thread.sleep(100);
	  
	  moveToElement(atcart.cartIcon);
	  
	  Thread.sleep(1000);
	  
	 atcart.cartIconviewbag.click();
	 
  
}
  
  //Add product to cart for particular size from PDP and Go to cart page through mini cart(For Logged in User)
  @Test(priority = 3)
  public void fbbAddtoCArtpdpMinicart() throws Exception {
	   
	  AddToCartObjects atcart = new AddToCartObjects(driver);
		
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();
	       
	  moveToElement(atcart.wmenCtegory);
	  
	  Thread.sleep(100);
	  
	  atcart.wmenLehnga.click();
	 
    //driver.navigate().refresh();
	 moveToElement(atcart.productImage);
	  
	  atcart.productImage.click();
	  
	  Thread.sleep(100);
	  
	  
	  if( atcart.selectsizePdpsmall.isEnabled()) {
		 
		  atcart.selectsizePdpsmall.click();
			 System.out.println("Small size is selected");
			  
		    }
	
	 else if(atcart.selectsizePdpmedium.isEnabled())  {
		 atcart.selectsizePdpmedium.click();
		    System.out.println("Medium size is selected");
		    
		    }
	 else if(atcart.selectsizePdplarge.isEnabled())  {
		 atcart.selectsizePdplarge.click();
		    System.out.println("Large size is selected");
		    }
	 else if(atcart.selectsizePdpxl.isEnabled())  {
		 atcart.selectsizePdpxl.click();
		    System.out.println("XL size is selected");
		    }
	 else if(atcart.selectsizePdpxxl.isEnabled())  {
		 atcart.selectsizePdpxxl.click();
		    System.out.println("XXL size is selected");
		    }
	 else {
		 System.out.println("Product is Out of stock");
	 }
	  
	  atcart.addtobagPdp.click();
	  
	  
	  
	  Thread.sleep(1000);
	  
	 atcart.miniCartIcon.click();
	 
  
}
  
  
  //Add product to cart without selecting size from PDP
  @Test(priority = 4)
  public void fbbAddtoCArtPdp() throws Exception {
	   
	  AddToCartObjects atcart = new AddToCartObjects(driver);
		
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();
	       
	  moveToElement(atcart.wmenCtegory);
	  
	  Thread.sleep(100);
	  
	  atcart.wmenLehnga.click();
	 
    //driver.navigate().refresh();
	 moveToElement(atcart.productImage);
	  
	  atcart.productImage.click();
	  
	  Thread.sleep(10000);
	  
	  atcart.addtobagPdp.click();
	  
	  getText(atcart.pdpErrormsg);
	  
	  if(textData.trim().equalsIgnoreCase("Please select a size")){
          System.out.println("Please select a size");

      }else{
              System.out.println("Error message not found");
      }
	  
}*/
  
  
  //Add product to cart from Quick View and Go to cart page through mini cart(For Logged in User)
  @Test(priority = 5)
  public void fbbAddtoCArtQuickview() throws Exception {
	  OrderObjects od = new OrderObjects(driver);
	  AddToCartObjects atcart = new AddToCartObjects(driver);
		
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();
	       
	  moveToElement(atcart.wmenCtegory);
	  
	  Thread.sleep(100);
	  
	  atcart.wmenLehnga.click();
	  Thread.sleep(1000);
	  
	  od.sortingDropdown.click();
	  od.sortNew.click();
	  
	  Thread.sleep(6000);
	 
    //driver.navigate().refresh();
	 moveToElement(atcart.productImage);
	  
	 atcart.Quickview.click();
	  
	  Thread.sleep(100);
	  
	  acceptAlertIfAvailable(1000);
	  if( atcart.Quickviewsmall.isEnabled()) {
		 
		  atcart.Quickviewsmall.click();
			 System.out.println("Small size is selected");
			  
		    }
	
	 else if(atcart.Quickviewmedium.isEnabled())  {
		 atcart.Quickviewmedium.click();
		    System.out.println("Medium size is selected");
		    
		    }
	 else if(atcart.Quickviewlarge.isEnabled())  {
		 atcart.Quickviewlarge.click();
		    System.out.println("Large size is selected");
		    }
	 else if(atcart.Quickviewxl.isEnabled())  {
		 atcart.Quickviewxl.click();
		    System.out.println("XL size is selected");
		    }
	 else if(atcart.Quickviewpxxl.isEnabled())  {
		 atcart.Quickviewpxxl.click();
		    System.out.println("XXL size is selected");
		    }
	 else {
		 System.out.println("Product is Out of stock");
	 }
	  
	  atcart.Quickviewaddtobag.click();
	  
	  Thread.sleep(100);
	  
	  atcart.Quickviewclose.click();
	  
	  Thread.sleep(1000);
	  
moveToElement(atcart.miniCartIcon);
	  
	  Thread.sleep(1000);
	  
	 atcart.minicartViewall.click();
	 
  
}
  
 /*//Add product to cart from Quick  and Go to cart page through cart icon on header(For Logged in User)
  @Test(priority = 6)
  public void fbbAddtoCArtQuickviewCarticon() throws Exception {
	   
	  AddToCartObjects atcart = new AddToCartObjects(driver);
		
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();
	       
	  moveToElement(atcart.wmenCtegory);
	  
	  Thread.sleep(100);
	  
	  atcart.wmenLehnga.click();
	 
    //driver.navigate().refresh();
	 moveToElement(atcart.productImage);
	  
	 atcart.Quickview.click();
	  
	  Thread.sleep(100);
	  
	  
	  acceptAlertIfAvailable(100);
	  if( atcart.Quickviewsmall.isEnabled()) {
		 
		  atcart.Quickviewsmall.click();
			 System.out.println("Small size is selected");
			  
		    }
	
	 else if(atcart.Quickviewmedium.isEnabled())  {
		 atcart.Quickviewmedium.click();
		    System.out.println("Medium size is selected");
		    
		    }
	 else if(atcart.Quickviewlarge.isEnabled())  {
		 atcart.Quickviewlarge.click();
		    System.out.println("Large size is selected");
		    }
	 else if(atcart.Quickviewxl.isEnabled())  {
		 atcart.Quickviewxl.click();
		    System.out.println("XL size is selected");
		    }
	 else if(atcart.Quickviewpxxl.isEnabled())  {
		 atcart.Quickviewpxxl.click();
		    System.out.println("XXL size is selected");
		    }
	 else {
		 System.out.println("Product is Out of stock");
	 }
	  
	  
 atcart.Quickviewaddtobag.click();
	  
	  Thread.sleep(100);
	  
	  atcart.Quickviewclose.click();
	  
	
	  
	  Thread.sleep(1000);
	  
	 atcart.miniCartIcon.click();
	 
  
}
  
  
  //Add product to cart without selecting size from Quickview
  @Test(priority = 7)
  public void fbbAddtoCArtQuickvierwitoutsize() throws Exception {
	   
	  AddToCartObjects atcart = new AddToCartObjects(driver);
		
	  fbbLogin flgin = new fbbLogin();
	  flgin.fbblogin();
	       
	  moveToElement(atcart.wmenCtegory);
	  
	  Thread.sleep(100);
	  
	  atcart.wmenLehnga.click();
	 
    //driver.navigate().refresh();
	 moveToElement(atcart.productImage);
	  
	 atcart.Quickview.click();
	  
	  Thread.sleep(1000);
	  
	  atcart.Quickviewaddtobag.click();
	  
	  getText(atcart.Quickviewerrormsg);
	  
	  if(textData.trim().equalsIgnoreCase("Please select a size")){
          System.out.println("Please select a size");

      }else{
              System.out.println("Error message not found");
      }
	  
}*/
  
  @AfterMethod
  public void url_close() {
		
		browserClose();
  }

}
