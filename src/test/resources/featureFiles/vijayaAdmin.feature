Feature: To validate the Admin module

  @Admin
  Scenario: To validate user is able to add the csv document
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on the Admin module from the home page
    And user is on the admin module page
    And user click on the "CSV Upload"
    And user select file type as "conceptset"
    And user upload the csv file
