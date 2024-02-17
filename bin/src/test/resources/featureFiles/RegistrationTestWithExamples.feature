Feature: To validate the patient registration with multiple sets of data


  @RegistrationTestParametrised
  Scenario Outline: To validate the patient registration with valid data
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on registration button on home screen
    And user clicks on create new button
    And user enters "<firstname>" and "<lastname>" and "<gender>" and "<age>" to create patient registration
    And clicks on startOPD button
    Examples:
    | firstname | lastname | gender | age |
    | prashanth | sam      | Male   | 23  |
    | chandrika | dada     | Female | 34  |
    | mehedi    | adada    |  Male  | 34  |
    | Sushma    | Y        | Female | 30  |
