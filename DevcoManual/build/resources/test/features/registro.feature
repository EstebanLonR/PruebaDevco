#language:es
Característica: Registro de usuario
  Como usuario nuevo requiero registrarme en la pagina web

  @manual-result:passed
    @Register
  Esquema del escenario: : Registro exitoso
    Dado que el usuario esta en la pagina principal
    Cuando ingresa los datos para el registro <email> <contrasena> y confirmacion de <contrasena>
    Entonces debera ver el <mensaje>
    Ejemplos:
      | email                     | contrasena | mensaje                                     |
      | juanlondoruiz@yopmail.com | 13juan23   | Busca ofertas en hoteles, casas y mucho más |

  @manual-result:passed
  @RegisterPasswordDiferrent
  Escenario: Registro con contraseñas incorrectas
    Dado que el usuario esta en la pagina principal
    Cuando ingresa el email para el registro
    Y ingresa la contrasena y la confirmacion de contrasena incorrecta

    Entonces debera ver el mensaje Las contraseñas no coinciden. Inténtalo de nuevo.

  @manual-result:passed
  @RegisterEmailWrong
  Escenario: Registro con correo incorrecto
    Dado que el usuario esta en la pagina principal
    Cuando ingresa el email para el registro
    Y el email no es valido
    Entonces debera ver el mensaje de que el correo no es permitido



