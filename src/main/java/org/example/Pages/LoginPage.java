package org.example.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target BTN_LOG_IN = Target.the("Botón para abrir login")
            .located(By.id("login2"));

    public static final Target USERNAME_FIELD = Target.the("Campo de usuario login")
            .located(By.id("loginusername"));

    public static final Target PASSWORD_FIELD = Target.the("Campo de contraseña login")
            .located(By.id("loginpassword"));

    public static final Target BTN_SUBMIT_LOGIN = Target.the("Botón para iniciar sesión")
            .located(By.xpath("//button[text()='Log in']"));
}