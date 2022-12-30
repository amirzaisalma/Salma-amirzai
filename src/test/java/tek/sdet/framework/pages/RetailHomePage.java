package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
   
	



	public RetailHomePage() {
		
		PageFactory.initElements(getDriver(),this);
	}
	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement logo;
	
	@FindBy(id= "search")
	public WebElement allDepartments;
	
	@FindBy (id = "searchInput")
	public WebElement searchInputfield;
	
	@FindBy(id = "searchBtn")
	public WebElement searchbutton;
	@FindBy(xpath = "//img[@alt='PlayStation 5 Console']")
	public WebElement playStationItem;
	
	@FindBy(xpath = "//span[text()='All']")
	public WebElement allElement;

	
	@FindBy (id = "contentHeader")
	public WebElement shopByDepartment;
	
	@FindBy (id = "cartBtn")
	public WebElement cart;
	
	@FindBy(id="signinLink")
	public WebElement signIn;
	
	
	@FindBy(id="accountLink")
	public WebElement Account;
	
	
	@FindBy(xpath="//span[text()='Electronics']")
	public WebElement electronics ;
	
	
	
	@FindBy(xpath="//span[text()='Computers']")
	public WebElement computers ;
	
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smarthomes ;
	
	
	
	@FindBy(xpath="//span[text()='Sports']")
	public WebElement sports ;
	
	
	
	@FindBy(xpath="//span[text()='Automative']")
	public WebElement automotive;
	
	@FindBy(xpath="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sidebar;
	
	@FindBy(xpath="//p[text()='Apex Legends - 1,000 Apex Coins']")
	public WebElement productname;
	//if we get any issue running a scenario with product name kaza place the locator for that product here
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement quantity;
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	public WebElement addtothecart;
	
	@FindBy(id="cartQuantity")
	public WebElement cartquantity;
	
	@FindBy(id="proceedBtn")
	public WebElement proocedtocheckout;
	
	@FindBy(id="addAddressBtn")
	public WebElement addaddressatcheckout;
	
	@FindBy(id="addPaymentBtn")
	
	public WebElement addpaymentatcheckout;
	
	@FindBy(id="placeOrderBtn")
	public WebElement  placeorderbtn ;
	
	@FindBy(xpath="//div[text()='Order Placed Successfully']")
	public WebElement orderplacedsuccesfullymessage;
	
	@FindBy(id="orderLink")
	
	public WebElement orders;
	
	
	@FindBy(id="cancelBtn")
	public WebElement cancelorderoption;
	
	
	
	@FindBy(xpath="//select[@class='order__cancel-input']")
	public WebElement cancelationreason;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement submitcancelorder ;
	
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement  ordercancelconfirmationmessage;
	
	@FindBy(xpath="//p[text()='Show Details']")
	
	public WebElement showdetailsinorderlist;
	
	
	@FindBy(id="returnBtn")
	public WebElement returnbutton;
	
	@FindBy(id="reasonInput")
	public WebElement returnreason;
	
	@FindBy(id="dropOffInput")
	public WebElement dropoff;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement submitreturnorder;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement returnmessage;
	
	
@FindBy(id="reviewBtn")	
public WebElement reviewbutton;

@FindBy(id="headlineInput")
public WebElement headlineinput;

	
@FindBy(id="descriptionInput")
public WebElement reviewdescription;

@FindBy(id="reviewSubmitBtn")
public WebElement addyourreviewbutton;

@FindBy(xpath="//div[text()='Your review was added successfully']")
public WebElement reviewmessage;




	
	
	
	
	
	
	
}

