Feature: Testing cucumber with selenium1


Scenario: Verify sample form
Given User Opens form website
When  User navigate to registration form
When  User select personal data
Then  User enters details
| Fields             | Values             |
| firstname          | koustubh           |
| lastname           | joshi              |
| address            | sinhgad road pune  |
| emailaddress       | koustubh@gmail.com |
| phone              | a1234567890        |
| passcode  		     | abcd123					  |
| cpasscode          | abcd123            |

