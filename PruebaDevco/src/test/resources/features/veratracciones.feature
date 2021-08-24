Feature: Busqueda de atracciones turisticas en booking

  Scenario: Busqueda Atraccionpor Tokyo

    Given El usuario se encuentra en la pagina principal
    When Realiza la busqueda de atracciones por la pagina
      | destino  | Tokyo, Tokyo-to |
    Then Debera ver el valor de la cotizacion