Feature: Registration page
 Scenario Outline: Registration page
    Given I am on the login page
    When I have give UserName as '<UserName>'
    And I have give Password as '<Password>'
    And I have give Location as '<Location>'
    And I have give Select local language as '<LLanguage>'
    And I click on login button
    Then I could see Home Dashboard

    Given I am on the home dashboard page
    When I click on Registration option
    Then I could see Registration page

    Given I am on Registration page
    When I click on "Create new" button
    Then I could see new patient registration page

    Given I am on new patient registration page
    When I have provide patient identifier as '<PatientId>'
    And I have give Patient firstname as '<FirstName>'
    And I have give Middle name as '<MiddleName>'
    And I have give Last name as '<LastName>'
    And I provide the Gender as '<Gender>'
    And I provide Age as '<Age>'
    And I provide Date of birth as '<DOB>'
    And click on "Save" button
    Then I could see massage as "Record saved sucessfully"

  Examples:
 |UserName|Password|Location|LLanguage|
 |Superman|Admin123|General ward|English|

 Examples: 
 | PatientId | FirstName | MiddleName | LastName | Gender | Age | DOB |
 | 101       | Abhishek  | sunil      | jadhav   | male   | 36  |2|8|1988|
  