package co.com.practica.userinterface;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.google.com/")


public class GoogleHomePage extends PageObject {

    public static final Target TEXTO_BUSQUEDA = Target.the("Texto de busqueda de informacion").located(By.id("APjFqb"));
    public static final Target BOTON_BUSQUEDA = Target.the("Botón de búsqueda de información en Google")
            .locatedBy("//input[@name='btnK' and @type='submit']");


}

