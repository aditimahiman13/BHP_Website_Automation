
Feature: Project Engineer Login

  @Login_TC1
  Scenario Outline: Login with valid email address  and valid password(positive scenario)
    Given I am on the Login screen
    When I login with "<email>" and "<password>"
    Then I verify I am on the PE dashboard

Examples:
|email  										 |	password |
|aditi.mahiman+PE@coditas.com|  Test@123  |

@Login_TC2
Scenario Outline: Login with valid email address and invalid password

   Given I am on the Login screen
   When I login with "<email>" and "<password>"
   Then I verify the error message is displayed for valid email and invalid password

 Examples:
| email  												|password	|
| aditi.mahiman+PE@coditas.com			|Test@1234	|


<<<<<<< HEAD

  @Login_TC3
  Scenario Outline: Login with invalid email address and valid password

    Given I am on the Login screen
    When I login with "<email>" and "<password>"
    Then I verify the error message is displayed for invalid email address and valid password

    Examples:
      | email  												|password	|
      | aditi.mahiman+PE@coditas			|Test@123	|

  @Login_TC4
  Scenario Outline: Login with invalid email address and invalid password

    Given I am on the Login screen
    When I login with "<email>" and "<password>"
    Then I verify the error message is displayed for invalid email address and invalid password

    Examples:
      | email  												|password	|
      | aditi.mahiman+PE@coditas			|Test@1234|
#
  @Login_TC5
  Scenario Outline: Login with blank email address and valid password

    Given I am on the Login screen
    When I login with "<email>" and "<password>"
    Then I verify the error message is displayed for blank email address and valid password

    Examples:
      | email  												|password	|
      | 															|Test@123	|

  @Login_TC6
  Scenario Outline: Login with valid email address and blank password

    Given I am on the Login screen
    When I login with "<email>" and "<password>"
    Then I verify the error message is displayed for valid email address and blank password

    Examples:
      | email  												|password	|
      | aditi.mahiman+PE@coditas.com	|					|

  @Login_TC7
  Scenario Outline: Login with blank email address and blank password

    Given I am on the Login screen
    When I login with "<email>" and "<password>"
    Then I verify the error message is displayed for blank email address and blank password

    Examples:
      | email  												|password	|
      |																|					        |

  @Login_TC8
  Scenario Outline: Verify that forgot password link is sent
    Given I am on the Login screen
    When I click on the Forgot Password link
    Then I verify password reset link is sent

    Examples:
      |email  										 |	password |
      |aditi.mahiman+PE@coditas.com|  Test@123  |

  @Login_TC3

  Scenario Outline: Login as a PM
    Given I am on the Login screen
    When I login with "<email>" and "<password>"
    Then I verify I am on the PM dashboard

    Examples:
      |email  										 |	password |
      |priyanka.patil+PM@coditas.com  |  Priyanka$2  |
=======
#  @Login_TC3
#
#  Scenario Outline: Login as a PM
#    Given I am on the Login screen
#    When I login with "<email>" and "<password>"
#    Then I verify I am on the PM dashboard
#
#    Examples:
#      |email  										 |	password |
#      |priyanka.patil+PM@coditas.com  |  Priyanka$2  |
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55















