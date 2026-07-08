package org.example.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.example.Pages.CatalogoPage;

public class SeleccionarProducto implements Task {
    private final String nombreProducto;

    public SeleccionarProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        actor.attemptsTo(
                Click.on(CatalogoPage.LINK_PRODUCTO.of(nombreProducto))
        );
    }

    public static Performable llamado(String nombreProducto) {
        return new SeleccionarProducto(nombreProducto);
    }
}