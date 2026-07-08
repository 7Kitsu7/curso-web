package org.example.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CatalogoPage {
    public static final Target LINK_PRODUCTO = Target.the("Enlace del producto {0}")
            .locatedBy("//a[text()='{0}']");

    public static final Target BTN_ADD_TO_CART = Target.the("Botón Add to Cart")
            .located(By.xpath("//a[text()='Add to cart']"));
}