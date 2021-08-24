#language: es

Característica:  Terminos y condiciones
  Como usuario quiero conocer los terminos y condiciones

  @manual-result:passed
  @PageTermsAndConditions
  Escenario: Ver la pagina de terminos y condicones exitoso
    Dado que el usuario se encuentra en la parte inferior de la pagina principal
    Cuando selecciona la opcion terminos y condicones
    Entonces deberas ver la pagina Terminos y condiciones del viaje


  @manual-result:passed
  @SaveTermsAndConditions
  Escenario: Descarga de los terminos y condiciones exitoso
    Dado que el usuario se encuentra en la parte inferior de la pagina principal
    Cuando selecciona la opcion terminos y condicones
    Y selecciona la opcion descarga
    Entonces debera ver el archivo en su pc