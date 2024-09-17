#Feature: To validate the Login functionality of Bahmni app

Feature: User Registration
  as a User I want to register on Bahmni application

  @LoginTest
  Scenario: To validate the Login functionality with valid creds
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app

  Scenario Outline:To validate the Login functionality with invalid creds

    Given user launches the applications
    And user enters invalid login credentials "<UserName>" "<Password>" and click on login button
    Then user should see the message "You are not authenticated or your session expired. Please login."
    Examples:
      | UserName   | Password |
      | superwoman | admin123 |
      | 123        | abcd     |

  Scenario Outline:Patient registration with valid data
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on registration button on home screen
    And user clicks on create new button
    And user enters "<firstname>" and "<lastname>" and "<gender>" and "<age>" to create patient registration
    And user should be able to register the new patient successfully and get a pop up message as Saved
    Examples:
      | firstname | lastname | gender | age |
      | Indu      | Kumar    | Female | 45  |
     # | Steve     | Jobs     | Male   | 54  |
    #  | Paul      | Solomon  | Male   | 68  |

  Scenario Outline:Patient registration with invalid data
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on registration button on home screen
    And user clicks on create new button
    And user enters "<firstname>" and "<lastname>" and "<gender>" and "<age>" to create patient registration
    And user unable to register new patient and get a "Error message"
    Examples:
      | firstname | lastname | gender | age |
      | 123       | 456      | Female | 45  |
      | Steve     |          | Male   | 54  |

  Scenario Outline:Verify Gender dropdown options
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on registration button on home screen
    And user clicks on create new button
    When user click the Gender dropdown options the user should see "<gender>"
    Examples:
      | gender |
      | Male   |
      | Female |
      | Other  |

  Scenario Outline: Verify search button functionality on Registration Module by Name
    Given user launches the application
    And user enters the login credentials and click on login button
    Then user should be able to login to the app
    And user click on registration button on home screen
    And user clicks on the search button
    Then user should be redirected to the search results page to search by "<Name>"
    And user should see the search result "Paul John"
    Examples:
      | Name |
      | Paul |
