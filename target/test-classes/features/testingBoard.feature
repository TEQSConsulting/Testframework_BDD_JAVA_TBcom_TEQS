Feature: User visits the testing board website and can able to login with different users

  Scenario: Login functionality with subscriber
  Given subscriber visits the website "https://www.testing-board.com"
    When subscriber clicks Login/ Register button
    Then he sees the username and password box

