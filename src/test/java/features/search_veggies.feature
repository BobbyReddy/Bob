Feature: search for vegetables and add to cart

@seleniumTest
Scenario: give the veggie name and search
Given user is on greencart page
When user searches for "Cucumber" vegetable
Then "Cucumber" results appears

