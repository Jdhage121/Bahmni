Feature: To validate the patient registration


  @RegistrationTestDataTable
  Scenario: To validate the patient registration with valid data
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on registration button on home screen
    And user clicks on create new button
    And user enters patient data as below
    | Prashanth | samudrala | Male | 23 |
    And clicks on startOPD button