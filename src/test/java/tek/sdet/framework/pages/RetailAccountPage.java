package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{

	
public RetailAccountPage() {
		
		PageFactory.initElements(getDriver(),this);
	}
	
	@FindBy(id = "nameInput")
	public WebElement NameInput;
	
	@FindBy(xpath="//h1[@class='account__information-username']")
	public WebElement userName;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement PhoneInput;
	
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement UpdateBtn;

	@FindBy(id="credentialsSubmitBtn")
	public WebElement changePass;
	
	
	@FindBy(xpath="//input[@id='newPasswordInput']")
	public WebElement newPass;

	@FindBy(id = "previousPasswordInput")
	public WebElement previosPass;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPass;
	
	@FindBy(xpath="//p[@class='text-sm text-blue-700 hover:underline hover:text-red-700']")
	public WebElement addpaymentmethodlink;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardnumberfield;
	
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameoncardfield;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expirationmonthfield;
	
	@FindBy(id="expirationYearInput")
	public WebElement expirationyearfield;
	
	@FindBy(id="securityCodeInput")
	public WebElement securitycodefield;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement addpaymentbtn;
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement paymentaddedsuccesfully;
	
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement editbtn;
	
	@FindBy(id ="paymentSubmitBtn")
	public WebElement updatepaymentbtn;
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement paymentmethodupdatedsuccesfully;
	
	@FindBy(xpath="//p[@class='account__payment__sub-text']")
	public WebElement cardoption;
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement removebtn;
	
	@FindBy(xpath="//p[text()='Add Address']")
	public WebElement addaddressoption;
	
	@FindBy(id="countryDropdown")
	public WebElement countryinput;
	
	
	@FindBy(id="fullNameInput")
	public WebElement fullnameinput;
	
	
	
	@FindBy(id="phoneNumberInput")
	public WebElement phonenumberinput ;

	
	
	
	@FindBy(id ="streetInput")
	public WebElement streetaddressinput ;

	
	@FindBy(id="apartmentInput")
	public WebElement apartmentnumberinput;

	@FindBy(id="cityInput")
	public WebElement cityinput;
	
	
	@FindBy(name="state")
	public WebElement stateinput;
	
	
	
	@FindBy(id="zipCodeInput")
	public  WebElement zipcodeinput;
	
	
	@FindBy(id="addressBtn")
	public WebElement addyouraddressbtn;
	
	@FindBy(xpath="//div[text()='Address Added Successfully']")
	public WebElement addressaddedsuccesfullymessage;
	
	
@FindBy(xpath="//button[text()='Edit']")
	public WebElement editaddress;
	
	
	
@FindBy(id="addressBtn")
public WebElement updateaddressbtn;
	
	
	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement addressupdatedsuccesfully;
	
	
	@FindBy(xpath="//button[text()='Remove']")
	
	public WebElement removeaddressbtn;
	
	@FindBy(xpath="//div[@class='account__address-single']")
	public WebElement displyedaddress;
	
	
	

	
	
}
