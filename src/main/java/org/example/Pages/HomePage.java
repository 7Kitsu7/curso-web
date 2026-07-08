package org.example.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {
    public static final Target BTN_SIGN_UP = Target.the("Botón para hacer el registro")
            .located(By.id("signin2"));

    public static final Target REGISTER = Target.the("Campo de registro")
            .located(By.id("sign-username"));

    public static final Target PASS_WORD = Target.the("Campo de contraseña")
            .located(By.id("sign-password"));

    public static final Target BTN_REGISTER = Target.the("Boton para registrar")
            .located(By.xpath("//button[text()='Sign up']"));
}
