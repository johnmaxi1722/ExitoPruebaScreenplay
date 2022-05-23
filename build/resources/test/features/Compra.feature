# language: es

Característica: Comprar en la página
  Como un usuario
  Quiero Ingresar en la página www.abc.com
  Para comprar un producto de mi agrado

  @Logueo
  Escenario: Compra Exitosa
    Dado que un usuario ingresa a la web
    Cuando seleccione Articulo
    Entonces generara mensaje de compra exitosa