Feature: contactUs page feature


Scenario: contactUs page title

Given user is on loginpage
When user gets contactusPageTitle
And validate homepage icon
Then clickOn contactus page
Then select value form the dropdown