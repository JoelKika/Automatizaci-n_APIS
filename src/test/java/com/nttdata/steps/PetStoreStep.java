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

    public void consultarMacota(String idMascota) {
        response =  RestAssured
                .given()
                .relaxedHTTPSValidation()
                .baseUri(URL_BASE)
                .log().all()
                .get("/pet/"+idMascota)
                .then()
                .log().all()
                .extract().response();
    }

    public void validacionRespuesta(int statuscode) {
        Assert.assertEquals("Validación de respuesta: ",statuscode, response.statusCode());
        //System.out.println("Codigo de respuesta: "+response.statusCode());
    }

    public void validarMascota(String nombreMascota) {

    }
}
