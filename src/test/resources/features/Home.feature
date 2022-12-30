Feature: Retail Home Page

  @test
  Scenario: Verify Retail page logo
    Given User is on retail website
    Then User verify retail page logo is present

  @search
  Scenario: Verify User can search in Electronics Department
    Given User is on retail website
    When User change the catagory to 'Electronics'
    And User search for an item 'PlayStation'
    And User click on Search icon
    Then Item should be present

  @test1
  Scenario: verify user can click on All section
    Given User is on retail website
    When User click on All section
    Then User verifies 'Shop By department' is present

  @testCart
  Scenario: Verify the Cart icon is present
    Given User is on retail website
    Then User verifies Cart icon is present

  @test2
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @test3
  Scenario Outline: Verify department sidebar options
    Given User is on retail website
    When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                        | optionTwo                  |
      | 'Electronics' | 'TV & Video'                     | 'Video Games'              |
      | 'Computers'   | 'Accessories'                    | 'Networking'               |
      | 'Smart Home'  | 'Smart Home Lightning'           | 'Plugs and Outlets'        |
      | 'Sports'      | 'Athletic Clothing'              | 'Exercise & Fitness'       |
      | 'Automotive'  | 'Automative Parts & Accessories' | 'MotorCycle & Powersports' |

  @test5
  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'sal@yahoo.com' and password 'Sal1@yahoo'
    And User click on login button
    And User should be logged in into Account
    When User change the catagory to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @test6
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'sal@yahoo.com' and password 'Sal1@yahoo'
    And User click on login button
    Then User should be logged in into Account
    When User change the catagory to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And user fill new address form with below information
      | country        | fullName | phoneNumber | streetAddress | apt | city  | state  | zipCode |
      | United Kingdom | sam sami |  8046656565 | Richmondroad  |  12 | paris | Bexley |   23294 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234123412341236 | salami     |              12 |           2023 |          313 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a meessage should be displayed 'Order Placed, Thanks'

  @test7
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'sal@yahoo.com' and password 'Sal1@yahoo'
    And User click on login button
    Then User should be logged in into Account
    When User change the catagory to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a meessage should be displayed 'Order Placed, Thanks'

  @test8
  Scenario: Verify User can cancel the order
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'sal@yahoo.com' and password 'Sal1@yahoo'
    And User click on login button
    Then User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then a cancelation message should be displayed 'Your Order Has Been Cancelled'

  @test9
  Scenario: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'sal@yahoo.com' and password 'Sal1@yahoo'
    And User click on login button
    Then User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Return Items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then an cancelation message should be displayed 'Return was successfull'

  @test10
  Scenario: Verify User can write a review on order placed
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'sal@yahoo.com' and password 'Sal1@yahoo'
    And User click on login button
    Then User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Review button
    And User write Review headline  'headline value' and 'review text'
    And User click Add your Review button
    Then a review message should be displayed 'Your review was added successfully'

    
    
    
    
    
    