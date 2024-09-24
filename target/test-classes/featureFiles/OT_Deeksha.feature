Feature: To verify Operation Theatre module

  @Deeksha_OTM
  Scenario: To validate user can add new surgical block
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on Operation Theatre button on homepage
    And click on OT Scheduling
    And click on the button New Surgical Block
    And User is able to enter Surgeon details
    And click on save button