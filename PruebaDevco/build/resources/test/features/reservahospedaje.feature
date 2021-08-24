Feature: Reserva Hospedaje

  Scenario: Reserva de alojamiento
    Given El usuario se encuentra en la pestania de alojamiento
    When El diligencia todos los campos para reservar el alojamiento
      | destino      | adultos | ninios | nombre         | apellido      | email                     | numero     | tipoTarjeta | numeroTarjeta    |
      | Eje Cafetero | 2       | 0      | Carlos Antonio | Velez Naranjo | capitaowasapnn1@gmail.com | 1122233344 | Visa        | 4148510107979729 |
    Then Debera ver el boton de Completar Reserva