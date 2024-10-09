Feature: InPatient Module Functionality of Bahmni application
  Background:
    Given user launches Bahmni application
    When user enters valid credentials and logs on successfully onto home page

  @Smoke
  Scenario: To validate that user can see InPatient app on the home page of the Bahmni application
    Then user should see InPatient app on the home page

  @Sirisha
  Scenario: To Validate that user can navigate to patient queue page
    And user clicks on InPatient app on the home page
    Then user should land on patient queue page
    Then user should see all tabs
