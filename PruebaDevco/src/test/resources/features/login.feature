Feature: Login de usuario en Booking.com

  Scenario: Login Exitoso
    Given El usuario se encuentra en la pagina principal
    When El se loguea con los datos
      | email                     | password   |
      | capitaowasapnn1@gmail.com | 12345678uI |
    Then Debera ver su nombre en el login
