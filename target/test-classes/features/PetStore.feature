Feature: consultas mascotas swagger
  @Consult
  Scenario: Consulta mascota
    Given la url es "https://petstore.swagger.io/v2"
    When consulto la mascota con ID "12"
    Then valido el codigo de respuesta sea 200
    And valio el nombre de la mscota sea "Pitbull"

  @CrearMascota
  Scenario:
    Given la url es "https://petstore.swagger.io/v2"
    When creo nueva mascota con ID "77" nombre "Toby"  y estado "disponible"
    Then valido el codigo de respuesta sea 200
