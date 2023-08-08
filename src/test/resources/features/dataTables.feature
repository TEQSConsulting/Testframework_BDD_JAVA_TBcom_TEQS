Feature: Examples of Cucumber data table implementations
  Scenario: List of fruits i like
    Then user should see fruits i like
      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |
    #to beautify the pipes above
  # control + alt + l