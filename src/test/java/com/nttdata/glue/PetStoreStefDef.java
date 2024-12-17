package com.nttdata.glue;

import com.nttdata.steps.PetStoreStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class PetStoreStefDef {
    @Steps
    PetStoreStep tienda;

    @Given("la url es {string}")
    public void laUrlEs(String url) {
        tienda.definirURL(url);
    }


    @When("nuevo pedido con ID {string} pedID {string}  y quantity {string}")
    public void nuevoPedidoConIDPedIDYQuantity(String id, String petID, String quantity) {
        tienda.crearPedido(id, petID, quantity);
    }

    @Then("valido el codigo de respuesta sea {int}")
    public void validoElCodigoDeRespuestaSea(int statuscode) {
        tienda.validacionRespuesta(statuscode);
    }


    @When("consulto la mascota con oderID {string}")
    public void consultoLaMascotaConOderID(String orderID) {
        tienda.consultarPedido(orderID);
    }
}
