#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Test function login skype

@tag1
Scenario: Login with empty email and password
Given Go to URL
When Input username is ""
	And Input password ""
	And Click button Sign in
Then Alert message "You did not enter your Skype Name."

@tag2
Scenario: Login with correct email and empty password
Given Go to URL
When Input username is "vanhong91"
	And Input password ""
	And Click button Sign in
Then Alert message "Incorrect password. Please try again."

@tag3
Scenario: Login with correct email and incorrect password
Given Go to URL
When Input username is "vanhong91"
	And Input password "123456789"
	And Click button Sign in
Then Alert message "Signing in failed. Please double-check your Skype Name and re-enter your password."

@tag4
Scenario: Login with correct email and password
Given Go to URL
When Input username is "vanhong91"
	And Input password "hongvan123"
	And Click button Sign in
Then Verify Title "My account"




