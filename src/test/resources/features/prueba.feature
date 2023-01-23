#Autor: Andrea Villalobos
  #languaje: es

  @HistoriaDeUsuario
  Feature: :Verificar el ingreso correcto a la pagina saucedemo
  Yo como usuario quiero ingresar a la pagina saucedemo para verificar que tengo acceso a ella

  @Casoingreso
  Scenario:Verificar ingreso correcto
    Given que Andrea ingresa a la pagina saucedemo
    When digita sus credenciales e ingresa a la pagina
    Then verifica que pudo ingresar correctamente
