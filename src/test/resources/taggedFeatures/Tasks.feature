@PhaseOne
Feature: Contacts CRUD Management

#@SmokeTest
#Scenario: Create a new Tasks
#Given User is logged in
#When User create a new Tasks
#
#@RegressionTest
#Scenario: View a Tasks
#Given User is logged in
#When User view Tasks details
#
#Scenario: Delete a Tasks
#Given User is logged in
#When User delete a Tasks



Background: Valid login
@SmokeTest
Scenario: Create a new Tasks
When User create a new Tasks


Scenario: View a Tasks
When User view Tasks details

@RegressionTest
Scenario: Delete a Tasks
When User delete a Tasks

