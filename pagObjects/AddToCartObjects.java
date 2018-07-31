package pagObjects;

import globals.Globals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddToCartObjects extends Globals {
	
	public AddToCartObjects (WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	
	//Define the page Objects
	
	@FindBy(xpath=".//*[@id='pincode_check']")
	public WebElement pncode;
	
	@FindBy(id="pincodeSubmit")
	public WebElement checkbtn;
	
	@FindBy(xpath=".//*[@id='main-menu']/ul/li[2]/div[1]/a/span")
	public WebElement wmenCtegory;
	
	@FindBy(xpath=".//*[@id='main-menu']/ul/li[2]/div[2]/div/div[2]/div/ul/li[1]/a")
	public WebElement wmenWesternwear;
	
	@FindBy(xpath=".//*[@id='main-menu']/ul/li[2]/div[2]/div/div[3]/div[1]/ul/li[7]/a")
	public WebElement wmenLehnga;
	
	@FindBy(xpath=".//*[@id='main-menu']/ul/li/div[2]/div/div[2]/div/ul/li[2]/a")
	public WebElement wmenTrousers;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[1]/div/div[3]/div[1]/div/span[3]")
	public WebElement wmenPlpAddtobag;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[1]/div/div[2]/div[4]/div/div/div/div[3]/div/span[5]")
	public WebElement selectsizePlpxxl;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[1]/div/div[2]/div[4]/div/div/div/div[3]/div/span[1]")
	public WebElement selectsizePlpsmall;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[1]/div/div[2]/div[4]/div/div/div/div[3]/div/span[2]")
	public WebElement selectsizePlpmedium;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[1]/div/div[2]/div[4]/div/div/div/div[3]/div/span[3]")
	public WebElement selectsizePlplarge;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[1]/div/div[2]/div[4]/div/div/div/div[3]/div/span[4]")
	public WebElement selectsizePlpxl;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[2]/a/span[1]")
	public WebElement miniCartIcon;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[2]/div/div[7]/a")
	public WebElement minicartViewall;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[3]/div/div[5]/a")
	public WebElement minicartViewallquickview;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[2]/a/span[1]")
	public WebElement cartIcon;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[2]/div/div[7]/a")
	public WebElement cartIconviewbag;
	
	@FindBy(xpath=".//*[@class='btn-view-cart']")
	public WebElement cartIconviewbagquickview;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[1]/div/div[2]/a")
	public WebElement productImage;
	
	@FindBy(xpath=".//*[@id='productsCatalog product-grid']/li[1]/div/div[2]/a")
	public WebElement productImagepdp;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[3]/div[1]/button")
	public WebElement addtobagPdp;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]/span[5]")
	public WebElement selectsizePdpxxl;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]/span[1]")
	public WebElement selectsizePdpsmall;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]/span[2]")
	public WebElement selectsizePdpmedium;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]/span[3]")
	public WebElement selectsizePdplarge;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]/span[4]")
	public WebElement selectsizePdpxl;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]")
	public WebElement pdpErrormsg;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[1]/div/div[3]/div[1]/div/span[1]")
	public WebElement Quickview;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[3]/div[1]/span[1]")
	public WebElement Quickviewpxxl;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[2]/div[1]/span[2]")
	public WebElement Quickviewsmall;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[3]/div[1]/span[3]")
	public WebElement Quickviewmedium;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[3]/div[1]/span[4]")
	public WebElement Quickviewlarge;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[3]/div[1]/span[5]")
	public WebElement Quickviewxl;
	
	@FindBy(xpath=".//*[@class='add-to-button']/button")
	public WebElement Quickviewaddtobag;
	
	@FindBy(xpath=".//*[@id='dialogClose']/i")
	public WebElement Quickviewclose;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[3]/div[1]")
	public WebElement Quickviewerrormsg;
	
	// Size Handling
	
	public void PLPsizeSelect(){
		  
		  
		  if( selectsizePlpsmall.isEnabled()) {
		    
		     selectsizePlpsmall.click();
		     System.out.println("Small size is selected");
		      
		       }
		  
		   else if(selectsizePlpmedium.isEnabled())  {
		    selectsizePlpmedium.click();
		       System.out.println("Medium size is selected");
		       
		       }
		   else if(selectsizePlplarge.isEnabled())  {
		    selectsizePlplarge.click();
		       System.out.println("Large size is selected");
		       }
		   else if(selectsizePlpxl.isEnabled())  {
		    selectsizePlpxl.click();
		       System.out.println("XL size is selected");
		       }
		   else if(selectsizePlpxxl.isEnabled())  {
		    selectsizePlpxxl.click();
		       System.out.println("XXL size is selected");
		       }
		   else {
		    System.out.println("Product is Out of stock");
		   }
		    
		 }
		 
		 public void PDPsizeSelect(){
		  
		  if( selectsizePdpsmall.isEnabled()) {
		    
		     selectsizePdpsmall.click();
		     System.out.println("Small size is selected");
		      
		       }
		  
		   else if(selectsizePdpmedium.isEnabled())  {
		    selectsizePdpmedium.click();
		       System.out.println("Medium size is selected");
		       
		       }
		   else if(selectsizePdplarge.isEnabled())  {
		    selectsizePdplarge.click();
		       System.out.println("Large size is selected");
		       }
		   else if(selectsizePdpxl.isEnabled())  {
		    selectsizePdpxl.click();
		       System.out.println("XL size is selected");
		       }
		   else if(selectsizePdpxxl.isEnabled())  {
		    selectsizePdpxxl.click();
		       System.out.println("XXL size is selected");
		       }
		   else {
		    System.out.println("Product is Out of stock");
		   }
		  
		 }
		 
		 public void QuickviewsizeSelect(){
		  
		  if( Quickviewsmall.isEnabled()) {
		    
		     Quickviewsmall.click();
		     System.out.println("Small size is selected");
		      
		       }
		  
		   else if(Quickviewmedium.isEnabled())  {
		    Quickviewmedium.click();
		       System.out.println("Medium size is selected");
		       
		       }
		   else if(Quickviewlarge.isEnabled())  {
		    Quickviewlarge.click();
		       System.out.println("Large size is selected");
		       }
		   else if(Quickviewxl.isEnabled())  {
		   Quickviewxl.click();
		       System.out.println("XL size is selected");
		       }
		   else if(Quickviewpxxl.isEnabled())  {
		   Quickviewpxxl.click();
		       System.out.println("XXL size is selected");
		       }
		   else {
		    System.out.println("Product is Out of stock");
		   }
		  
		  
		 }
}