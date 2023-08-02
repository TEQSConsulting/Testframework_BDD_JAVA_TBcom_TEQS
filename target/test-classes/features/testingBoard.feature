Feature: User visits the testing board website and can able to login with different users

  Scenario: Login functionality with User Parameterization


    Given "TEQS_TestUser1_Sub" visits the website
    When "TEQS_TestUser1_Sub" clicks Login/ Register button
    And "TEQS_TestUser1_Sub" sees the username and password box
    Then "TEQS_TestUser1_Sub" enters the username and password
    And "TEQS_TestUser1_Sub" clicks on AnmeldenButton
    Then Login/Register Button disappears

