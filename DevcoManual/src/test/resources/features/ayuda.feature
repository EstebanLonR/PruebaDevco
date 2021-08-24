#language:es
Característica: Centro de ayuda
  como usuario requiero contactarme con el centro de ayuda

  @manual-result:passed
  @ContacHelp
  Escenario: Contactar con el centro de ayuda exitoso
    Dado que el usuario se encuentra en la pagina principal
    Cuando selecciona la opcion de centro de ayuda
    Y selecciona hacer una pregunta
    Y elige una categoria
    Entonces  podra ver la pagina para realizar la pregunta


  @manual-result:passed
  @ContacHelpWithoutLogging
  Escenario: Contactar con el centro de ayudas sin inciar sesion
    Dado  que el usuario se encuentra en la pagina principal
    Cuando selecciona la opcion de centro de ayuda
    Entonces Debera ver el mensaje de inicio se sesion

  @manual-result:passed
  @ContacHelpWithoutAccount
  Escenario: Solicitar ayuda sin estar registrado en la pagina
    Dado  que el usuario se encuentra en la pagina principal
    Y  selecciona la opcion de centro de ayuda
    Cuando ve el mensaje de continuar sin cuenta
    Entonces debera ver el mensaje de selecciona para mas detalles
