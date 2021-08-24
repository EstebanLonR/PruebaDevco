#language:es

Característica: Subscribirse
  Como usuario quiero subscribirme para recibir ofertas exclusivas

  @manual-result:passed
  @SubscribeSuccesful
  Escenario: Subscripcion exitosa
    Dado que el usuario se encuentra en la pagina principal
    Cuando se suscribe con su email
    Entonces debera ver el mensaje ¡Gracias! Te hemos enviado un e-mail para que puedas completar la suscripción
