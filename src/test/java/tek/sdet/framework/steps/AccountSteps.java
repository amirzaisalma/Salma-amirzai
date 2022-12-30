package tek.sdet.framework.steps;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import io.cucumber.datatable.DataTable;
public class AccountSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void clickonaccountoption() {
		click(factory.homePage().Account);
		Logger.info("user clicked on account option");
		
	}
		
		@And("User update Name {string} and Phone {string}")
		public void userupdatenameandphone(String name, String phone) {
			
			clearTextUsingSendKeys(factory.accountPage().NameInput);
			clearTextUsingSendKeys(factory.accountPage().PhoneInput);
			
			sendText(factory.accountPage().NameInput,name);
			sendText(factory.accountPage().PhoneInput,phone);
			Logger.info("user updated name and phnone succesfully");
			slowDown();
		}
		
		@And("User click on Update button")
		public void clickonupdatebutton() {
			
			click(factory.accountPage().UpdateBtn);
			Logger.info("update button was clicked");
			slowDown();
			
		}
	
     @Then("user profile information should be updated")
		
	public void profileisupdated() {
    
    	 Assert.assertTrue(isElementDisplayed(factory.homePage().Account));
    	 Logger.info("account was updated succesfuly");
    	 slowDown();
    	 
     }
     @And("User enter below information")
     public void updatepasswithbelowdata(DataTable data) {
    	 
    	List<Map<String,String>> changePassword = data.asMaps(String.class,String.class);
    	 sendText(factory.accountPage().previosPass,changePassword.get(0).get("previousPassword"));
    	 sendText(factory.accountPage().newPass,changePassword.get(0).get("newPassword"));
    	 sendText(factory.accountPage().confirmPass,changePassword.get(0).get("confirmPassword"));
    	 Logger.info("password was changed succesfuly");
    	 slowDown();
    	 
     }
      @And("User click on Change Password button")
       public void clickonpasswordchangebtn() {
	click(factory.accountPage().changePass);
	Logger.info("password updated succesfully");
	slowDown();
}
     @Then("a message should be displayed Password Updated Successfully")	
	public void passwordupdatedsuccessfuly() {
    	 
    	 Assert.assertTrue(isElementDisplayed(factory.homePage().Account));
    	 Logger.info("password was updated succesfuly");
    	 slowDown(); 
     }
     @When("User click on Add a payment method link")
     public void userClickOnAddAPaymentMethodLink() {
    	 click(factory.accountPage().addpaymentmethodlink);
    	 Logger.info("user clicked on payment method link");
             }
 @When("User fill Debit or credit card information")
     public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
	 List<Map<String,String>> fillcardinfo= dataTable.asMaps(String.class,String.class);
	 sendText(factory.accountPage().cardnumberfield,fillcardinfo.get(0).get("cardNumber"));
	 sendText(factory.accountPage().nameoncardfield,fillcardinfo.get(0).get("nameOnCard"));
	 sendText(factory.accountPage().expirationmonthfield,fillcardinfo.get(0).get("expirationMonth"));
	 sendText(factory.accountPage().expirationyearfield,fillcardinfo.get(0).get("expirationYear"));
	 sendText(factory.accountPage().securitycodefield,fillcardinfo.get(0).get("securityCode"));
        Logger.info("card was added succesfully") ;
    	 slowDown();
     }
     @When("User click on Add your card button")
     public void userClickOnAddYourCardButton() {
    	 click(factory.accountPage().addpaymentbtn);
    	 Logger.info("user clicked on add payment button");

     }
    @Then("a message should be displayed {string}")
     public void aMessageShouldBeDisplayed(String string) {
    	 waitTillPresence(factory.accountPage().paymentaddedsuccesfully);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentaddedsuccesfully));
    	String actualMessage= factory.accountPage().paymentaddedsuccesfully.getText();
    	String expectedmessage ="Payment Method added sucessfully";
    	Assert.assertEquals(expectedmessage,actualMessage);
   	 Logger.info("Payment Method added successfully");
   	 slowDown();
    	 
              }
    @When("User click on Edit option of card section")
    public void userClickOnEditOptionOfCardSection() {
    	click(factory.accountPage().editbtn);
    	Logger.info("user clicked on edit button");
    	
          }
    @When("user edit information with below data")
    public void userEditInformationWithBelowData(DataTable dataTable) {
   	 List<Map<String,String>> fillcardinfo= dataTable.asMaps(String.class,String.class);
   	clearTextUsingSendKeys(factory.accountPage().cardnumberfield);
   	 sendText(factory.accountPage().cardnumberfield,fillcardinfo.get(0).get("cardNumber"));
   	clearTextUsingSendKeys(factory.accountPage().nameoncardfield);
   	 sendText(factory.accountPage().nameoncardfield,fillcardinfo.get(0).get("nameOnCard"));
   	clearTextUsingSendKeys(factory.accountPage().expirationmonthfield);
   	 sendText(factory.accountPage().expirationmonthfield,fillcardinfo.get(0).get("expirationMonth"));
   	clearTextUsingSendKeys(factory.accountPage().expirationyearfield);
   	 sendText(factory.accountPage().expirationyearfield,fillcardinfo.get(0).get("expirationYear"));
   	clearTextUsingSendKeys(factory.accountPage().securitycodefield);
   	 sendText(factory.accountPage().securitycodefield,fillcardinfo.get(0).get("securityCode"));
           Logger.info("card was updated succesfully") ;
       	 slowDown();
   	
    }
    @When("user click on Update Your Card button")
    public void userClickOnUpdateYourCardButton() {
    	
    	click(factory.accountPage().updatepaymentbtn);
    	Logger.info("payment update button clicked");
    	
            }
    

    @Then("an message should be displayed {string}")
    public void MessageShouldBeDisplayed(String string) {
   	 waitTillPresence(factory.accountPage().paymentmethodupdatedsuccesfully);
   	Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentmethodupdatedsuccesfully));
   	String actualMessage= factory.accountPage().paymentmethodupdatedsuccesfully.getText();
   	String expectedmessage ="Payment Method updated Successfully";
   	Assert.assertEquals(expectedmessage,actualMessage);
  	 Logger.info("Payment Method was updated successfully");
  	 slowDown();
   	 
             }
   	 
           @And("User select on card")  
           public void clickoncard() {
        	   
        	  click(factory.accountPage().cardoption);
        	  Logger.info("user choose the card");
        	   
           }


       @And("User click on remove option of card section")
         public void removecard() {
	click(factory.accountPage().removebtn);
	Logger.info("user clicked on remove button");
	
	
}
       @Then("payment details should be removed")
   public void carddetailremoved() {
    	  Assert.assertTrue(isElementDisplayed(factory.accountPage().cardoption)); 
    	   Logger.info("card details are removed");
    	   
       }
	
	
	@And("User click on Add address option")
	
	public void addaddressoption() {
		
		click(factory.accountPage().addaddressoption);
		Logger.info("user clicked on add address option");
		
	}
	@And("user fill new address form with below information")
	public void addressdatatable(DataTable dataTable) {
		List<Map<String,String>> addaddressdatatable = dataTable.asMaps(String.class,String.class);
		
		sendText(factory.accountPage().countryinput,addaddressdatatable.get(0).get("country"));
	
		sendText(factory.accountPage().fullnameinput,addaddressdatatable.get(0).get("fullName"));
		
		sendText(factory.accountPage().phonenumberinput,addaddressdatatable.get(0).get("phoneNumber"));
		
		sendText(factory.accountPage().streetaddressinput,addaddressdatatable.get(0).get("streetAddress"));

		sendText(factory.accountPage().apartmentnumberinput,addaddressdatatable.get(0).get("apt"));
		
		sendText(factory.accountPage().cityinput,addaddressdatatable.get(0).get("city"));
		
		selectByVisibleText(factory.accountPage().stateinput,addaddressdatatable.get(0).get("state"));
	
		sendText(factory.accountPage().zipcodeinput,addaddressdatatable.get(0).get("zipCode"));
		Logger.info("user put the address information");
		
		
		
	}
	
	@And("User click Add Your Address button")
	public void addaddressbtn() {
		click(factory.accountPage().addyouraddressbtn);
		
		Logger.info("user clicked on add your address button");
		
	}
	
	@Then("a message should bee displayed {string}")
	public void displayedmessage(String String) {
		
		waitTillPresence(factory.accountPage().addressaddedsuccesfullymessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressaddedsuccesfullymessage));
		String actualmessage = factory.accountPage().addressaddedsuccesfullymessage.getText();
		String expectedmessage = "Address Added Successfully";
		Assert.assertEquals(actualmessage, expectedmessage);
		Logger.info("address was added succesfully");
		slowDown();
		
	}
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	    
	click(factory.accountPage().editaddress);
	Logger.info("user clicked on edit address button");
	
	}
	@When("usser fill new address form with below information")
	public void usserFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	    
List<Map<String,String>> editaddress = dataTable.asMaps(String.class,String.class);
clearTextUsingSendKeys(factory.accountPage().countryinput);
		sendText(factory.accountPage().countryinput,editaddress.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullnameinput);
		sendText(factory.accountPage().fullnameinput,editaddress.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phonenumberinput);
		sendText(factory.accountPage().phonenumberinput,editaddress.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetaddressinput);
		sendText(factory.accountPage().streetaddressinput,editaddress.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().apartmentnumberinput);
		sendText(factory.accountPage().apartmentnumberinput,editaddress.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityinput);
		sendText(factory.accountPage().cityinput,editaddress.get(0).get("city"));
		clearTextUsingSendKeys(factory.accountPage().stateinput);
		sendText(factory.accountPage().stateinput,editaddress.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipcodeinput);
		sendText(factory.accountPage().zipcodeinput,editaddress.get(0).get("zipCode"));
		Logger.info("user put the address information");
		
	
	
	
	
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	   click(factory.accountPage().updateaddressbtn);
	   Logger.info("user clicked the update address button");
	
	}
	@Then("a message shoulld be displayed {string}")
	public void aMessageShoulldBeDisplayed(String string) {
	   
	
		waitTillPresence(factory.accountPage().addressupdatedsuccesfully);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressupdatedsuccesfully));
		String actualmessage = factory.accountPage().addressupdatedsuccesfully.getText();
		String expectedmessage = "Address Updated Successfully";
		Assert.assertEquals(actualmessage, expectedmessage);
		Logger.info("address was updated succesfully succesfully");
		slowDown();
	
	
	
	
	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	   
	click(factory.accountPage().removeaddressbtn);
	Logger.info("user cliked on remove address option");
	
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	   Assert.assertTrue(isElementDisplayed(factory.accountPage().displyedaddress));
	Logger.info("displayed address is removed");
	
	
	}




	
	
	
	
	
	
}
