Feature: F02_AddToCart| user could add the product to the cart
  Background: User is Logged In
    Given user go to website and entering the login page
    When user login with userName "standard_user" and password "secret_sauce"
    Then user login to the system successfully
  Scenario Outline: user could add the products to the cart
    Given User is on the home page
    When user added <number> of items to the cart
    And user opens the shopping cart
    Then the <number> of items was added successfully to the cart
    Examples:
    |number|
    |3     |
    |5     |