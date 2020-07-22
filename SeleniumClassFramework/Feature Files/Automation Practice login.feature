Feature: Automation practice login feature 
	Description : passwrod must be at least 8 character
	

Scenario:
As a Automation practice user , i can login successfully with valid user name and password 

	Given open a browser 
	And Put URL 
	When Click Signin 
	And put valid user name 
	And put valid password 
	And click sign in button 
	Then Validate login was success(sign out btn) 
