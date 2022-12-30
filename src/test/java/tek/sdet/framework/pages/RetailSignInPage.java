package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
		
		@FindBy(id="email")
		public WebElement emailfield;
		
		@FindBy(id="password")
		public WebElement passwordfield;
		
		@FindBy(xpath= "//button[@type='submit']")
		public WebElement loginbutton;
		
		@FindBy(id="newAccountBtn")
		public WebElement newAcountButton;
		
		@FindBy(id ="nameInput")
		public WebElement nameInput;
		
		@FindBy(id="emailInput")
		public WebElement emailInput;
		
		@FindBy(id="passwordInput")
		public WebElement passwordInput;
		
		@FindBy(id="confirmPasswordInput")
		public WebElement confirmoasswordinput;
		
		@FindBy(id="signupBtn")
		public WebElement signupbtn;
		
		@FindBy(id="profileImage")
		public WebElement profileImage;
	}
	



