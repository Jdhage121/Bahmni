Feature: To validate the Login functionality of Bahmni app

  @patient
  Scenario: To validate user is able to add the csv document
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    When user click  on the patient document
    Then user search for the patient in the all patient list
    And user click on select button


