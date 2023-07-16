Feature: F01_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid UserID and Password successfully
    Given user go to website and entering the login page
    When user login with userName "standard_user" and password "secret_sauce"
    Then user login to the system successfully

  Scenario Outline: user couldn't login with invalid UserName and Password
    Given user go to website and entering the login page
    When user login with userName <userName> and password <password>
    Then user can't login to the system successfully

    Examples:
      |     userName    |   password    |
      |"locked_out_user"|"secret_sauce1"|
      | "problem_user1" |"secret_sauce" |
