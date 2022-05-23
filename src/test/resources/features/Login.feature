# language: es

Característica: Ingresar en la página
  Como un usuario
  Quiero Ingresar en la página www.abc.com
  Para acceder a la página

  @Logueo
  Escenario: Login exitoso Google
    Dado que un usuario ingresa a la web
    Cuando Ingresa diligencia toda la informacion
    Entonces generara mensaje de registro exitoso