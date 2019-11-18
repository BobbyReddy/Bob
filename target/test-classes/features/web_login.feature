Feature: login

@regTest
Scenario: Home page login
Given user is on facebook login page
When user login with the user id "bindren" and password "5265"
Then home page is loaded
And content dispalyed is "true"
