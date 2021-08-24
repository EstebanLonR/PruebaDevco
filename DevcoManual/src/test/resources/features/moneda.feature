#language:es

Característica: Seleccionar la moneda
  Como usuario requiero seleccionar una moneda diferente

  @manual-result:passed
    @Currency
  Esquema del escenario: Cambio de moneda exitoso
    Dado que el usuario se encuentra en la pagina principal
    Cuando  el cambia la mondeda <actual> por la <nuevaMoneda>
    Entonces podras ver que la nueva moneda fue seleccionada
    Ejemplos:
      | actual | nuevaMoneda |
      | cop    | ske         |
