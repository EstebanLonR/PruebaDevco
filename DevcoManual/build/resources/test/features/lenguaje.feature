#language: es

Característica: Cambio de idioma
  Yo como usuario requiero cambiar le idioma de la pagina

  @manual-result:passed
  @ChangeLanguage
  Escenario: Cambio de lenguaje exitoso
    Dado que el usuario esta en la pagina principal
    Cuando cambia el lenguaje de español a ingles
    Entonces debera ver la pagina en ingles
