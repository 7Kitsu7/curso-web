package org.example.steepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.example.Pages.CarritoPage;
import org.example.Tasks.AgregarAlCarrito;
import org.example.Tasks.SeleccionarProducto;
import org.example.Tasks.VisualizarCarrito;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarProductoStepDefinition {

    @When("selecciona el producto {string}")
    public void seleccionaElProducto(String producto) {
        theActorInTheSpotlight().attemptsTo(SeleccionarProducto.llamado(producto));
    }

    @When("agrega el producto al carrito")
    public void agregaElProductoAlCarrito() {
        theActorInTheSpotlight().attemptsTo(AgregarAlCarrito.delDetalle());
    }

    @Then("deberia visualizar el producto {string} en el carrito")
    public void deberiaVisualizarElProductoEnElCarrito(String producto) {
        theActorInTheSpotlight().attemptsTo(VisualizarCarrito.deCompras());
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(CarritoPage.PRODUCTO_EN_TABLA.of(producto)).isDisplayed()
        );
    }
}