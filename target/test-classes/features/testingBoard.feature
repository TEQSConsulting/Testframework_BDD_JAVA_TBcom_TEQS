Feature: User visits the testing board website and can able to login with different users

  Scenario: Login functionality with subscriber
  Given subscriber visits the website
    When subscriber clicks Login/ Register button
    And subscriber sees the username and password box
    Then subscriber enters the username and password
    And subscriber clicks on AnmeldenButton
    Then Login/Register Button disappears

