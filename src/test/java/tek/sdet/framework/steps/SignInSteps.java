package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	
	
	   POMFactory factory = new POMFactory();

	   
	   @When("User click on Sign in option")
	   public void userclickonsigninoption() {
		  click(factory.homePage().signIn);
		  Logger.info("user clicked on Sign in option");
		   
		   
		   
	   }
	   
	   @And("User enter email {string} and password {string}")
	   public void userenteremailandpassword(String email, String password) {
		   sendText(factory.signInPage().emailfield,email);
		   sendText(factory.signInPage().passwordfield,password);
		   Logger.info("user entered email "+ email+"and password "+password);
		   //slowDown();
}
	   
	@And("User click on login button")   
	   public void userclickonloginbutton() {
		click(factory.signInPage().loginbutton);
		Logger.info("user clicked on login button");
		
	}
	
	@And("User click on create new account button")
	public void userclickoncreatenewaccountbtn() {
		click(factory.signInPage().newAcountButton);
		Logger.info("user clicked on create new acount button");
	}
	/*@And("user fill the signup information with below data")
	public void usersignupinformationwithbelowdata(DataTable data) {
		List<Map<String,String>>signUpData= data.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameInput,signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailInput,signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordInput,signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmoasswordinput,signUpData.get(0).get("confirmpassword"));
		Logger.info("user entered required information into sign up form");
		*/
		//List<List<String>>signup = data.asLists(String.class);
		//System.out.println(signup.get(1).get(0)+" this is value From list ...");
		//slowDown();
	

	@And("user click on signup button")
	public void userclickonsignupbutton() {
		click(factory.signInPage().signupbtn);
		Logger.info("user clicked on sign up button");
		slowDown();
	}
	@Then("user should be logged into account page")
	public void usershouldbeloggedintoaccountpage() {
		//Assert.assertTrue(isElementDisplayed(factory.signInPage().profileImage));
		Assert.assertTrue(isElementDisplayed(factory.homePage().Account));
		Logger.info("account was created");
		
	}
	@Then("User should be logged in into Account")
	public void accountispresent(){
		
		Assert.assertTrue(isElementDisplayed(factory.homePage().Account));
		Logger.info("account is present");
		
	}
	

	@And("User fill the signUp information with below data")
	public void userEnteredTheGivenData (DataTable data) {
		List<Map<String, String>> signUpData=data.asMaps(String.class,String.class);
		sendText(factory.signInPage().nameInput,signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailInput,signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordInput,signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmoasswordinput,signUpData.get(0).get("confirmPassword"));
		Logger.info("user could enter the data successfully");
		slowDown();
		
	}


	
	
	
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	   
	   
	   
	   
	   
