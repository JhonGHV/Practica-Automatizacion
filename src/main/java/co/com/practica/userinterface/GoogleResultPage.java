package co.com.practica.userinterface;


import net.serenitybdd.annotations.At;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@At("https://www.google.com/search?q=automatizacion+de+software&sca_esv=7a12701d0fbd3cd4&source=hp&ei=psrLZbvYNJGsmtkPhpC68Ak&iflsig=ANes7DEAAAAAZcvYtg3IM-Ho7dVKcJzc14DzdI7TQgm8&oq=a&gs_lp=Egdnd3Mtd2l6IgFhKgIIADIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIWEC4YgAQYigUYQxixAxiDARjHARjRAzIKEAAYgAQYigUYQzILEAAYgAQYsQMYgwEyEBAuGIAEGIoFGEMYxwEY0QNIwNYMUMLLDFjCywxwAngAkAEAmAF_oAF_qgEDMC4xuAEDyAEA-AEBqAIKwgIdEAAYgAQYigUY5QIY5QIY6gIYtAIYigMYtwMY1AM&sclient=gws-wiz\"))\n")
public class GoogleResultPage extends PageObject {

    public static final Target TEXTO_RESULTADO = Target.the("Resultado de la busqueda").located(By.id("result-stats"));
}
