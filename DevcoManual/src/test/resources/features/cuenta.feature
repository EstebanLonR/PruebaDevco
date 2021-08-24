#language: es
Característica: Cuenta de usuario
  Como usuario, requiero manejar mi cuenta

  @manual-result:passed
    @ManageAccount
  Esquema del escenario: :  Manejo de cuenta exitoso
    Dado  que el usuari se encuentra en la pagina principal
    Y se loguea
    Cuando selecciona su <nombre>
    Y selecciona el <boton>
    Entonces  deberia ver las diferentes opciones para el manejor de la cuenta
    Ejemplos:

      | nombre        | boton          |
      | Carlos Castro | Manage account |