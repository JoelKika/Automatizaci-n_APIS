Feature: crear y consular pedidos
  @Crearpedido
  Scenario Outline: Creación de Order
    Given la url es "https://petstore.swagger.io/v2"
    When nuevo pedido con ID "<orderID>" pedID "<petID>"  y quantity "<quantity>"
    Then valido el codigo de respuesta sea 200
    Examples:
      |orderID  |petID|quantity|
      |10       |11   |12      |
      |12       |12   |13      |
      |14       |13   |15      |

  @Consulapedido
  Scenario Outline: Consulta de Order
    Given la url es "https://petstore.swagger.io/v2"
    When consulto la mascota con oderID "<orderID>"
    Then valido el codigo de respuesta sea 200
    Examples:
      |orderID|
      |10     |
      |12     |
      |14     |
