#author: Sara Victoria Padilla

Feature: Subscribe to see secret offers
  As a user, I need to Subscribe for see secret offers


  @manual-result:passed
    @SubscribeSuccesful
  Scenario Outline: Subscribe successful
    Given the user is in the main page
    When he Subscribe  whi the <email>
    Then you should see the  <message>
    Examples:
      | email               | message                                                                       |
      | pruebas@yopmail.com | ¡Gracias! Te hemos enviado un e-mail para que puedas completar la suscripción |
