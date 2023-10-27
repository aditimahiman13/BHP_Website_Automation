
Feature: PE Dashboard
<<<<<<< HEAD
  @PEDashboard_TC1
=======

>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
#  Scenario Outline: Verify PE dashboard default state
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    Then I verify I am on the PE dashboard
#    And I verify "No Project Selected" text is displayed on the PE dashboard
#
#    Examples:
#      |email  					   |password |
#      |aditi.mahiman+PE@coditas.com|  Test@123 |
<<<<<<< HEAD
#
=======

>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
#
#  @PEDashboard_TC2
#  Scenario Outline: Select project from dropdown
#
<<<<<<< HEAD
=======
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    Then I verify that the project is selected
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC3
#  Scenario Outline: Add a row on the dashboard
#
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I add a row
#    Then I verify that the row is added
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC4
#  Scenario Outline: Delete a row on the dashboard
#
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I add a row
#    And I delete a row
#    Then I verify that the row is deleted
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |

#  @PEDashboard_TC5
#  Scenario Outline: Add vendor details
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    Then I verify that the project is selected
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC3
#  Scenario Outline: Add a row on the dashboard
#
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I add a row
#    Then I verify that the row is added
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC4
#  Scenario Outline: Delete a row on the dashboard
#
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I add a row
#    And I delete a row
#    Then I verify that the row is deleted
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |

<<<<<<< HEAD
    @PEDashboard_TC30
  Scenario Outline:Cancel Delete row on the dashboard

    Given I am on the Login screen
    When I login with "<email>" and "<password>"
    And I select project from dropdown
    And I add a row
    And I  cancel delete row
    Then I verify that the row is not  deleted

    Examples:
      |email  										 |	password |
      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
##  @PEDashboard_TC5
##  Scenario Outline: Add vendor details
##    Given I am on the Login screen
##    When I login with "<email>" and "<password>"
##    And I select project from dropdown
##    And I enter values in the vendor details
##    Then I verify that value is entered in vendor details
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
##
#  @PEDashboard_TC6
=======

>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
#  Scenario Outline: Add text in Text column
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter text in the Text
#    Then I verify that text is entered in Text
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
<<<<<<< HEAD
##
##
=======
#
#
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
#    @PEDashboard_TC7
#  Scenario Outline: Add text in Total planned budget column
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter values in the Budget column
#    Then I verify that values are entered in TBudget column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#
#  @PEDashboard_TC8
#  Scenario Outline: Add values in September month column column
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter values in the September month column
#    Then I verify that values are entered in September month column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC9
#  Scenario Outline: Add values in October month column column
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter values in the October month column
#    Then I verify that values are entered in October month column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC10
#  Scenario Outline: Add values in November month column column
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter values in the November month column
#    Then I verify that values are entered in November month column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
<<<<<<< HEAD
#
#  @PEDashboard_TC11
#  Scenario Outline: Enter text in Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter text in the Text Search column
#    Then I verify that text is entered in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#    @PEDashboard_TC12
#  Scenario Outline: Verify 'Contains' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Contains filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Contains in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC13
#  Scenario Outline: Verify 'Does not Contain' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Does not Contain filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Does not Contain in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#    @PEDashboard_TC14
#  Scenario Outline: Verify 'Equals' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Equals filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Equals in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC15
#  Scenario Outline: Verify 'Not Equal' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Does not equal filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Does not equal in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC16
#  Scenario Outline: Verify 'Empty' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Empty filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Empty in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC17
#  Scenario Outline: Verify 'Not Empty' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Not Empty filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Not Empty in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
##
#  @PEDashboard_TC18
#  Scenario Outline: Verify 'Starts with' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Starts with filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Starts with in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC19
#  Scenario Outline: Verify 'Ends with' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Ends with filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Ends with in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC20
#  Scenario Outline: Verify 'Enable' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Disable filter
#    And I select Enable filter
#    And I enter text in the Text Search column
#    Then I verify that I can enter values in the Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC21
#  Scenario Outline: Verify 'Disable' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Disable filter
#    Then I verify that I am not able to enter values in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC22
#  Scenario Outline: Verify 'Clear' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter text in the Text Search column
#    And I select Clear filter
#    Then I verify that Text Search column values are cleared
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#
#  @PEDashboard_TC23
#  Scenario Outline: Verify 'Clear all' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter text in the Text Search column
#    And I enter text in the Vendor details Search column
#    And I select Clear All  filter
#    Then I verify that Text Search column  and Vendor details column values are cleared
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
=======
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55

#  @PEDashboard_TC11
#  Scenario Outline: Enter text in Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter text in the Text Search column
#    Then I verify that text is entered in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |

<<<<<<< HEAD
#
#  @PEDashboard_TC24
#  Scenario Outline: Enter text in Vendor details search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter text in the Vendor details Search column
#    Then I verify that text is entered in Vendor details Search column
=======
#    @PEDashboard_TC14
#  Scenario Outline: Verify 'Contains' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Contains filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Contains in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC15
#  Scenario Outline: Verify 'Does not Contain' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Does not Contain filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Does not Contain in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#    @PEDashboard_TC17
#  Scenario Outline: Verify 'Equals' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Equals filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Equals in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC18
#  Scenario Outline: Verify 'Not Equal' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Does not equal filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Does not equal in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC19
#  Scenario Outline: Verify 'Empty' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Empty filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Empty in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC20
#  Scenario Outline: Verify 'Not Empty' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Not Empty filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Not Empty in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
##
#  @PEDashboard_TC21
#  Scenario Outline: Verify 'Starts with' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Starts with filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Starts with in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC22
#  Scenario Outline: Verify 'Ends with' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Ends with filter
#    And I enter text in the Text Search column
#    Then I verify that results are  filtered as per Ends with in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC23
#  Scenario Outline: Verify 'Enable' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Disable filter
#    And I select Enable filter
#    And I enter text in the Text Search column
#    Then I verify that I can enter values in the Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
#
#  @PEDashboard_TC24
#  Scenario Outline: Verify 'Disable' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select Disable filter
#    Then I verify that I am not able to enter values in Text Search column
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
<<<<<<< HEAD

#  @PEDashboard_TC25
#  Scenario Outline: Select date for the PO Planned for search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select date from the PO Planned for Search column
#    Then I verify that text is entered in Text Search column
=======
#
#  @PEDashboard_TC25
#  Scenario Outline: Verify 'Clear' filter for Text search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter text in the Text Search column
#    And I select Clear filter
#    Then I verify that Text Search column values are cleared
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |
<<<<<<< HEAD

#    @PEDashboard_TC26
#  Scenario Outline: Logout from PE dashboard
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I click on the logout button
#    Then I verify that I am on the login screen
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |

=======
#
#
  @PEDashboard_TC26
  Scenario Outline: Verify 'Clear all' filter for Text search
    Given I am on the Login screen
    When I login with "<email>" and "<password>"
    And I select project from dropdown
    And I enter text in the Text Search column
    And I enter text in the Vendor details Search column
    And I select Clear All  filter
    Then I verify that Text Search column  and Vendor details column values are cleared
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55




#  @PEDashboard_TC12
#  Scenario Outline: Enter text in Vendor details search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I enter text in the Vendor details Search column
#    Then I verify that text is entered in Vendor details Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |

#  @PEDashboard_TC13
#  Scenario Outline: Select date for the PO Planned for search
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I select project from dropdown
#    And I select date from the PO Planned for Search column
#    Then I verify that text is entered in Text Search column
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |

#    @PEDashboard_TC16
#  Scenario Outline: Logout from PE dashboard
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    And I click on the logout button
#    Then I verify that I am on the login screen
#
#    Examples:
#      |email  										 |	password |
#      |aditi.mahiman+PE@coditas.com|  Test@123  |





