#author: Sara Victoria Padilla

Feature: Terms and conditions of the trip
  As a user, I need see the Terms and conditions of the trip

  @manual-result:passed
    @PageTermsAndConditions
  Scenario Outline: View page Terms and conditions of the trip successful
    Given the user is in the main page
    And  he select the <option>
    When it scroll to the bottom of the page
    And select the <option2>
    Then you should see the page  <message>
    Examples:
      | option      | option2            | message                   |
      | attractions | Terms & conditions | Trip Terms and Conditions |


  @manual-result:passed
    @SaveTermsAndConditions
  Scenario Outline: save Trip Terms and Conditions successful
    Given the user is in the main page
    And  he select the <option>
    And it scroll to the bottom of the page
    And select the <option2>
    When he select the <button>
    And Choose where to download
    Then you should see the file in your pc
    Examples:
      | option      | option2            | button     |
      | attractions | Terms & conditions | Print/Save |