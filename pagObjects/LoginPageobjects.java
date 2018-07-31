package pagObjects;

import globals.Globals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageobjects extends Globals {
							
	public LoginPageobjects (WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}					
	//Define the page Objects
	
	@FindBy(xpath=".//*[@id='pincode_check']")
	public WebElement pncode;
	
	@FindBy(id="pincodeSubmit")
	public WebElement checkbtn;
	
	@FindBy(xpath =".//*[@id='page']/header/div/div/div/div[3]/div[5]/a/span")
	public WebElement loginIcon;
	
	@FindBy(xpath =".//*[@id='mini-cart-header']/a[3]/span")
	public WebElement loginButton;
	
	@FindBy(xpath =".//*[@id='loginInput']")
	public WebElement enterId;
	
	@FindBy(xpath =".//*[@id='signPassword']")
	public WebElement enterPassword;
	
	@FindBy(xpath =".//*[@id='stepOneSubmit']")
	public WebElement signinButton;
	
	//Created by Smriti
	
	@FindBy(xpath =".//*[@id='page']/header/div/div/div/div[3]/div[5]/div/ul/li[7]/a")
	public WebElement signoutButton;
	
	@FindBy(xpath =".//*[@id='form-account-create-t']/fieldset/div[5]/p")
	public WebElement errormsg;
	
	@FindBy(xpath ="//div[@class='fb col-xs-12 col-sm-6']")
	public WebElement signinFb;
	
	@FindBy(xpath ="//div[@class='gp col-xs-12 col-sm-6']")
	public WebElement signinGoogle;
	
	@FindBy(xpath =".//*[@id='Email']")
	public WebElement googleUsername;
	
	@FindBy(xpath =".//*[@id='next']")
	public WebElement googleNext;
	
	@FindBy(xpath =".//*[@id='Passwd']")
	public WebElement googlePwd;
	
	@FindBy(xpath =".//*[@id='signIn']")
	public WebElement googleSignin;
	
	@FindBy(xpath =".//*[@id='email']")
	public WebElement fbUserid;
	
	@FindBy(xpath =".//*[@id='pass']")
	public WebElement fbPwd;
	
	@FindBy(xpath =".//*[@id='loginbutton']")
	public WebElement fblogin;
	
	@FindBy(xpath ="html/body/div[5]/div[2]/div/div/form/div/div[1]/div[2]/div[1]/div[1]/button")
	public WebElement fbContinue;
	
	@FindBy(xpath =".//*[@id='submit_approve_access']")
	public WebElement googleAllow;
	
	@FindBy(xpath ="//a[@class='keepLogout']")
	public WebElement signMeOutbutton;
	
}