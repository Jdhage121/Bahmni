@bahmiapp
Feature: User login page

Scenario Outline: Login page
    Given I am on the login page
    When I have give UserName as '<UserName>'
    And I have give Password as '<Password>'
    And I have give Location as '<Location>'
    And I have give Select local language as '<LLanguage>'
    And I click on login button
    Then I could see Home Dashboard

 Examples:
|UserName|Password|Location|LLanguage|
|Superman|Admin123|General ward|English|
