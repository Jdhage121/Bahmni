Feature: To validate the Login functionality of Bahmni app

  @LoginTest
  Scenario: To validate the Login functionality with valid creds
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app