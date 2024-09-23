Feature: To validate the patient registration
  Background:
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app


  @RegistrationTest @saintarytest
  Scenario: To validate the patient registration with valid data

    And user click on registration button on home screen
    And user clicks on create new button
    And user enters "mehedi" and "hasan" and "Male" and "23" to create patient registration
    And clicks on startOPD button


  Scenario: To validate the patient registration with valid data

    And user click on registration button on home screen
    And user clicks on create new button
    And user enters "mehedi" and "hasan" and "Male" and "23" to create patient registration
    And clicks on startOPD button