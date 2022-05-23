# language: es

Característica: Seleccionar Tipo de Entrega
  Como un usuario
  Quiero Ingresar en la página www.abc.com
  Para seleccionar Tipo de Entrega

  @Entrega
  Escenario: Seleccionar Tipo de Entrega
    Dado que un usuario ingresa a la web
    Cuando seleccione Tipo de Entrega
    Entonces generara mensaje de Seleccion Exitosa