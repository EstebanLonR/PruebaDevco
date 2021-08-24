#author: Sara Victoria Padilla

Feature: Select Currency
  As a user, I need to change the corrency of the page booking

  @manual-result:passed
    @Currency
  Scenario Outline: Change currency successful
    Given the user is in the main page
    When he change the <currency>  for <newCurrency>
    Then you should see the  <newCurrency> selected
    Examples:
      | currency | newCurrency |
      | cop      | ske         |
