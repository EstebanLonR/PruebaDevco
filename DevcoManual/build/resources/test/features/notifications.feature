#author: Sara Victoria Padilla

Feature: User notifications
  As a user, I need to register in booking.com

  @manual-result:passed
    @ViewUser
  Scenario Outline: View user notifications succesful
    Given the user is in the main page
    And he is log in
    When he select the <button>
    Then  you should see a pop-up window with your notifications
    Examples:
      | button       |
      | notification |