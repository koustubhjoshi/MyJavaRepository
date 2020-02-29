Feature: Testing cucumber with selenium1

Scenario Outline: Enter personal data
Then  User enters values in "<firstname>" also "<lastname>" also "<address>" also "<emailaddress>" also "<phone>" fields
  
Examples:

| firstname	|  lastname	| address	 				   | emailaddress					| phone      |
| koustubh	|  joshi	  | sinhgad road, pune | j.koustubh@gmail.com | a1234567890|