#author: Sara Victoria Padilla

Feature: Change Language
  As a user, I need to change the language

  @manual-result:passed
    @ChangeLanguage
  Scenario Outline: Change language succesful
    Given the user is in the main page
    When he change de <language> for <newLanguage>
    Then he should see the page in the <newLanguage>
    Examples:
      | language | newLanguage |
      | Español  | Polski      |
