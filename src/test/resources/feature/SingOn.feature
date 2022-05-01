Feature: inicio de sesión en la tienda online

  Scenario: inicio de sesión mediante usuario y contraseña
    Given el usuario ha de introducir de forma correcta su usuario y su contraseña, que ha registrado previamente.
    When el usuario clica sobre el botón de iniciar sesión.
    Then el usuario puede iniciar sesión de forma correcta.