Feature: Testing cucumber with selenium

Scenario Outline: Validate Yahoo login
Given User Opens Yahoo website
When  User uncheck stay signed in checkbox
Then  User enters "<username>" and "<password>" to validate login 

Examples:
 	| username																		|  password						| 
	| j_koustubh@yahoo.com												|  abc123	            |
	| j_koustubh@yahoo.com												|  lmn12345677        |
 	| j_koustubh@yahoo.com												|  pqr092873767       |

