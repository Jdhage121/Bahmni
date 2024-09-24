Feature: To Verify Registration module
  @Deeksha
  Scenario Outline: To validate Registration of new patient with  valid inputs
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    Then Clicks on the Registration tab
    Then Clicks on create new button
    Then User enters "<FirstName>" and "<LastName>" and "<Gender>" and "<Age>"
    Then clicks on startOPD button
    Examples:
      | FirstName | LastName | Gender | Age |
     # | Preeti    | Sharma   | Female | 32  |
     # | Gunjan    | Saxena   | Female | 26  |
      | Kamal    | Jeet     | Male | 35  |
     # | Soniya    | Dubey   | Female | 28  |


