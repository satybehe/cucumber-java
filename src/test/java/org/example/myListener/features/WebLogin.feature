Feature: To test Login Functionality

  Background:
    Given user is on Login Page

  Scenario: Test login functionality of an Application
    When user inputs userId as 'abcd'
    And inputs password as '1234'
    And hits submit button
    Then user lands on dashboard page