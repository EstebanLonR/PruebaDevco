#language: es

Característica: Notificaciones del usuario
  Como usuario requiero tener acceso a mis notificacioens

  @manual-result:passed
  @ViewUser
  Escenario: Notificaciones de usuario exitoso
    Dado que el usuario se encuentra logeado
    Cuando selecciona el boton de notificaciones
    Entonces Debera ver todo el historial de notificaciones