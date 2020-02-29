Feature: Testing basics

Scenario: 1.I want to test get request
Given race circuite application is running
When I hit get request to get response
Then I validate circuite limit value
Then I validate circuite ID value
Then I validate circuite total value
Then I validate circuite "MRData.limit" value as "30" present
Then I validate circuite "MRData.total" value as "20" present
Then I validate circuite "MRData.CircuitTable.Circuits[0].circuitId" value as "albert_park" present

#Use 9,10,11

#Scenario: 2.I want to test google is up and running
#When I hit google application
#Then I validate status code

#Scenario: validate fb login
#Given open fb application
#When I enter user name
#When I enter password
#When I hit login
#Then I check i am logged in 
 

 