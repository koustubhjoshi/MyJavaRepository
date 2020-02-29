Feature: testing google app

Scenario: test google status code
Given I start rest assured testing
When I hit google website
Then I check the status code from response
