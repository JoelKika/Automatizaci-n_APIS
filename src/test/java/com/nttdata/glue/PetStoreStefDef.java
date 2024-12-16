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
    @When("consulto la mascota con ID {string}")
    public void consultoLaMascotaConID(String idMascota) {
        tienda.consultarMacota(idMascota);

    }

    @Then("valido el codigo de respuesta sea {int}")
    public void validoElCodigoDeRespuestaSea(int statuscode) {
        tienda.validacionRespuesta(statuscode);
    }

    @And("valio el nombre de la mscota sea {string}")
    public void valioElNombreDeLaMscotaSea(String nombreMascota) {
        tienda.validarMascota(nombreMascota);
       // Assert.assertEquals("La mascota es: ",nombre, response."Pitbull");
    }
}
