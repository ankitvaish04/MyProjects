Feature: User Logs into the Flipkart application

Scenario Outline: Valid User Login to Flipkart
    Given the Flipkart application
    When  the user enters valid username as <username> and password as <password>
    Then  they should be able to see their First Name displayed in the salutation

Examples:
| username               | password |
| ankitvaish04@gmail.com | It@meankit1981I |


Scenario Outline: Invalid User Login to Flipkart
    Given the Flipkart application
    When  the user enters invalid username as <username> and/or password as <password>
    Then  they should be able to see the error message as "Your username or password is incorrect"

Examples:
| username               | password   |
| ankitvaish04@gmail.com | ankit1234  |