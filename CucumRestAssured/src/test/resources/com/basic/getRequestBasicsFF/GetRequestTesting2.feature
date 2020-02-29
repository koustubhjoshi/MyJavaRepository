Feature: First GET Rest Assured test101


Scenario: Test my Get Method101
Given  user start the rest asured test
When user hit the get request
Then user checks the "30" count or size
Then user checks data at path "MRData.limit" having value "30" in jason
Then user checks data at path "MRData.CircuitTable.Circuits[0].circuitId" having value "albert_park" in jason
Then user checks data at path "MRData.CircuitTable.Circuits[3].circuitId" having value "BAK" in jason
 

