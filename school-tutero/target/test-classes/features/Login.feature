@Login
Feature: Login page

  @Login
  Scenario Outline: User Successfully login into Application
    Given I am on the Application
    When I navigate to Login popup by clicking on Log In button
    And I enter valid <EmailId>
    And I enter valid <Password>
    Then I should be navigated to My account screen
    Examples:
    |EmailId           |Password  |
    |testuser@gmail.com |123456    |
