package pagObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import globals.Globals;

public class OrderObjects extends Globals {
	
	public OrderObjects (WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}					
	//Define the page Objects

	@FindBy(xpath=".//*[@id='productsCatalog']/li[2]/div/div[3]/div[1]/div/span[3]")
	public WebElement AddtoBag_PLP;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[3]/div[1]/button")
	public WebElement AddtoBag_PDP;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[2]/div/div[2]/div[4]/div/div/div/div[3]/div/span[2]")
	public WebElement AddtoBagSize_PLP;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]/span[2]")
	public WebElement AddtoBagSize_PDP;
	
	//@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[2]/div/div[7]/a")
	
	@FindBy(xpath="//div[@class='mini-cart-content']/div[@class='buttonalignmnet']")
	public WebElement ViewBagButton;
	
	@FindBy(xpath=".//*[@id='checkoutfixedbutton']/a/span")
	public WebElement ProceedtoCheckout_Button;
	
	@FindBy(id="checkoutBtn")
	public WebElement ProceedtoRevieworder_Button;
	
	@FindBy(xpath=".//*[@id='checkoutBtn']")
	public WebElement ProceedtoPayment_Button;
	
	@FindBy(xpath=".//*[@id='payment-form']/div[1]/div/ul/li[1]/a")
	public WebElement CreditCard_Tab;
	
	@FindBy(xpath="//div[@class='tab-pane js_payment_tab_CreditCard active']/div[@class='radio_card']/label[@class='differentcard']")
	public WebElement UsedifferentCard_link;
	
	@FindBy(xpath=".//*[@id='cc_number']")
	public WebElement CardNumber;
	
	@FindBy(xpath=".//*[@id='cc_holder']")
	public WebElement CardName;
	
	@FindBy(xpath=".//*[@id='cc_exp_year']")
	public WebElement CardExpiryYear;
	
	@FindBy(xpath=".//*[@id='cc_exp_month_chosen']/a")
	public WebElement CardExpiryMonth;
	
	@FindBy(xpath=".//*[@id='cc_exp_month_chosen']/div/ul/li[6]")
	public WebElement ExpiryMonth;
	
	@FindBy(xpath=".//*[@id='cc_security_code']")
	public WebElement CardCVVNumber;

	@FindBy(xpath=".//*[@id='checkoutBtn']")
	public WebElement CompletePaymentButton;
	
	@FindBy(xpath=".//*[@id='content']/div[2]/div[2]/div[1]/div[2]/p/span[1]")
	public WebElement OrderNo;
	
	//Sorting Objects
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div/div[2]/div/div[4]/div[2]/div/a/span")
	public WebElement sortingDropdown;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div/div[2]/div/div[4]/div[2]/div/div/ul/li[2]")
	public WebElement sortNew;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div/div[2]/div/div[4]/div[2]/div/div")
	public WebElement sortDropdownHover;
	
}
