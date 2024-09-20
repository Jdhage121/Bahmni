Feature: Delete a patient from a program
  Background:
    Given the user is logged into the Bahmni application with valid credentials

    @DeleteProgram
Scenario: Delete patient from the program
And the user navigates to the Program module in the Bahmni Labour Ward Dashboard
When the user searches for the patient name
And the program enrollment page is displayed
And delete patient from the program
Then patient should be successfully deleted from the program