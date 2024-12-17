package com.nttdata.steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class PetStoreStep {
    private String URL_BASE;
    Response response;
    public void definirURL(String url) {
        URL_BASE = url;
    }

    public void crearPedido(String id, String petID, String quantity) {
        String body = "{\n" +
                "  \"id\": " + id + ",\n" +
                "  \"petId\": " + petID + ",\n" +
                "  \"quantity\": " + quantity + "\n" +
                "}";
        response = RestAssured
                .given()
                .baseUri(URL_BASE)
                .header("Content-Type", "application/json")
                .body(body)
                .log().all()
                .post("/store/order")
                .then()
                .log().all()
                .extract().response();
    }

    public void validacionRespuesta(int statuscode) {
        Assert.assertEquals("Validación de respuesta: ",statuscode, response.statusCode());

    }

    public void consultarPedido(String orderID) {
        response =  RestAssured
                .given()
                .baseUri(URL_BASE)
                .log().all()
                .get("/store/order/"+orderID)
                .then()
                .log().all()
                .extract().response();
    }
}
