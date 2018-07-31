package pagObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import globals.Globals;

public class QuickViewObjects extends Globals {

	public QuickViewObjects (WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}					
	//Define the page Objects
	
	@FindBy(xpath=".//*[@id='main-menu']/ul/li[2]/div[1]/a/span")
	public WebElement clickWomens;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[2]/div/div[3]/div[1]/div/span[1]")
	public WebElement QuickviewLink;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[2]/div/div[2]/a")
	public WebElement PLPimage;
	
	@FindBy(xpath="//span[@class='size-guide']")
	public WebElement QuickViewpopup_verification;
	
	@FindBy(xpath="//div[@class='size-left']/span[@data-js-variant='DJ006WJ27ACUINFUR-259' and  @class='sizebox2 sizeboxtext']")
	public WebElement QuickViewproduct_size;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']")
	public WebElement QuickViewPopup;
	
	@FindBy(xpath=".//*[@id='dialogClose']/i")
	public WebElement QuickViewPopupClose;
	
	@FindBy(xpath="//div[@class='add-to-button']/button")
	public WebElement AddtoBagButton;
	
	@FindBy(xpath="//div[@class='size']/div[@class='message1']")
	public WebElement AddtoBagErrorMsg;
	
	@FindBy(xpath=".//*[@id='cartItemCount']/a/span")
	public WebElement BagItemCount;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[2]/a/span[1]")
	public WebElement BagIcon;
	
	@FindBy(xpath="//*[contains(text(),'Save For Later')]")
	public WebElement SaveforLater_Link;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[3]/a/span[1]")
	public WebElement SaveforLater_Icon;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[3]/div/a[3]/span")
	public WebElement saveforlater_login;
	
	@FindBy(xpath="//*[contains(text(),'See Full Product Detail')]")
	public WebElement seeproductDetails;
	
	
}
