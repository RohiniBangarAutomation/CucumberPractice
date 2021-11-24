Feature: For Wikipedia Automation

  Background: 
    Given I open Chrome
    And I navigate to Wikipedia

  @selenium
  Scenario: To click on English Lang in wikipedia
    Then I click on English Lang

  Scenario: To click on Polski Lang in wikipedia
    Then I click on Polski Lang

  Scenario: See the history of wikipedia in hindi
    Then I click on Hindi
    Then I click on Watch History
