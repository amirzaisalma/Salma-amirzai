Feature: Sign In Feature

  # this is comment
  #Background: 
    #Given User is on retail website
    #When User click on Sign in option


   @Senario
  Scenario: verify user can sign into retail appliation
    #And User enter email'ihateteacher@tek.com' and password'Tek@123'
    Given User is on retail website
     When User click on Sign in option
    And User enter email 'sal@yahoo.com' and password 'Sal1@yahoo'
    And User click on login button
    Then User should be logged in into Account

  @signInTest123
  Scenario Outline: Verify user can sign in with different email and pass
   Given User is on retail website
   When User click on Sign in option
    And User enter email 'sal@yahoo.com' and password 'Sal1@yahoo'
    And User click on login button
    Then User should be logged in into Account

   # Examples: 
     # | email                | password     |
     # | sara12345@gmail.com  | Sara12@345 |
     # | ihateteacher@tek.com | Tek@12345  |

  @accountCreation1
  Scenario: verify user can create an account into retail website
   Given User is on retail website
    When User click on Sign in option
    And User click on create new account button
    And User fill the signUp information with below data 
      | name     | email                   | password  | confirmPassword |
      | pantherssss | sbais.psafii123890@gmail.com | Tektt11s@12345 | Tektt11s@12345       |
   # And user fill the signup information with below data
    #| name | email             | password   | confirmpassword |
     # | <name> | <email> | <password> | <confirmpassword> |
    And user click on signup button
    Then user should be logged into account page
      | name | email             | password   | confirmpassword |
      
     # Examples: 
      #| name | email             | password   | confirmpassword |
     # | papa | 127661salma324@yahoo.com | Yzx43@43344|  Yzx43@43344      |
     # | papa | 326561salma526@yahoo.com | Yzx56@43345 | Yzx56@43345      |
    #  | papa | 233461salma728@yahoo.com | Yzx65@43346 | Yzx65@43346      |
      
      
      
      @CreateAccount
  Scenario: Verify user can create an account into Retail Website
    #Given User is on retail website
    #When User click on Sign in option
   # And User click on Create New Account button
   Given User is on retail website
    When User click on Sign in option
    And User click on create new account button
    And User fill the signUp information with below data 
      | name     | email                   | password  | confirmPassword |
      |pantherss|sbb.psafi1238989@gmail.com|Tekk1@91123458|Tekk1@91123458|
    #And User click on SignUp button
    #Then User should be logged into account page
     And user click on signup button
    Then user should be logged into account page
      
      
      
      
      
      
      
      
      
      
