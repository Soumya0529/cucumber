Feature: Login to nopcommerce demo 

Scenario: User login to nopcommerce
Given user is on the nopcommerce website
When user enters email as "admin@yourstore.com"  and password as "admin"
And user clicks on login button
Then user is on the dashboard page with title "Dashboard / nopCommerce administration"

Scenario Outline: User login to nopcommerce
 Given user is on the nopcommerce website
 When user enters email as "<email>"  and password as "<password>"
 And user clicks on login button
 Then user is on the dashboard page with title "Dashboard / nopCommerce administration"

 Examples:
| email | password |
| admin@yourstore.com | admin |
| adn@yourstore.com | adm |