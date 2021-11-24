Feature: For Sharekhan Menu Automation

  Scenario: Verify sharekhan Login
    Given I open chrome
    Then I entered url as "https://www.sharekhan.com/" in browser
    Then I Click on login/Trade button
    Then I Entered loginid
    Then I click on next and entered password as "Mithun@2"
    Then I close the browser
