

Feature: User Account
  As a user, I need to Manage  my account

  @manual-result:passed
    @ManageAccount
  Scenario Outline: Manage account succesful
    Given the user is in the main page
    And he is log in
    When he select his <Name>
    When he select the <button>
    Then Different options to manage your account
    Examples:
    | Name | button       |
   | Pruebas QA  | Manage account |