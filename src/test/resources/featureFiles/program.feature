Feature: Bahmni Program Module
  Background: User is already registered and logged in to Bahmni Application with valid credentials

@PatientProgram
Scenario 1: To verify user is able to enroll a patient in a program

    Given user logged in Bahmni application with valid Username and password
    And select the login location as " OPD-1"
    And User Select Program module in Bahmni Labour Ward Dashboard
    And Select “All” tab and type patient name "Marium" and click on search
    And Patient program enrolment page is displayed
    When User Clicks on “New Program Enrollment”
    And select “TB Program” from the dropdown
    And Selects Program state, Start date ,type ID number as below
	  |Mariam| 22 06 1990 | 123456 |
    And click Enroll
    Then The enrolled program should visible as Active Program on the patient dashboard
