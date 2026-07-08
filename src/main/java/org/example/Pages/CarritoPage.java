package org.example.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {
    public static final Target BTN_CART_MENU = Target.the("Botón Cart del menú")
            .located(By.id("cartur"));

    public static final Target PRODUCTO_EN_TABLA = Target.the("Producto {0} en el carrito")
            .locatedBy("//td[text()='{0}']");
}