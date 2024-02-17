Feature: To validate the Alocation of bed in Admissions Locations
Scenario: user should able to alocate the bed in Admissions Locations
@BedsAdmintest
Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on the Admin Module
    Then user should able to see the Admin module page
    And user select the Beds
    And user should able to see the Beds page
    Then user select the location of the ward(General or Labour Wards)
    Then user select the Room
    And user select the bed 
    And user select the bed number and bed type and click on the save button
    Then user should able to see the bed alocation
