Feature: User visits the testing board website and can able to login with different users
  Scenario Outline: Login function
    Given "user" visits the website with credentials
    And user enters "<Username>" or User enters "<Email>" as Login
    When user clicks Login/ Register button
    And user sees the username and password box
    Then user enters the username and password
    And user clicks on AnmeldenButton
    Then Loin/Register Button disappears

    Examples:
      | Username           | Email                              |
      | TEQS_TestUser1_Sub| teqs_testuser1@teqs-consulting.com |
      | TEQS_TestUser2_Sub| teqs_testuser2@teqs-consulting.com |
      | TEQS_TestUser3_Contr| teqs_testuser3@teqs-consulting.com|





