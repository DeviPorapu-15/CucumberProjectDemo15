Feature: Google Page Search Function

// : should be given, then it will take as "Keyword"

Scenario: Search Java Tutorial
Given User is on Google Home Page
When user search Java Tutorial
Then Should display Java Result Page

Scenario: Search Selenium Tutorial
Given User is on Google Home Page
When user search Selenium Tutorial
Then Should display Selenium Result Page