@AcceptanceTests
Feature: verify login feture of OrangeHRM

  @Login
  Scenario: Validate user credintials
    Given I launch the chrome browser
    And I enter OrangeHRM Url
    When I enter the username
    And I enter the password
    And I click on Login button
    Then I will see the welcome page
