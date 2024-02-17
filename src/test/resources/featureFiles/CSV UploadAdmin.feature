Feature: To valid the CSV Upload 
   @CSVUploadTest
Scenario: User Should able to upload file
    Given user launches the application
    And user enters the login credentials and click on login button
    And user should be able to login to the app
    And user click on the Admin Module
    Then user should able to see the Admin module page
    And user select the CSV Upload
    And user should able to see the CSV Upload page
    And User select file type
    And user click on the Choose file(s)
    Then user should navigate to window and select the file
    And user click the upload button
    Then user should able to upload the file 
    
