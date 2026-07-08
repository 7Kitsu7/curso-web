Feature: Agregar producto al carrito

  @AgregarProducto @HappyPath
  Scenario Outline: Agregar un producto y visualizarlo en el carrito
    Given el usuario esta en la pagina de inicio
    And se loguea con el usuario "<username>" y contrasenia "<password>"
    When selecciona el producto "<producto>"
    And agrega el producto al carrito
    Then deberia visualizar el producto "<producto>" en el carrito

    Examples:
      | username | password | producto          |
      | giovaniprueba   | pass123prueba   | Samsung galaxy s6 |