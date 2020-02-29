Feature: Testing basics

Scenario: 1.I want to test google is up and running
Given google have website
When I hit google application
Then I validate status code

#Scenario: 2.I want to test google is up and running
#When I hit google application
#Then I validate status code

#Scenario: validate fb login
#Given open fb application
#When I enter user name
#When I enter password
#When I hit login
#Then I check i am logged in 
 

 