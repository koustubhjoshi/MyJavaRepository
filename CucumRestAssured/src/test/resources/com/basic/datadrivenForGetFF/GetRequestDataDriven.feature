Feature: First GET with Driven Rest Assured test102


Scenario Outline: Test my Get Method102
Given  user start the rest asured test
When user hit the get request
Then user checks data at path "<jpath>" having value "<jpathvalue>" in jason

Examples:
	| jpath																				|  jpathvalue					| 
	| MRData.limit																|  30			            |
	| MRData.total																|  20			            |
	| MRData.CircuitTable.Circuits[0].circuitId 	|  albert_park	      |
	| MRData.CircuitTable.Circuits[8].circuitId	  |	 monaco 		        |



#Then user checks data at path "MRData.limit" having value "30" in jason

