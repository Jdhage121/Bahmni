

Feature: Enroll a patient in a program

  Background:

    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app

  @positive
  Scenario: Enroll a patient in a program

    Given Go to the program management page on the patient dashboard
    When User enrol for a program



