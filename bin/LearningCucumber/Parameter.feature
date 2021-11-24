Feature: For Parameter Automation

  Scenario: To pass value in test case
    Given I open Chrome
    And I navigate to URL "https://www.facebook.com/"
    Then I give username as "Rohini"
    Then I give password as "Bangar"
    Then click on login

  Scenario Outline: to check with multipel test data
    Given I open Chrome
    And I navigate to URL "https://www.facebook.com/"
    And I give username as "<Username>"
    And I give password as "<Password>"

    Examples: 
      | Username | Password |
      | raj      |     1234 |
      | ram      |     1235 |
      | rajul    |     1237 |
      | rahul    |     1238 |
