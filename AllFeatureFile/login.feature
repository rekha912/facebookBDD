Feature: Test Facebook PageFunctionality

  Scenario Outline: Test Facebook PageFunctionality
    Given User on Register Page of Facebook
    When User Enter "<firstname>" and "<lastname>" and "<username>" and "<password>"
    Then User Clickon create button

    Examples: 
      | firstname | lastname | username          | password   |
      | Rekha     | misal    | rekha@gmail.com   | rekha123   |
      | kavita    | misal    | kavita@gmail.com  | kavita123  |
      | krushana  | misal    | krushna@gmail.com | krushna123 |
      | sanavi    | palave   | sanavi@gmail.com  | sanavi123  |
      | vedika    | palave   | vedika@gmail.com  | vedika123  |
      | anvika    | chemate  | anvika@gmail.com  | anvika123  |
