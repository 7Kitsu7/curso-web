package org.example.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.Pages.HomePage;

public class RegistrarUsuario implements Task {
    private final String username;
    private final String password;

    public RegistrarUsuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(HomePage.BTN_SIGN_UP),
                Enter.theValue(username).into(HomePage.REGISTER),
                Enter.theValue(password).into(HomePage.PASS_WORD),
                Click.on(HomePage.BTN_REGISTER)
        );
    }
    public static Performable withData(String username, String password){
        return new RegistrarUsuario(username, password);
    }
}
