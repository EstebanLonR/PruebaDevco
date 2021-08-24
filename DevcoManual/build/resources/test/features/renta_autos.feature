#language: es

Característica: Renta de autos
  Como usuario, requiero rentar autos por la pagina web

  @manual-result:passed
    @RentACar
  Esquema del escenario: rentar un auto exitoso
    Dado que el usuario se encuentra en la pagina principal
    Y  selecciona la <opcion>
    Cuando selecciona el lugar de <recogida>
    Y selecciona la <fecha> de ida
    Y la fehca de <regreso>
    Entonces podras ver los diferentes resultados para elegir
    Ejemplos:
      | opcion      | recogida | fecha         | regreso       |
      | Car rentals | Medellin | Agust 24 2021 | Agust 31 2021 |


  @manual-result:passed
  @CRentAcardWithoutPikup
  Escenario: Rentar un auto sin seleccionar lugar de recogida
    Dado que el usuario se encuentra en la pagina principal
    Y selecciona la pagina de rentar autos
    Cuando busca resultados sin ingresar lugar de recogida
    Entonces podra ver el mensaje de Seleccione un lugar de recogida




