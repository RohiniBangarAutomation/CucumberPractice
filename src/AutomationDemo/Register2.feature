Feature: For Parameter Automation

  Background: 
    Given I open chrome

  Scenario: To pass value in test case
    Then I navigate to url "http://demo.automationtesting.in/Register.html"
    Then I give First Name as "Rohini"
    Then I give Last Name as "Bangar"
    And I give Address as "Pune,Maharashtra"
    Then Give email_id as "rohinikhr@gmail.com"
    Then I click on submit

  Scenario Outline: to check with multipel test data
    Given I open chrome
    Then I navigate to url "http://demo.automationtesting.in/Register.html"
    Then I give First Name as "<fname>"
    Then I give Last Name as "<lname>"
    And I give Address as "<address>"
    Then Give email_id as "<email>"

    Examples: 
      | fname | lname   | address | email |
      | raj   | shinde  | Nashik  | bhsbc   |
      | ram   | pansare | dhule   | dscd  |
      | rajul | bangar  | mahad   | fsvf  |
      | rahul | kad     | shirur  | cds   |
