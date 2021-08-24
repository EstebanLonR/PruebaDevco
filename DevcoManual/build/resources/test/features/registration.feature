#author: Sara Victoria Padilla

Feature: User register
  As a user, I need to register in booking.com

  @manual-result:passed
    @Register
  Scenario Outline: register succesful
    Given the user is in the main page
    When he enter the data for registration <email> and <password> and <confirmPassword>
    Then he should see the <message>
    Examples:
      | email               | password   | confirmPassword | message                                     |
      | pruebasq6@gmail.com | P1999*sara | P1999*sara      | Busca ofertas en hoteles, casas y mucho más |


  @manual-result:passed
    @RegisterEmailWrong
  Scenario Outline: register when the email its wrong
    Given the user is in the main page
    When he enter the data for registration <email>
    And the email is not correct
    Then he should see the <message>
    Examples:
      | email               | message                                                |
      | pruebasq6@gmail.com | Comprueba si el e-mail que has introducido es correcto |


  @manual-result:passed
    @RegisterPasswordDiferrent
  Scenario Outline: register when password is different
    Given the user is in the main page
    When he enter the data for registration <email>
    And the <password> and <confirmPassword> are different
    Then he should see the <message>
    Examples:
      | email               | password  | confirmPassword | message                                           |
      | pruebasq6@gmail.com | 12345678U | 12345678ui      | Las contraseñas no coinciden. Inténtalo de nuevo. |