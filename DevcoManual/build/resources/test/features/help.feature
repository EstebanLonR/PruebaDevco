#author: Sara Victoria Padilla
Feature: help center
  As a user, I need to contact with the help center

  @manual-result:passed
    @ContacHelp
  Scenario Outline: contac help center succesfull
    Given the user is in the main page
    When he select the <option>
    And he select the option ask a question
    And he select the <category>
    Then you should see the  page for leave your question
    Examples:
      | option                    | category |
      | Contact costumer services | Taxis    |


  @manual-result:passed
    @ContacHelpWithoutLogging
  Scenario Outline: contact the help center without logging in
    Given the user is in the main page
    When he select the <option>
    Then you should see the message Sign In
    Examples:
      | option                    |
      | Contact costumer services |


  @manual-result:passed
    @ContacHelpWithoutAccount
  Scenario Outline: contact the help center without account
    Given the user is in the main page
    And he select the <option>
    When you select the <message>
    Then you shouls see the message Enter booking details
    Examples:
      | option                    | message                     |
      | Contact costumer services | continue without an account |