Feature: First Rest Assured test POST 


Scenario: Test my POST request test 
Given  user hit the post request with "Tom" name
Then user validate followind data
	|param			|Value			|
	|id					|notNull		|
	|statusCode	|201				| 	
Then I will validate other parameter

#When user hit the get request
#Then user checks 200 the status code
#Then user checks the count or size
#Then user checks "albert_park" value
#Then user checks at path "MRData.CircuitTable.Circuits.circuitId[0]" with the "albert_park" value


 

