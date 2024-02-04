Feature: Operation Theater

  @OT
  Scenario: Verify operation theater module is available on the application

    Given User is able to login into the application
    When User is on the Bahmni app dashboard
    Then User can see the operation theater module on dashboard page