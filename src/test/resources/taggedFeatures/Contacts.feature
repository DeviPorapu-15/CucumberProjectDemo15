@PhaseOne
Feature: Contacts CRUD Management

@SmokeTest 
Scenario: Create a new Contact
Given User is on loginpage
When User create a new contact

@RegressionTest
Scenario: View a Contact
Given User is on loginpage
When User view contact details

Scenario: Delete a Contact
Given User is on loginpage
When User delete a contact