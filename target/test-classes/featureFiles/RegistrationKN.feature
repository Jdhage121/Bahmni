Feature: To check the patient registration Feature

  @RegistrationTest
  Scenario: To validate the patient registration with valid data

    Given Launch the URL and login the application
    When  User in the home page click on the Registration button
    Then  User click on the create new button
    And   User enters "Kavi" and "Sam" and "Female" and "23" to create Patient registration
    And   click on startOPD button