Feature:Login page feature
#sunanda.pipi@gmail.com
#Mohanty14@#

Scenario:Login page title

Given user is on loginpage
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Forgot Password link
Given user is on loginpage
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on loginpage
When user enters username "sunanda.pipi@gmail.com"
And user enters password "Mohanty14@#"
And user clicks on Login button
Then user gets the title of the page
And page title should be "My account - My Store"

