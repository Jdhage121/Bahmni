Feature: Verify the registration functionality

Background:
  Given user launches the application
  And user enters the login credentials and click on login button
  Then user should be able to login to the app

  @Reg
  Scenario: Verify registration module is present on the bahmni app
    When user click on registration button
    Then user can see the registration page
