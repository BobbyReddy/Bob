Feature: Application login



@smoketest
Scenario: Home page login
Given user is on facebook login page
When user login with the user id "bindren" and password "5265"
Then home page is loaded
And content dispalyed is "true"

@regTest
Scenario: Home page login
Given user is on facebook login page
When user login with the user id "bob" and password "1234"
Then home page is loaded
And content dispalyed is "false"

@webtest
Scenario: Home page login
Given user is on facebook login page
When user trying to signup  with below details
|bob|reddy|bob@gmail.com|9703396994|
Then home page is loaded
And content dispalyed is "false"

@webtest
Scenario Outline: Home page login
Given user is on facebook login page
When user trying to signup  with <username> and <password>
Then home page is loaded
And content dispalyed is "false"

Examples:
|username|password|
|user1|pass1|
|usser2|pass2|
|user3|pass3|


