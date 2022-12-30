package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{
	//all step definition classes will extends CommonUtility class
	// we need to create an object of POMFactory class 
	//POMFactory instance should be on top of the class
	
	POMFactory factory = new POMFactory();
	
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle ="React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
		Logger.info(expectedTitle+" is equal to "+actualTitle);
	}
	
	@Then("User verifies Cart icon is present")
	public void userverifiescarticonispresent() {
		//slowDown();
		HighlightElement(factory.homePage().cart);
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePage().cart));
		Logger.info("cart icon is present");


	}

	@When("User click on All section")
	public void userclickonallsection() {
		click(factory.homePage().allElement);
		Logger.info("user click on All element");
			}
	
	@Then("User verifies {string} is present")
	public void userverifiesstringispresent(String value) {
		String expectedValue = value;
		String actualValue = getElementText(factory.homePage().shopByDepartment);
	Assert.assertEquals(expectedValue,actualValue);
	Logger.info(expectedValue+"  is present");
	
		
		
	}
	
	
	
	@Then("User verify retail page logo is present")
	public void userVerifyRetailLogoIsPresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().logo));
		Logger.info("logo is present");
		
			}
	@When("User change the catagory to {string}")
	public void userChangeTheCatagoryTo(String value) {
		selectByVisibleText(factory.homePage().allDepartments,value);
		
		Logger.info(value+" was selected from drop down");
		
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String value) {
	   
		sendText(factory.homePage().searchInputfield,value);
		Logger.info("user entered "+ value);
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchbutton);
		Logger.info("user click on search button");
		
	   
	}
	@When("Item should be present")
	public void itemShouldBePresent() {
	Assert.assertTrue(isElementDisplayed(factory.homePage().playStationItem));
	Logger.info("item is present");
		
	    	}

@Then("below options are present in Shop by Department sidebar")
public void belowoptionarepresent(DataTable Data) {
	
	List<List<String>> elementsdisplayed = Data.asLists(String.class);
	Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
	Assert.assertTrue(isElementDisplayed(factory.homePage().computers));
	Assert.assertTrue(isElementDisplayed(factory.homePage().sports));
	Assert.assertTrue(isElementDisplayed(factory.homePage().automotive));
	Assert.assertTrue(isElementDisplayed(factory.homePage().smarthomes));
	 Logger.info("all five elements are present");
	 slowDown();
	
}
	
	


@When("User on {string}")
public void userOnDepartment(String department) {
    List<WebElement> dept= factory.homePage().sidebar;

    for(WebElement element: dept) {
    	if(element.getText().equals(department)) {
    		element.click();
    		break;
    	 }
    		
       }
    }
    

@Then("below options are present in department")
public void belowOptionsArePresentInDepartment(DataTable dataTable) {
    List<List<String>> departmentoption = dataTable.asLists(String.class);
List<WebElement> dept = factory.homePage().sidebar;
for(int i=0; i<departmentoption.get(0).size();i++) {

for(WebElement element: dept) {
	
	if(element.getText().equals(departmentoption.get(0).get(i))) {}
	Assert.assertTrue(element.isDisplayed());
	}
  }

}


@When("User click on item")
public void userClickOnItem() {
    waitTillPresence(factory.homePage().productname);
    click(factory.homePage().productname);
    Logger.info("product was clicked was cliked");

}
@When("User select quantity {string}")
public void userSelectQuantity(String qty) {
	selectByVisibleText(factory.homePage().quantity,qty);
	Logger.info("user selected quantity "+qty);
    
}
@When("User click add to Cart button")
public void userClickAddToCartButton() {
	
	click(factory.homePage().addtothecart);
	Logger.info("user clicked on add to cart button");
   
}
@Then("the cart icon quantity should change to {string}")
public void theCartIconQuantityShouldChangeTo(String expectedqty) {
	
   Assert.assertEquals(expectedqty, factory.homePage().cartquantity.getText()); 
Logger.info("the cart icon qty changed to "+expectedqty);
}


@Then("User click on Cart option")
public void userClickOnCartOption() {
   click(factory.homePage().cart);
   Logger.info("user clicked on cart");

}
@Then("User click on Proceed to Checkout button")
public void userClickOnProceedToCheckoutButton() {
     click(factory.homePage().proocedtocheckout);
     Logger.info("user clicked on orooced to checkout");

}
@Then("User click Add a new address link for shipping address")
public void userClickAddANewAddressLinkForShippingAddress() {
    click(factory.homePage().addaddressatcheckout);
    Logger.info("user clicked on the add address at checkout option");

}
@Then("User click Add a credit card or Debit Card for Payment method")
public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
   click(factory.homePage().addpaymentatcheckout);
	Logger.info("user clicked on add payment ata checkout option");
	
}
@Then("User click on Place Your Order")
public void userClickOnPlaceYourOrder() {
    click(factory.homePage().placeorderbtn);
    Logger.info("user clicked on place order");
	
	
}
@Then("a meessage should be displayed {string}")
public void aMessageShouldBeDisplayed(String string) {
	 waitTillPresence(factory.homePage().orderplacedsuccesfullymessage);
	Assert.assertTrue(isElementDisplayed(factory.homePage().orderplacedsuccesfullymessage));
	String actualMessage= factory.homePage().orderplacedsuccesfullymessage.getText();
	String expectedmessage ="Order Placed Successfully";
	Assert.assertEquals(expectedmessage,actualMessage);
	 Logger.info("Order Placed Successfully");
	 slowDown();
	  
}

@Then("User click on Orders section")
public void userClickOnOrdersSection() {
	click(factory.homePage().orders);
	Logger.info("user clicked on orders button");

}
@Then("User click on first order in list")
public void userClickOnFirstOrderInList() {
	click(factory.homePage().showdetailsinorderlist);
	Logger.info("clicked on show details of order");
	
    
	
}
@Then("User click on Cancel The Order button")
public void userClickOnCancelTheOrderButton() {
    
	click(factory.homePage().cancelorderoption);
	Logger.info("user clicked on orders button");
}
@Then("User select the cancelation Reason {string}")
public void userSelectTheCancelationReason(String reason) {
	selectByVisibleText(factory.homePage().cancelationreason,reason);
    Logger.info("user selected the reason for cancelation "+reason);
	
}
@Then("User click on Cancel Order button")
public void userClickOnCancelOrderButton() {
    click(factory.homePage().submitcancelorder);
    Logger.info("user clicked on cancel order");
}
@Then("a cancelation message should be displayed {string}")
public void aCancelationMessageShouldBeDisplayed(String string) {
    
	 waitTillPresence(factory.homePage().ordercancelconfirmationmessage);
		Assert.assertTrue(isElementDisplayed(factory.homePage().ordercancelconfirmationmessage));
		String actualMessage= factory.homePage().ordercancelconfirmationmessage.getText();
		String expectedmessage ="Your Order Has Been Cancelled";
		Assert.assertEquals(expectedmessage,actualMessage);
		 Logger.info("Order has been  canceled");
		 slowDown();
	
}
@Then("User click on Return Items button")
public void userClickOnReturnItemsButton() {
    click(factory.homePage().returnbutton);
    Logger.info("clicked on return btn");

}
@Then("User select the Return Reason {string}")
public void userSelectTheReturnReason(String reason) {
	selectByVisibleText(factory.homePage().returnreason,reason);
	Logger.info("selected the reason for return");
    
}
@Then("User select the drop off service {string}")
public void userSelectTheDropOffService(String dropoff) {
	selectByVisibleText(factory.homePage().dropoff,dropoff);
	Logger.info("user choose the drop off location");
    
	
}
@Then("User click on Return Order button")
public void userClickOnReturnOrderButton() {
   
	click(factory.homePage().submitreturnorder);
	Logger.info("submit return order clicked");

}
@Then("an cancelation message should be displayed {string}")
public void cancelationmessagedisplayed(String String) {
	
waitTillPresence(factory.homePage().returnmessage);
Assert.assertTrue(isElementDisplayed(factory.homePage().returnmessage));
String actualMessage= factory.homePage().returnmessage.getText();
String expectedmessage ="Return was successfull";
Assert.assertEquals(expectedmessage,actualMessage);
 Logger.info("Order has been  returned");

}

@Then("User click on Review button")
public void userClickOnReviewButton() {
   click(factory.homePage().reviewbutton);
   Logger.info("user clicked on review button");
	
}
@Then("User write Review headline  {string} and {string}")
public void userWriteReviewHeadlineAnd(String headline, String description) {
	sendText(factory.homePage().headlineinput,headline);
	sendText(factory.homePage().reviewdescription,description);
	Logger.info("user filled the review headline and description");
    
}
@Then("User click Add your Review button")
public void userClickAddYourReviewButton() {
	click(factory.homePage().addyourreviewbutton);
	Logger.info("add your review was clicked");
   
}
@Then("a review message should be displayed {string}")
public void aReviewMessageShouldBeDisplayed(String expected) {
	//waitTillPresence(factory.homePage().reviewmessage);
	//Assert.assertTrue(isElementDisplayed(factory.homePage().reviewmessage));
	//String actualMessage= factory.homePage().reviewmessage.getText();
	//String expectedmessage ="Your review was added successfully";
	//Assert.assertEquals(expectedmessage,actualMessage);
	 //Logger.info("review was added successfully");
	 waitTillPresence(factory.homePage().reviewmessage);
Assert.assertEquals(factory.homePage().reviewmessage.getText(),expected);
Logger.info("review addd message was displayed");
    
	
}



	
	
	
	
}
	


