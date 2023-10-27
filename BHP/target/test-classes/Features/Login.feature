
@tag
Feature: Project Engineer Login

  @Login_TC1
  Scenario Outline: Login with valid email and valid password
    Given I am on the Login screen
    When I login with "<email>" and "<password>"
    Then I verify I am on the PE dashboard
 
Examples:
|email  										 |	password |
|aditi.mahiman+PE@coditas.com|  Test@123  |

@Login_TC2
Scenario Outline: Login with valid email and invalid password
  
   Given I am on the Login screen
    When I login with "<email>" and "<password>"
    Then I verify I am on the login dashboard
    
 Examples:
| email  												|password	|
| aditi.mahiman+PE@coditas.com	|Test@1234|
| aditi.mahiman+PE@coditas			|Test@123	|
| aditi.mahiman+PE@coditas			|Test@1234|
| 															|Test@123	|
| aditi.mahiman+PE@coditas.com	|					|
|																|					|


#@Login_TC3
#
#Scenario: Login with invalid email and valid password
  #
    #Given I am on the Login screen
    #When I enter <email> in the email address field  
    #And I enter <password> in  the password
    #And I click on the Login button
    #Then I verify I am on the PE dashboard
    #
 #Examples:
#| email  | |password|
#| aaditi.mahiman+PE@coditas.com	| |Test@123|
#
#
#@Login_TC4
#Scenario: Login with invalid email and invalid password
  #
    #Given I am on the Login screen
    #When I enter <email> in the email address field  
    #And I enter <password> in  the password
    #And I click on the Login button
    #Then I verify I am on the PE dashboard
    #
 #Examples:
#| email  | |password|
#| aaditi.mahiman+PE@coditas.com	| |Test@1234|
#
#@Login_TC5
#Scenario: Login with blank email and valid password
  #
    #Given I am on the Login screen
    #When I enter <email> in the email address field  
    #And I enter <password> in  the password
    #And I click on the Login button
    #Then I verify I am on the PE dashboard
    #
 #Examples:
#| email  | |password|
#|| |Test@123|
#
#@Login_TC6
#Scenario: Login with valid email and blank password
  #
    #Given I am on the Login screen
    #When I enter <email> in the email address field  
    #And I enter <password> in  the password
    #And I click on the Login button
    #Then I verify I am on the PE dashboard
    #
 #Examples:
#| email  | |password|
#|aditi.mahiman+PE@coditas.com| ||
#
 