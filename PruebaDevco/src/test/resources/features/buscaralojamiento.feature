Feature: Busqueda alojamiento

  Scenario: Buscar hotel sin login
    Given El usuario se encuentra en la pagina principal
    When Diligencia los campos de la busqueda
      | destino      | adultos | ninios | edadNinios |
      | Eje Cafetero | 3       | 1      | 4         |
    Then Debera ver el mensaje de alojamientos encontrados