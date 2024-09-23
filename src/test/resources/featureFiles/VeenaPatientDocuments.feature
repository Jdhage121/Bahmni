Feature: Verify the PatientDocuments module


  @PatientDocumentsTest1
  Scenario: To validate user can upload and view Patient Documents
    Given user launches the Application
    And user enters the login credentials and clicks on login button
    And user should be able to login to the Application
    When user clicks on the Patient Documents
    Then user search for the patient in all patients list
    And user click on the search button
    And the user can upload the Document
    And user can view the Document
