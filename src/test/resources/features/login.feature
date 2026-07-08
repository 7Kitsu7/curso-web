Feature: Realizar login

  @Login @HappyPath
  Scenario Outline: Login exitoso con credenciales válidas
    Given el usuario esta en la pagina de inicio
    When se loguea con el usuario "<username>" y contrasenia "<password>"
    Then se realiza el logeo de manera correcta

    Examples:
      | username | password |
      | giovaniprueba   | pass123prueba   |