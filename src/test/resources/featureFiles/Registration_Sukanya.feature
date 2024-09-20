Feature: Registration
  Background:
    Given Login and select Location
 @RegistrationSukanya
  Scenario Outline: Registration with valid inputs
    When User click on the registration link and click create new link
    And Enter the patient details '<FirstName>','<LastName>','<Gender>','<DOB>'
    And Save the patient details
    Then Patient profile will be created
    Examples:
      |FirstName |LastName|        Gender|        DOB|
      |Avni    | Krishnan |  Female    |  25-02-1992  |

  @RegistrationSukanya
  Scenario Outline: Registration with invalid(missing out mandatory) inputs
    When User click on the registration link and click create new link
    And Enter the patient details '<FirstName>','<LastName>','<Gender>','<DOB>'
    And Save the patient details
    Then User will get error msg
    Examples:
      |FirstName |LastName  |  Gender|        DOB|
      |          | Krishnan |  Female |  25-06-1998  |
      |     Alex |          |  Male   |  25-06-1998  |
      |          | Krishnan |  Female |  25-06-1998  |
      |          | Krishnan |  Female    |    |