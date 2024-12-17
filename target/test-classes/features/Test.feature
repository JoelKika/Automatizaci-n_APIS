Feature: test aseertion

  @TestAssertion
  Scenario Outline: PRUEBA DE LOGIN EXITOSO
    Given prueba de assertion
    When pruebo un servicio url "https://www.google.com.ec"
    When inicio sesion con "<usuario>" y "<password>"

    Examples:
      | usuario | password   | url         |
      | joel    | alex123    | nttdata.com |
      | monica  | egresadaqa | google.com  |