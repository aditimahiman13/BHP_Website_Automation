
Feature: PE Dashboard


  @tag1
  Scenario: Verify PE dashboard
    Given I am on the Login screen
    When I login with "<email>" and "<password>"
    Then I verify I am on the PE dashboard
    And I verify "No Project Selected" text is displayed on the PE dashboard

  Examples:
|email  										 |	password |
|aditi.mahiman+PE@coditas.com|  Test@123  |
