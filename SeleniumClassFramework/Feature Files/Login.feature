@Smoke 
Feature: Automation Practice login feature testing 
	Description: pass must be more than 8 characters

#Background:common steps

@TC001_to_TC007 
Scenario: As a Automation Practice user, i can successfully login with valid credetials 
	Given  need to open a browser 
	And Put  URL 
	When Click sign in
	And put user 
	And put pass word 
	And click sign in button 
	Then login will be successful 
