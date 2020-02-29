Feature: Testing cucumber with selenium2

Scenario Outline: Create user
Then  User enters values in "<password>" also "<confirm password>" fields
  
Examples:
| password	| confirm password	|
| abc12345  | abc12345					|