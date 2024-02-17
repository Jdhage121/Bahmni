Feature: To valid the CSV Export
  @CSVExportTest
  Scenario: User should able to download the file
  Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on the Admin Module
    Then user should able to see the Admin module page
    And user select the CSV Export
    And user should able to see the CSV Export page
    Then user select the file and click on Export button
    Then user should able to download the file
    
    
    Scenario: User should notable to download the file
  Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on the Admin Module
    Then user should able to see the Admin module page
    And user select the CSV Export
    And user should able to see the CSV Export page
    Then user notselect the file and click on Export button
    Then user should notable to download the file
    Then Error message should be displayed