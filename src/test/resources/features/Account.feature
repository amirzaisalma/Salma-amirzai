Feature: Account feature


Background:
Given User is on retail website
When User click on Sign in option
And User enter email 'sal@yahoo.com' and password 'Sal1@yahoo'
And User click on login button
And User should be logged in into Account



@Update
Scenario: Verify User can update Profile Information 
When User click on Account option 
And User update Name 'noorala' and Phone '8066655444'
And User click on Update button 
Then user profile information should be updated

@UpdatePassword
Scenario: Verify User can Update password 
When User click on Account option 
And User enter below information 
|previousPassword| newPassword|confirmPassword|
| Afghan551!| Sara321@ |Sara321@ |
And User click on Change Password button 
Then a message should be displayed Password Updated Successfully


@AddPayment
Scenario: Verify User can add a payment method 
When User click on Account option 
And User click on Add a payment method link 
And User fill Debit or credit card information 
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|1234123412341236 | salami |12 |2023 |313 |
And User click on Add your card button 
Then a message should be displayed 'Payment Method added successfully'

@EditPayment
Scenario: Verify User can edit Debit or Credit card 
When User click on Account option
And User select on card  
And User click on Edit option of card section
And user edit information with below data 
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|1235567890123455 | salahh |03 |2024 |124 |
And user click on Update Your Card button 
Then an message should be displayed 'Payment Method updated Successfully'


@RemoveCard
Scenario: Verify User can remove Debit or Credit card 
When User click on Account option 
And User select on card
And User click on remove option of card section
Then payment details should be removed



@AddAddress
Scenario: Verify User can add an Address 
When User click on Account option 
And User click on Add address option 
And user fill new address form with below information 
|country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
|United Kingdom|sam sami|8046656565|Richmondroad|12|paris|Bexley|23294|
And User click Add Your Address button 
Then a message should bee displayed 'Address Added Successfully'

@EditAddress
Scenario: Verify User can edit an Address added on account
When User click on Account option 
And User click on edit address option 
And usser fill new address form with below information 
|country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
|Afghanistan | salisali | 9090002222 | kochagulfroshi | 12 | Kabul | Kabul | 11111 |
And User click update Your Address button 
Then a message shoulld be displayed 'Address Updated Successfully'



@Removeaddress
Scenario: Verify User can remove Address from Account 
When User click on Account option 
And User click on remove option of Address section
Then Address details should be removed
































