#language: es

Característica: Realizar una búsqueda en Google
  Yo como usuario deseo ingresar a la pagina Google
  Para realizar una consulta sobre automatizacion de software


  Escenario: Búsqueda exitosa en Google
    Dado que estoy en la pagina de Google
    Cuando ingreso " automatización de software" en el campo de búsqueda
    Y presiono entrar
    Entonces debería ver los resultados de la búsqueda relacionados con "automatización de software"