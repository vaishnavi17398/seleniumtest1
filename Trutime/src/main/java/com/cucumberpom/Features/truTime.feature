Feature: Trutime application
Scenario: Trutime scenario
Given User invokes Application cognizant homepage
Then User enters the email id
And User enters the password
And User enters the otp
Given User is on application homepage and User captures their details present on the top right corner
When User click on Start searching input tab 
And User enters "Trutime" 
Then click on search icon and page redirects to search result page
When user selects Trutime application
Then user navigate to a new window of Trutime application
Then expected days and actual days are compared successfully

