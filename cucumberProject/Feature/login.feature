Feature: login fetaure
  this will do login functionality

  Scenario: Login with Correct username and password
    Given I navigate to login page
    And I enter the following details
    |username   |password | 
    |admin      |admin    |
    And I click login buton
    Then I should see userform page



    Scenario: Login with Correct username and password to fail scenario
    Given I navigate to login page
    And I enter the following details
    |username   |password | 
    |admin      |admin    |
    And I click login buton
    Then I will click logout button



    