package org.example.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import org.example.Pages.CatalogoPage;

public class AgregarAlCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CatalogoPage.BTN_ADD_TO_CART)
        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        actor.attemptsTo(
                Switch.toAlert().andAccept()
        );
    }

    public static Performable delDetalle() {
        return new AgregarAlCarrito();
    }
}