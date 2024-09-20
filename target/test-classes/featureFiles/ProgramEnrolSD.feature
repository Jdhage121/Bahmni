Feature: Enroll a patient to a program
Background:
Given the user is logged into the Bahmni application with valid credentials

  @ProgramEnrolScenarioSD
Scenario: Verify that the user can successfully enroll a patient in a program
And the user navigates to the Program module in the Bahmni Labour Ward Dashboard
When the user searches for the patient name
And the program enrollment page is displayed
And the user initiates a new program enrollment selects the Program state, Start date, ID number, clicks Enroll
Then enrolled program should be visible as an Active Program on the patient dashboard

  Scenario: Verify Error message if the user already enrolled in this program
  And the user navigates to the Program module in the Bahmni Labour Ward Dashboard
  When the user searches for the patient name
  And the program enrollment page is displayed
  And the user initiates a new program enrollment selects the Program state, Start date, ID number, clicks Enroll
  Then error message should display on the dashboard

