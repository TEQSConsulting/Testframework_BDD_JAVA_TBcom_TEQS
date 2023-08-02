Feature: User visits the testing board website and can able to login with different users

  Scenario: Login functionality with User Parameterization


    Given "user" visits the website
    When "user" clicks Login/ Register button
    And "user" sees the username and password box
    Then "user" enters the username and password
    And "user" clicks on AnmeldenButton
    Then Login/Register Button disappears

