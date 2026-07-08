package org.example.steepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Tasks.IniciarSesion;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    @When("se loguea con el usuario {string} y contrasenia {string}")
    public void seLogueaConElUsuarioYContrasenia(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.conCredenciales(usuario, password));
    }

    @Then("se realiza el logeo de manera correcta")
    public void seRealizaElLogeoDeManeraCorrecta() {
        System.out.println("Login ejecutado exitosamente.");
    }
}