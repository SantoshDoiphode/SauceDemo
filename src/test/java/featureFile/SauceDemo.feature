Feature: Test SauseDemo Applcation

Scenario: Validate Login functionality
Given user is on login page
When user enter "standard_user" as userName and "secret_sauce" as password
Then user click on login page

Scenario: validate product add to cart functionality
Given user click on filter icon 
Then user click on price range options 
And user click on first add to cart option 
Then user click on go to cart icon 
And user click on checkOut button 

Scenario: Validate checkout information
Given user enter "Santosh" as firstName and "Doiphode" as lastName and "4512" as pincode 
Then user click on continue button 

Scenario: Validate ChecOutOverview
Given user click on finish button 
Then user click on back to home button 


