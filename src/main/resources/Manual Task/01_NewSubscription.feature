Feature: New Subscription Screen
  User login to the mobile application
  So that the system takes some data from the user to subscribe to those specific features
  The user must provide valid data to successfully subscribe

  Background: User is Logged In
    Given A user opens the mobile app and has valid cardinalities
    When A user enters a valid email <email> and password <password>
    And A user clicks Sign-in
    Then A user must be successfully logged into the application

  Scenario #1: successful subscription
    Given A user Logged in
    When A user opens "Account" from the bottom navigation bar
    And A user opens the ”User Profile"
    And A user click on “New Subscription"
    And A user will be redirected to the new subscription screen to submit his First Name "Aamer", Last Name "Ali", Mobile "01234567891", Email "Aamer@gmail.com", Birthdate "08/08/1997", Address "Giza", and Gender "Male"
    Then A user has successfully subscribed to the features


  Scenario Outline #2: Unsuccessful subscription due to invalid data provided
    Given A user Logged in
    When A user opens "Account" from the bottom navigation bar
    And A user opens the ”User Profile"
    And A user click on “New Subscription"
    And A user will be redirected to the New Subscription screen to submit his <firstName>, <lastName>, <mobile>, <email>, <birthdate>, <address>, and <gender>
    Then A user subscription will fail
    Examples:
      | 	  firstName	   | lastName | 	mobile  |    email     | birthdate  | address | gender |
      | 	  "Amir"	   |  "Eid"   |"01123456789"|"test@test.co"|"01/01/2000"| "Cairo" | "Male" |	// First name must be at least 5 characters long.
      |"MuhammedMahmmoud"  |   "Ali"  |"01123456789"|"test@test.co"|"01/01/2000"| "Cairo" | "Male" |	// The first name must be no more than 15 characters long.
      |	  "Ahmed@sa"	   |   "Ali"  |"01123456789"|"test@test.co"|"01/01/2000"| "Cairo" | "Male" |	// All special characters are not allowed in the first name by using a set of special characters
      |	  	  ""           |   "Ali"  |"01123456789"|"test@test.co"|"01/01/2000"| "Cairo" | "Male" |    // the first name must be mandatory and not blank
      |  "MuhammedMahmoud" |    ""	  |"01123456789"|"test@test.co"|"01/01/2000"| "Cairo" | "Male" |	// the last name must be mandatory and not blank
      | 	  "Amany"	   |  "Salah" |		""		|"test@test.co"|"01/01/2000"| "Cairo" |"Female"|	// the mobile must be mandatory and not blank
      | 	  "Mostafa"	   |  "Saleh" |"0112nm56789"|"test@test.co"|"01/01/2000"| "Cairo" | "Male" |	// the mobile must be numbers only
      | 	  "Manal"	   |  "Salah" |"01123456789"|	  ""	   |"01/01/2000"| "Cairo" |"Female"|	// the email is mandatory and must be provided
      | 	  "Muhammed"   |  "Salah" |"01123456789"|"test@test.co"|"17/07/2023"| "Cairo" | "Male" |	// the birth date cant be a future date
